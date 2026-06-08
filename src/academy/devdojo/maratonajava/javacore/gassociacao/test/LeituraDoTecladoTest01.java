package academy.devdojo.maratonajava.javacore.gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o seu nome abaixo");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = entrada.next().charAt(0);

        System.out.println(" ");
        System.out.printf("Olá %s, você tem %d anos, e é do sexo %s",nome,idade,sexo);
        entrada.close();
    }
}
