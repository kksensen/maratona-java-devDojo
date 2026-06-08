package academy.devdojo.maratonajava.javacore.hheranca.test;

import academy.devdojo.maratonajava.javacore.hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Toyohisa Shimazu");
        pessoa.setCpf("1111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Oda Nobunaga");
        funcionario.setCpf("111121211");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2000);

        System.out.println("-----------------");
        funcionario.imprime();
    }
}
