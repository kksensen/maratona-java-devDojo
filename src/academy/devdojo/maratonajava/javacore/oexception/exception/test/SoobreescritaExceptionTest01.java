package academy.devdojo.maratonajava.javacore.oexception.exception.test;

import academy.devdojo.maratonajava.javacore.oexception.exception.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.oexception.exception.domain.Pessoa;

import java.io.FileNotFoundException;

public class SoobreescritaExceptionTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();

        try {
            funcionario.salvar();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
