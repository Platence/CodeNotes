package sample.viewPackage.buildingView;


import javafx.application.Platform;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import sample.viewPackage.hierarhy.ThirstStep;

import java.util.ArrayList;
import java.util.List;

public class ThirstScrollPane {

    public void initThirstLevelBSc(ScrollPane pane1){
        Accordion ac = new Accordion();
        List<ThirstStep> l1 = new ThirstStep().getAllList();
        List<TitledPane> listTP = new ArrayList<>();

        for (ThirstStep thirstStep : l1){
            TitledPane tp = new TitledPane();
            Label label = new Label(thirstStep.getFolderContent().getName());
            tp.setContent(label);
            listTP.add(tp);
        }

        addAll(pane1,ac,listTP);
    }

    private void addAll(ScrollPane pane1,Accordion ac,List<TitledPane> listTP){

        for (TitledPane panes : listTP){
            ac.getPanes().add(panes);
            ac.setExpandedPane(panes);
        }

        Platform.runLater(()->{
            pane1.setContent(ac);
        });


    }
}
