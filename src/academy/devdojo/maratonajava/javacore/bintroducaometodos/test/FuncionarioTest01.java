package academy.devdojo.maratonajava.javacore.bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();
        Funcionario funcionario02 = new Funcionario();

        funcionario01.setNome("Sendrick");
        funcionario01.setIdade(20);
        funcionario01.setSalario( new double[] {716.00, 2500.00, 5000.00});

        funcionario02.setNome("Isabela❤");
        funcionario02.setIdade(19);
        funcionario02.setSalario( new double[] {800.00, 2500.00, 5000.00});


        System.out.println("Funcionário 01: ");
        funcionario01.imprimirDados();

        System.out.println("\n#####################\n");
        System.out.println("Funcionário 02: ");
        funcionario02.imprimirDados();


    }
}
