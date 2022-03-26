package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.viewPackage.StaticAdress;
import sample.viewPackage.ViewerFolder;
import sample.viewPackage.hierarhy.SecondStep;
import sample.viewPackage.hierarhy.ThirstStep;
import sample.viewPackage.hierarhy.initFolderRead.InitFoldersRead;

import java.io.File;
import java.util.List;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Code Notes");
        primaryStage.setScene(new Scene(root, 1000, 700));
        primaryStage.show();
    }


    public static void main(String[] args) {
        InitFoldersRead.launcherGo();
        launch(args);
    }


}
