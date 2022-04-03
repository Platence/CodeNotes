package sample.viewPackage.buildingView;

import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TitledPane;
import sample.viewPackage.hierarhy.ThirstStep;

import java.io.File;
import java.util.List;

public class SecondScrollPane {

    private ScrollPane scrlPane_2_middle;
    private ThirstStep thirstStep;

    public SecondScrollPane(ScrollPane scrlPane_2_middle, ThirstStep thirstStep) {
        this.scrlPane_2_middle = scrlPane_2_middle;
        this.thirstStep = thirstStep;
    }

    public void paintMiddlePaneSCR() {
        System.out.println("Method Middle Click!");
        List<File> list = thirstStep.getSecondStep().getFolders();
        getAccordion(list);
    }

    private void getAccordion(List<File> list) {
        Accordion ac = new Accordion();

        for (File f : list) {
            if (!f.isFile()) {
                ac.getPanes().add(getTitleFromFileName(f));
                System.out.println("Содержимое не является файлом, раскат Accordion");
                continue;
            }
            ac.getPanes().add(getFileLabel(f));
        }

        scrlPane_2_middle.setContent(ac);
    }

    private TitledPane getTitleFromFileName(File f) {
        TitledPane tl = new TitledPane();

        tl.setOnMouseClicked(e -> {
            new ExtendsAccordion(tl, f).buildingExtendAcc();
        });

        tl.setText(f.getName());
        return tl;
    }

    private TitledPane getFileLabel(File f) {
        TitledPane tlLabel = new TitledPane();
        tlLabel.setText("Content");
        tlLabel.setContent(new FileWithLabel(f.getName(), f.getAbsolutePath()));
        return tlLabel;
    }
}
