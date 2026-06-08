package academy.devdojo.maratonajava.javacore.minterfaces.dominio;

public interface DataLoader {
    public abstract void load();
    public default void checkPermission(){
        System.out.println("Fazendo checagem de permissões");
    }
}
