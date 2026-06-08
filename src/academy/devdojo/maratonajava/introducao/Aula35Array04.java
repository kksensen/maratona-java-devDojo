package academy.devdojo.maratonajava.introducao;

public class Aula35Array04 {
    public static void main(String[] args) {
        int[] numeros = new int[3];
        int[] numeros2 = {1,2,3,4,5};
        int[] numeros3 = new int[]{5,4,3,2,1};

//        for (int i = 0; i < numeros3.length; i++) {
//            System.out.println(numeros3[i]);
//        }
        for(int num:numeros3){
            System.out.println(num);
        }
        // O que tá rolando é:

//        int num = numeros3[0];
//        System.out.println(num);
//        int num = numeros3[1];
//        System.out.println(num);
//        int num = numeros3[2];
//        System.out.println(num);
//        int num = numeros3[3];
//        System.out.println(num);
    }
}
