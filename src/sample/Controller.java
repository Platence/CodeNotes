package sample;

import javafx.fxml.FXML;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.TextFlow;
import sample.viewPackage.buildingView.ThirstScrollPane;

public class Controller {

    @FXML
    Pane upPaneMenu;

    @FXML
    ScrollPane scrlPane_1_left;

    @FXML
    ScrollPane scrlPane_2_middle;

    @FXML
    TextFlow textFlowPane3;

    public void initialize(){
        System.out.println("Project start!");

        new ThirstScrollPane().initThirstLevelBSc(scrlPane_1_left,scrlPane_2_middle);
        // <- init thirst Panel
    }
}
