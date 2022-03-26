package sample.viewPackage.hierarhy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class SecondStep {
    private List<File> folders = new ArrayList<>();

    public SecondStep() {
    }

    public List<File> getFolders() {
        return folders;
    }

    public boolean addPosition(File file){
        folders.add(file);
        return true;
    }
}
