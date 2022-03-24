package sample.viewPackage.hierarhy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ContentFolder {
    private List<File> listFolder = new ArrayList<>();

    public ContentFolder(List<File> listFolder) {
        this.listFolder = listFolder;
    }

    public List<File> getListFolder() {
        return listFolder;
    }

    public void setListFolder(List<File> listFolder) {
        this.listFolder = listFolder;
    }
}
