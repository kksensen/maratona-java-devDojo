package academy.devdojo.maratonajava.javacore.npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.npolimorfismo.servico.CalculadoraImposto;

public class CalcularImpostoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC0I7", 10000);
        Tomate tomate = new Tomate("Tomate italiano", 10);
        Televisao televisao = new Televisao("Samsung 50\"", 5000);

        CalculadoraImposto.calcularImpostoProduto(computador);
        System.out.println("-------------------------------");
        CalculadoraImposto.calcularImpostoProduto(tomate);
        System.out.println("-------------------------------");
        CalculadoraImposto.calcularImpostoProduto(televisao);

    }
}
