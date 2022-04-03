package sample.viewPackage.buildingView;

import javafx.scene.control.TitledPane;

import java.io.File;

public class ExtendsAccordion {

    private TitledPane titledPane;
    private File file;

    public ExtendsAccordion(TitledPane titledPane, File file) {
        this.titledPane = titledPane;
        this.file = file;
    }

    public void buildingExtendAcc(){
        System.out.println("Start Building new Accordion!");
    }
}
