package academy.devdojo.maratonajava.javacore.aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.marca = "Nissan";
        carro01.modelo = "GTR R34";
        carro01.ano = 2008;
        carro02.marca = "Porsche";
        carro02.modelo = "Macan";
        carro02.ano = 2018;

        System.out.println("Carro 1"+"\nMarca: " + carro01.marca + "\nModelo: " + carro01.modelo + "\nAno: " + carro01.ano);
        System.out.println("\n#############################");
        System.out.println("\nCarro 2"+"\nMarca: " + carro02.marca + "\nModelo: " + carro02.modelo + "\nAno: " + carro02.ano);
    }
}
