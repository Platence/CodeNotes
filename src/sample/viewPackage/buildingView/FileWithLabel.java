package sample.viewPackage.buildingView;

import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;

public class FileWithLabel extends Label {

    private String pathE;

    public FileWithLabel(String text, String pathE) {
        super(text);
        this.pathE = pathE;
        setOnClick();
    }

    private void setOnClick(){
        super.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("File will be open soon");
                System.out.println("Path : " + pathE);
            }
        });
    }
}
