package sample.viewPackage.hierarhy.initFolderRead;

import sample.viewPackage.StaticAdress;
import sample.viewPackage.ViewerFolder;
import sample.viewPackage.hierarhy.SecondStep;
import sample.viewPackage.hierarhy.ThirstStep;

import java.io.File;
import java.util.List;

public class InitFoldersRead {

    public static void launcherGo(){
        List<File> list = new ViewerFolder().searchFolderThirstLevel(StaticAdress.pathToMainFolder);

        for (File f : list){
            ThirstStep thirstStep = new ThirstStep();
            List<File> list2 = new ViewerFolder().searchFolderThirstLevel(f.getAbsolutePath());
            SecondStep secondStep = new SecondStep();
            thirstStep.setFolderContent(f);
            //System.out.println(f.getName() + "names F1");
            for (File f2 : list2){
                secondStep.addPosition(f2);
               // System.out.println(f2.getName() + " names f2");
            }
            thirstStep.addPosition(thirstStep); // <- Add this in static List!
        }

        System.out.println("Successful read content...Wait");
    }
}
