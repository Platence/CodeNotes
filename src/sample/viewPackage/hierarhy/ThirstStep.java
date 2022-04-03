package sample.viewPackage.hierarhy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ThirstStep that = (ThirstStep) o;
        return Objects.equals(getSecondStep(), that.getSecondStep()) &&
                Objects.equals(getFolderContent(), that.getFolderContent());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getSecondStep(), getFolderContent());
    }
}
