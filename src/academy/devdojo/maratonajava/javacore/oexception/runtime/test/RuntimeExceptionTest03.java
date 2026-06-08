package academy.devdojo.maratonajava.javacore.oexception.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {
        try{
            System.out.println("Abrindo arquivo");
            throw new RuntimeException();
//            System.out.println("Escrevendo dados no arquivo");
        } catch (Exception e){
            e.printStackTrace();
        } finally {
            System.out.println("Fechando recursos liberados pelo SO");
        }
    }
}
