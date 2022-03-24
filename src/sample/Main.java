package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.viewPackage.ViewerFolder;
import sample.viewPackage.hierarhy.ContentFiles;
import sample.viewPackage.hierarhy.ContentFolder;
import sample.viewPackage.hierarhy.HighFolderContent;
import sample.viewPackage.hierarhy.SpecialAll;

import java.io.File;
import java.util.ArrayList;
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
        test();
        launch(args);
    }

    public static void test(){
        List<File> list = new ViewerFolder().searchFolderThirstLevel();
        List<SpecialAll> listALL = new ArrayList<>();
        for (File f : list){
            List<File> second = new ViewerFolder().searchFolderThirstLevel(f.getAbsolutePath());
            HighFolderContent hgc = new HighFolderContent(second);

            System.out.println(f.getName() + "MAIN");

            for (File z : second){
                List<File> folderListT = new ViewerFolder().searchFolderThirstLevel(z.getAbsolutePath());
                ContentFolder cf = new ContentFolder(folderListT);
                System.out.println(z.getName() + " Folder in ");

                for (File fff : folderListT){
                    List<File> listTxt = new ViewerFolder().thirdFolderThirstLevel(fff.getAbsolutePath());
                    ContentFiles cfiles = new ContentFiles(listTxt);
                }
            }
        }
    }
}
