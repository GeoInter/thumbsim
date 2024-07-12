package thb.fbi.leguan.instructions;

import java.util.Formatter;
import java.util.TreeSet;

import thb.fbi.leguan.simulation.FlagRegister;
import thb.fbi.leguan.simulation.Memory;
import thb.fbi.leguan.simulation.PCRegister;
import thb.fbi.leguan.simulation.Register;
import thb.fbi.leguan.simulation.Simulator;
import thb.fbi.leguan.simulation.SimulatorSingleton;

/**
 * List of usable LEGv8 Instructions.
 */
public class InstructionSet {
    /** unique List of all usable instructions */
    private TreeSet<Instruction> instructionSet;

    public InstructionSet() {
        instructionSet = new TreeSet<Instruction>();
    }

    public void populate() {

        instructionSet.add(
                new ArithmeticInstruction("NULL",
                        "it is just empty",
                        new IArithmeticCode() {
                            @Override
                            public void simulate(Register Rm, int shamt, Register Rn, Register Rd) {
                                System.out.println("I'm Error - nice to meet you");
                            }
                        }));

        //// Core Instruction Set ////

        instructionSet.add(
                new ArithmeticInstruction("ADD",
                        "Adds value of Registers Rm and Rn and puts result in Rd without flags",
                        new IArithmeticCode() {
                            @Override
                            public void simulate(Register Rm, int shamt, Register Rn, Register Rd) {
                                // simple addition
                                long op1 = Rm.getValue();
                                long op2 = Rn.getValue();
                                long result = op1 + op2;
                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new ImmediateInstruction("ADDI",
                        "Adds value of Registers Rm and a constant and puts result in Rd without flags",
                        new IImmediateCode() {
                            @Override
                            public void simulate(int alu_immediate, Register Rn, Register Rd) {
                                long op1 = Rn.getValue();
                                long result = op1 + alu_immediate;
                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new ImmediateInstruction("ADDIS",
                        "Adds value of Registers Rm and a constant and puts result in Rd with flags",
                        new IImmediateCode() {
                            @Override
                            public void simulate(int alu_immediate, Register Rn, Register Rd) {
                                long op1 = Rn.getValue();
                                long result = op1 + alu_immediate;

                                FlagRegister.setAllFlags(op1, alu_immediate, result);

                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new ArithmeticInstruction("ADDS",
                        "Adds value of Registers Rm and Rn and puts result in Rd with flags",
                        new IArithmeticCode() {
                            @Override
                            public void simulate(Register Rm, int shamt, Register Rn, Register Rd) {
                                // simple addition
                                long op1 = Rm.getValue();
                                long op2 = Rn.getValue();
                                long result = op1 + op2;

                                FlagRegister.setAllFlags(op1, op2, result);

                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new ArithmeticInstruction("AND",
                        "AND",
                        new IArithmeticCode() {
                            @Override
                            public void simulate(Register Rm, int shamt, Register Rn, Register Rd) {
                                long op1 = Rm.getValue();
                                long op2 = Rn.getValue();
                                long result = op1 & op2;

                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new ImmediateInstruction("ANDI",
                        "AND Immediate",
                        new IImmediateCode() {
                            @Override
                            public void simulate(int alu_immediate, Register Rn, Register Rd) {
                                long op1 = Rn.getValue();
                                long result = op1 & alu_immediate;

                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new ImmediateInstruction("ANDIS",
                        "AND Immediate and Flags",
                        new IImmediateCode() {
                            @Override
                            public void simulate(int alu_immediate, Register Rn, Register Rd) {
                                long op1 = Rn.getValue();
                                long result = op1 & alu_immediate;

                                FlagRegister.setAllFlags(op1, alu_immediate, result);

                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new ArithmeticInstruction("ANDS",
                        "AND with Flags",
                        new IArithmeticCode() {
                            @Override
                            public void simulate(Register Rm, int shamt, Register Rn, Register Rd) {
                                long op1 = Rm.getValue();
                                long op2 = Rn.getValue();
                                long result = op1 & op2;

                                FlagRegister.setAllFlags(op1, op2, result);

                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new BranchInstruction("B",
                        "Branch",
                        new IBranchCode() {
                            @Override
                            public void simulate(int br_address, PCRegister pc) {
                                pc.setValue(br_address);
                            }
                        }));

        instructionSet.add(
                new BranchInstruction("B.EQ",
                        "Branch Signed Equals",
                        new IBranchCode() {
                            @Override
                            public void simulate(int br_address, PCRegister pc) {
                                // test Z == 1
                                if (FlagRegister.getZFlag()) {
                                    pc.setValue(br_address);
                                } else {
                                    pc.increase();
                                }
                            }
                        }));

        instructionSet.add(
                new BranchInstruction("B.NE",
                        "Branch Signed Not Equals",
                        new IBranchCode() {
                            @Override
                            public void simulate(int br_address, PCRegister pc) {
                                // test Z == 0
                                if (!FlagRegister.getZFlag()) {
                                    pc.setValue(br_address);
                                } else {
                                    pc.increase();
                                }
                            }
                        }));

        instructionSet.add(
                new BranchInstruction("B.LT",
                        "Branch Signed Less Than",
                        new IBranchCode() {
                            @Override
                            public void simulate(int br_address, PCRegister pc) {
                                // test N != V
                                if (FlagRegister.getNFlag() != FlagRegister.getVFlag()) {
                                    pc.setValue(br_address);
                                } else {
                                    pc.increase();
                                }
                            }
                        }));

        instructionSet.add(
                new BranchInstruction("B.LE",
                        "Branch Signed Less Equals",
                        new IBranchCode() {
                            @Override
                            public void simulate(int br_address, PCRegister pc) {
                                // test ! (Z == 0 && N == V)
                                if (!(!FlagRegister.getZFlag() && FlagRegister.getNFlag() == FlagRegister.getVFlag())) {
                                    pc.setValue(br_address);
                                } else {
                                    pc.increase();
                                }
                            }
                        }));

        instructionSet.add(
                new BranchInstruction("B.GT",
                        "Branch Signed Greater Than",
                        new IBranchCode() {
                            @Override
                            public void simulate(int br_address, PCRegister pc) {
                                // test (Z == 0 && N == V)
                                if (!FlagRegister.getZFlag() && FlagRegister.getNFlag() == FlagRegister.getVFlag()) {
                                    pc.setValue(br_address);
                                } else {
                                    pc.increase();
                                }
                            }
                        }));

        instructionSet.add(
                new BranchInstruction("B.GE",
                        "Branch Signed Greater Equals",
                        new IBranchCode() {
                            @Override
                            public void simulate(int br_address, PCRegister pc) {
                                // test N == V
                                if (FlagRegister.getNFlag() == FlagRegister.getVFlag()) {
                                    pc.setValue(br_address);
                                } else {
                                    pc.increase();
                                }
                            }
                        }));

        instructionSet.add(
                new BranchInstruction("B.MI",
                        "Branch on Minus",
                        new IBranchCode() {
                            @Override
                            public void simulate(int br_address, PCRegister pc) {
                                // test N == 1
                                if (FlagRegister.getNFlag()) {
                                    pc.setValue(br_address);
                                } else {
                                    pc.increase();
                                }
                            }
                        }));

        instructionSet.add(
                new BranchInstruction("B.PL",
                        "Branch on Plus",
                        new IBranchCode() {
                            @Override
                            public void simulate(int br_address, PCRegister pc) {
                                // test N == 0
                                if (!FlagRegister.getNFlag()) {
                                    pc.setValue(br_address);
                                } else {
                                    pc.increase();
                                }
                            }
                        }));

        instructionSet.add(
                new BranchInstruction("B.VS",
                        "Branch on Overflow set",
                        new IBranchCode() {
                            @Override
                            public void simulate(int br_address, PCRegister pc) {
                                // test V == 1
                                if (FlagRegister.getVFlag()) {
                                    pc.setValue(br_address);
                                } else {
                                    pc.increase();
                                }
                            }
                        }));

        instructionSet.add(
                new BranchInstruction("B.VC",
                        "Branch on Overflow clear",
                        new IBranchCode() {
                            @Override
                            public void simulate(int br_address, PCRegister pc) {
                                // test V == 0
                                if (!FlagRegister.getVFlag()) {
                                    pc.setValue(br_address);
                                } else {
                                    pc.increase();
                                }
                            }
                        }));

        instructionSet.add(
            new BranchInstruction("BL",
                    "Branch with Link",
                    new IBranchCode() {
                        @Override
                        public void simulate(int br_address, PCRegister pc) {
                            Simulator simulator = SimulatorSingleton.getSimulator();
                            Register R30 = simulator.getRegisters()[30];
                            R30.setValue((pc.getValue() + 1) * 4); // internal pc value is not multiplied by 4
                            pc.setValue(br_address);
                        }
                    }));

        instructionSet.add(
                new ConditionalBranchInstruction("BR",
                        "Branch to register",
                        new IConditionalBranchCode() {
                            @Override
                            public void simulate(int cond_br_address, Register Rt, PCRegister pc) {
                                long address = Rt.getValue();
                                address /= 4; // pc shows multiple of 4, but internally uses one quarter of shownValue
                                pc.setValue(address);
                            }
                        }));

        instructionSet.add(
                new ConditionalBranchInstruction("CBNZ",
                        "Compare and Branch if not Zero",
                        new IConditionalBranchCode() {
                            @Override
                            public void simulate(int cond_br_address, Register Rt, PCRegister pc) {
                                long op = Rt.getValue();
                                if (op != 0) {
                                    pc.setValue(cond_br_address);
                                } else {
                                    pc.increase();
                                }
                            }
                        }));

        instructionSet.add(
                new ConditionalBranchInstruction("CBZ",
                        "Compare and Branch if Zero",
                        new IConditionalBranchCode() {
                            @Override
                            public void simulate(int cond_br_address, Register Rt, PCRegister pc) {
                                long op = Rt.getValue();
                                if (op == 0) {
                                    pc.setValue(cond_br_address);
                                } else {
                                    pc.increase();
                                }
                            }
                        }));

        instructionSet.add(
                new ArithmeticInstruction("EOR",
                        "Exclusive OR between two Registers",
                        new IArithmeticCode() {
                            @Override
                            public void simulate(Register Rm, int shamt, Register Rn, Register Rd) {
                                long op1 = Rm.getValue();
                                long op2 = Rn.getValue();
                                long result = op1 ^ op2; // equals !=

                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new ImmediateInstruction("EORI",
                        "Exclusive OR between Register and Immediate",
                        new IImmediateCode() {
                            @Override
                            public void simulate(int alu_immediate, Register Rn, Register Rd) {
                                long op1 = Rn.getValue();
                                long result = op1 ^ alu_immediate; // equals !=

                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new DataTransferInstruction("LDUR",
                        "Load a double word from memory to register",
                        new IDataTransferCode() {
                            @Override
                            public void simulate(long dt_address, Register Rn, Register Rt) {
                                long op1 = Rn.getValue();
                                long address = op1 + dt_address;
                                long value = Memory.loadDWord(address);
                                Rt.setValue(value);
                            }
                        }));

        instructionSet.add(
                new DataTransferInstruction("LDURB",
                        "Load a Byte from memory to register",
                        new IDataTransferCode() {
                            @Override
                            public void simulate(long dt_address, Register Rn, Register Rt) {
                                long op1 = Rn.getValue();
                                long address = op1 + dt_address;
                                long value = Memory.loadByte(address);
                                Rt.setValue(value);
                            }
                        }));

        instructionSet.add(
                new DataTransferInstruction("LDURH",
                        "Load a half word from memory to register",
                        new IDataTransferCode() {
                            @Override
                            public void simulate(long dt_address, Register Rn, Register Rt) {
                                long op1 = Rn.getValue();
                                long address = op1 + dt_address;
                                long value = Memory.loadHalfword(address);
                                Rt.setValue(value);
                            }
                        }));

        instructionSet.add(
                new DataTransferInstruction("LDURSW",
                        "Load a word from memory to register",
                        new IDataTransferCode() {
                            @Override
                            public void simulate(long dt_address, Register Rn, Register Rt) {
                                long op1 = Rn.getValue();
                                long address = op1 + dt_address;
                                long value = Memory.loadWord(address);
                                Rt.setValue(value);
                            }
                        }));

        instructionSet.add(
                new DataTransferInstruction("LDXR",
                        "Exclusive load a word from memory to register",
                        new IDataTransferCode() {
                            @Override
                            public void simulate(long dt_address, Register Rn, Register Rt) {
                                long op1 = Rn.getValue();
                                long address = op1 + dt_address;
                                long value = Memory.loadExclusive(address);
                                Rt.setValue(value);
                            }
                        }));

        instructionSet.add(
                new ArithmeticInstruction("LSL",
                        "Logical Shift Left",
                        new IArithmeticCode() {
                            @Override
                            public void simulate(Register Rm, int shamt, Register Rn, Register Rd) {
                                long op1 = Rn.getValue();
                                long result = op1 << shamt;

                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new ArithmeticInstruction("LSR",
                        "Logical Shift Right",
                        new IArithmeticCode() {
                            @Override
                            public void simulate(Register Rm, int shamt, Register Rn, Register Rd) {
                                long op1 = Rn.getValue();
                                long result = op1 >>> shamt; // unsigned shift = shifts a zero into the leftmost
                                                             // position

                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new WideImmediateInstruction("MOVK",
                        "Move wide with keep",
                        new IWideImmediateCode() {
                            @Override
                            public void simulate(Register Rd, long immediate, int shamt) {
                                long oldValue = Rd.getValue();
                                long result = immediate << shamt;
                                result += oldValue;
                                
                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new WideImmediateInstruction("MOVZ",
                        "Move wide with zeroes",
                        new IWideImmediateCode() {
                            @Override
                            public void simulate(Register Rd, long immediate, int shamt) {
                                long result = immediate << shamt;

                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new ArithmeticInstruction("ORR",
                        "Inclusive OR between two Registers",
                        new IArithmeticCode() {
                            @Override
                            public void simulate(Register Rm, int shamt, Register Rn, Register Rd) {
                                long op1 = Rm.getValue();
                                long op2 = Rn.getValue();
                                long result = op1 | op2;

                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new ImmediateInstruction("ORRI",
                        "Inclusive OR between Register and Immediate",
                        new IImmediateCode() {
                            @Override
                            public void simulate(int alu_immediate, Register Rn, Register Rd) {
                                long op1 = Rn.getValue();
                                long result = op1 | alu_immediate;

                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new DataTransferInstruction("STUR",
                        "Store a double word from register into memory",
                        new IDataTransferCode() {
                            @Override
                            public void simulate(long dt_address, Register Rn, Register Rt) {
                                long value = Rt.getValue();
                                long op1 = Rn.getValue();
                                long address = op1 + dt_address;
                                Memory.storeDWord(address, value);
                            }
                        }));

        instructionSet.add(
                new DataTransferInstruction("STURB",
                        "Store a Byte from register into memory",
                        new IDataTransferCode() {
                            @Override
                            public void simulate(long dt_address, Register Rn, Register Rt) {
                                byte value = (byte) Rt.getValue();
                                long op1 = Rn.getValue();
                                long address = op1 + dt_address;
                                Memory.storeByte(address, value);
                            }
                        }));

        instructionSet.add(
                new DataTransferInstruction("STURH",
                        "Store a half word from register into memory",
                        new IDataTransferCode() {
                            @Override
                            public void simulate(long dt_address, Register Rn, Register Rt) {
                                short value = (short) Rt.getValue();
                                long op1 = Rn.getValue();
                                long address = op1 + dt_address;
                                Memory.storeHalfword(address, value);
                            }
                        }));

        instructionSet.add(
                new DataTransferInstruction("STURW",
                        "Store a word from register into memory",
                        new IDataTransferCode() {
                            @Override
                            public void simulate(long dt_address, Register Rn, Register Rt) {
                                int value = (int) Rt.getValue();
                                long op1 = Rn.getValue();
                                long address = op1 + dt_address;
                                Memory.storeWord(address, value);
                            }
                        }));

        instructionSet.add(
                new ArithmeticInstruction("STXR",
                        "Exclusive Store a word from register into memory",
                        new IArithmeticCode() {
                            @Override
                            public void simulate(Register Rm, int shamt, Register Rn, Register Rd) {
                                int value = (int) Rd.getValue();
                                if (Memory.storeExclusive(Rm.getValue(), value)) {
                                    Rn.setValue(0);
                                } else {
                                    Rn.setValue(1);
                                }
                            }
                        }));

        instructionSet.add(
                new ArithmeticInstruction("SUB",
                        "Subtracts value of Registers Rm and Rn and puts result in Rd without flags",
                        new IArithmeticCode() {
                            @Override
                            public void simulate(Register Rm, int shamt, Register Rn, Register Rd) {
                                // simple subtraction
                                long op1 = Rn.getValue();
                                long op2 = Rm.getValue();
                                Rd.setValue(op1 - op2);
                            }
                        }));

        instructionSet.add(
                new ImmediateInstruction("SUBI",
                        "Subtracts value of Registers Rm and a constant and puts result in Rd without flags",
                        new IImmediateCode() {
                            @Override
                            public void simulate(int alu_immediate, Register Rn, Register Rd) {
                                long op1 = Rn.getValue();
                                long result = op1 - alu_immediate;
                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new ImmediateInstruction("SUBIS",
                        "Subtracts value of Registers Rm and a constant and puts result in Rd without flags",
                        new IImmediateCode() {
                            @Override
                            public void simulate(int alu_immediate, Register Rn, Register Rd) {
                                long op1 = Rn.getValue();
                                long result = op1 - alu_immediate;

                                FlagRegister.setAllFlags(op1, -1 * alu_immediate, result); // the only difference to
                                                                                           // ADDS

                                Rd.setValue(result);
                            }
                        }));

        instructionSet.add(
                new ArithmeticInstruction("SUBS",
                        "Subtracts value of Registers Rm and Rn and puts result in Rd with flags",
                        new IArithmeticCode() {
                            @Override
                            public void simulate(Register Rm, int shamt, Register Rn, Register Rd) {
                                // simple subtraction
                                long op1 = Rn.getValue();
                                long op2 = Rm.getValue();
                                long result = op1 - op2;

                                FlagRegister.setAllFlags(op1, -1 * op2, result); // the only difference to ADDS

                                Rd.setValue(result);
                            }
                        }));

        //// Other Instructions ////

        instructionSet.add(
                new DataTransferInstruction("LDR",
                        "Loads a program-relative or register-relative address into a register",
                        new IDataTransferCode() {
                            @Override
                            public void simulate(long dt_address, Register Rn, Register Rt) {
                                Rt.setValue(dt_address);
                            }
                        }));
    }

    public Instruction findInstructionByMnemonic(String mnemonic) {
        for (Instruction instruction : instructionSet) {
            if (instruction.getMnemonic().equalsIgnoreCase(mnemonic)) {
                return instruction;
            }
        }
        return null;
    }

    public String toString() {
        if (instructionSet == null)
            return null;

        // int LEGv8InstrNr = 36;
        try (Formatter formatter = new Formatter()) {
            // formatter.format("\nSize: %d / %d\n\n", instructionSet.size(), LEGv8InstrNr);
            formatter.format("%-15s %-30s %-15s\n", "Name", "Format", "Description");
            for (Instruction ins : instructionSet) {
                formatter.format("%-7s %-30s %-60s\n", ins.getMnemonic(), ins.getClass().getSimpleName(),
                        ins.getDescription());
            }
            return formatter.toString();
        }
    }

}
