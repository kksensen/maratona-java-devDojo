package academy.devdojo.maratonajava.javacore.npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoProduto(Produto produto){
        System.out.println("Relatório de imposto do Produto:");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: "+ produto.getNome());
        System.out.println("Valor "+ produto.getValor());
        System.out.println("Imposto a ser pago "+ imposto);
    }

}
