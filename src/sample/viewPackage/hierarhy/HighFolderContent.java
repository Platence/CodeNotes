package sample.viewPackage.hierarhy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class HighFolderContent {

    private List<File> listStartsearch = new ArrayList<>();
    private ContentFolder contentFolder;

    public HighFolderContent(List<File> listStartsearch) {
        this.listStartsearch = listStartsearch;
    }

    public List<File> getListStartsearch() {
        return listStartsearch;
    }

    public void setListStartsearch(List<File> listStartsearch) {
        this.listStartsearch = listStartsearch;
    }
}
