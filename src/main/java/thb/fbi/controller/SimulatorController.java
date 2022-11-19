package thb.fbi.controller;

import java.util.ArrayList;
import java.util.Locale;

import org.fxmisc.richtext.CodeArea;

import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import thb.fbi.simulation.FlagRegister;
import thb.fbi.simulation.Memory;
import thb.fbi.simulation.Simulator;
import thb.fbi.simulation.SimulatorSingleton;
import thb.fbi.utility.I18N;

/**
 * UI Controller of the app
 * includes all UI controls
 * 
 */
public class SimulatorController {

    @FXML RegisterPaneController registerPaneController;
    @FXML Parent registerPane;

    @FXML StackPane codeStackPane;
    @FXML SplitPane splitPane;
    @FXML SplitPane textSplitpane;
    @FXML AnchorPane rightSideAnchorPane;
    @FXML TabPane tabPane;
    @FXML ScrollPane codeScrollPane;
    @FXML CodeArea codeArea;
    @FXML TextArea console;

    @FXML Menu file_Menu;

    @FXML MenuItem switchENButton;
    @FXML MenuItem switchDEButton;
    @FXML MenuItem lightThemeItem;
    @FXML MenuItem darkThemeItem;

    Simulator simulator = SimulatorSingleton.getSimulator();

    @FXML
    public void initialize() {
        codeArea.prefHeightProperty().bind(codeScrollPane.heightProperty()); 
        codeArea.prefWidthProperty().bind(codeScrollPane.widthProperty().subtract(15)); // size of scrollbar

        // prevent rightside to resize (change divider position) when maximazing
        SplitPane.setResizableWithParent(rightSideAnchorPane, false);

        // tabs fill header of tabPane
        // BUG: Switching Tabs (which are filling the tabPane) leaves empty extra space at right side; subtract 20 to prevent
        tabPane.tabMaxWidthProperty().bind((rightSideAnchorPane.widthProperty().divide(tabPane.getTabs().size())).subtract(20));
        tabPane.tabMinWidthProperty().bind((rightSideAnchorPane.widthProperty().divide(tabPane.getTabs().size())).subtract(20));

        switchENButton.setOnAction((evt) -> switchLanguage(Locale.ENGLISH));
        switchDEButton.setOnAction((evt) -> switchLanguage(Locale.GERMAN));

        lightThemeItem.setOnAction((evt) -> switchStylesheets("light.css"));
        darkThemeItem.setOnAction((evt) -> switchStylesheets("dark.css"));

        // file_Menu.textProperty().bind(I18N.createStringBinding("menubar.File"));
    }

    @FXML
    private void runCode() {
        //simulator.testASCIIInMemory();
        setConsoleText(simulator.run(codeArea.getText()));
    }

    /**
     * resets the simulator including memory and flags
     */
    @FXML
    private void reset() {
        Memory.reset();
        FlagRegister.reset();
        simulator.reset();
        setConsoleText(null);
    }

    @FXML
    private void stepForward() {
        simulator.forwardStep(codeArea.getText());
    }

    @FXML
    private void stepBackward() {
        System.out.println("step backward");
    }   

    /**
     * sets the text of the console text area
     */
    private void setConsoleText(ArrayList<String> text) {
        if(text != null) {
            console.setText(text.toString());
        } else {
            console.setText(null);
        }   
    }
    
    /**
     * sets the given Locale in the I18N class
     * @param locale the new local to set
     */
    private void switchLanguage(Locale locale) {
        I18N.setLocale(locale);
    }

    /**
     * switches to a stylesheet
     * @param css name of the css file to use
     */
    public void switchStylesheets(String css) {
        Scene scene = registerPane.getScene();
        scene.getStylesheets().remove(1); // remove except for base
        scene.getStylesheets().add(this.getClass().getResource("/thb/fbi/css/" + css).toExternalForm());
    }
}
