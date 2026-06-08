package academy.devdojo.maratonajava.javacore.dconstrutores.test;

import academy.devdojo.maratonajava.javacore.dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Akuma Drive", "TV", 12, "Ação", "Production IG");
        anime.imprime();
    }
}
