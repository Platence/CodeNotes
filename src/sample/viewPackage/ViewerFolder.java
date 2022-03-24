package sample.viewPackage;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class ViewerFolder {

    public List<File> searchFolderThirstLevel() {
        File dir = new File(StaticAdress.pathToMainFolder); // вход
        List<File> lst = new ArrayList<>();
        for (File file : dir.listFiles()) {
            if(file.isDirectory()){
                lst.add(file);
                System.out.println("Folder contains : " + file.getName());
            }
        }

        // Первичный обход всех папок

        return lst;
    }

    public List<File> searchFolderThirstLevel(String path) {
        File dir = new File(path); // вход
        List<File> lst = new ArrayList<>();
        for (File file : dir.listFiles()) { // <- Возвращает папки
            if(file.isDirectory()){
                lst.add(file);
                System.out.println("Folder contains : " + file.getName());
            }
        }

        // Вторичный обход всех папок
        return lst;
    }

    public List<File> thirdFolderThirstLevel(String path) {
        File dir = new File(path); // вход
        List<File> lst = new ArrayList<>();
        for (File file : dir.listFiles()) { // <- Возвращает файлы
            if(file.isFile()){
                lst.add(file);
                System.out.println("Folder contains : " + file.getName());
            }
        }

        // Возвращает файлы txt обход всех папок
        return lst;
    }

}
