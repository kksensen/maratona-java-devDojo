package academy.devdojo.maratonajava.javacore.gassociacao.test;

import academy.devdojo.maratonajava.javacore.gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.gassociacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Hulk");
        Time time = new Time("Atlético MG");

        jogador1.setTime(time);
        jogador1.imprime();
    }
}
