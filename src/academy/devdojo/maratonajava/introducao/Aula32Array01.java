package academy.devdojo.maratonajava.introducao;

public class Aula32Array01 {
    public static void main(String[] args) {
        int[] idades = new int[3];

        //int[] idades <- tipo reference

        //int[i] <- i posição no array

        idades[0] = 21;
        idades[1] = 17;
        idades[2] = 13;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
        //System.out.println(idades[3]); <- fora do limite do array
    }
}
