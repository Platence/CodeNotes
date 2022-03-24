package sample.viewPackage.hierarhy;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ContentFiles {

    private List<File> filesTxt = new ArrayList<>();

    public ContentFiles(List<File> filesTxt) {
        this.filesTxt = filesTxt;
    }

    public List<File> getFilesTxt() {
        return filesTxt;
    }

    public void setFilesTxt(List<File> filesTxt) {
        this.filesTxt = filesTxt;
    }
}
