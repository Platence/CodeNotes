package sample.viewPackage.hierarhy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ThirstStep {

    private SecondStep secondStep;
    private File folderContent;

    private static List<ThirstStep> listFolders = new ArrayList<>();


    public ThirstStep() {
    }

    public SecondStep getSecondStep() {
        return secondStep;
    }

    public void setSecondStep(SecondStep secondStep) {
        this.secondStep = secondStep;
    }

    public File getFolderContent() {
        return folderContent;
    }

    public void setFolderContent(File folderContent) {
        this.folderContent = folderContent;
    }

    public boolean addPosition(ThirstStep e){
        listFolders.add(e);
        return true;
    }

    public List<ThirstStep> getAllList(){
        return listFolders;
    }

    public boolean clearList(){
        listFolders.clear();
        return true;
    }
}
