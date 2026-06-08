package academy.devdojo.maratonajava.javacore.minterfaces.test;

import academy.devdojo.maratonajava.javacore.minterfaces.dominio.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();
        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.checkPermission();
        fileLoader.checkPermission();
    }
}
