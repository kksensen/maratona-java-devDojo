package academy.devdojo.maratonajava.introducao;

public class Aula38ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[6];

        int count = 0;
        for (int[] arrBase : arrayInt) {
            System.out.println("\n-------");
            for (int num : arrBase) {
                System.out.print(num + " ");

            }
        }
    }
}
