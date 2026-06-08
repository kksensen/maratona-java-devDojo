package academy.devdojo.maratonajava.javacore.oexception.exception.domain;

import java.io.FileNotFoundException;

public class Funcionario extends Pessoa{

    public void salvar() throws LoginInvalidoException, FileNotFoundException{
        System.out.println("Salvando funcionario");
    }
}
