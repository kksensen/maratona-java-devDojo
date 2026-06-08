package academy.devdojo.maratonajava.javacore.aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses.dominio.Estudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.idade = 12;
        estudante.nome = "Toyohisa";
        estudante.sexo = 'M';

        System.out.println("Nome: "+ estudante.nome + " Idade: " + estudante.idade + " Sexo: " + estudante.sexo);
        }
    }