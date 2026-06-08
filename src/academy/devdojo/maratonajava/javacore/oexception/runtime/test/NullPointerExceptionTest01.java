package academy.devdojo.maratonajava.javacore.oexception.runtime.test;

import java.text.ParseException;

public class NullPointerExceptionTest01 {
    public static void main(String[] args) {

        try{
            String string = null;
            System.out.println(string.length());
        } catch (NullPointerException e) {
            System.out.println("String com valor Null");
        }
        try {
            int a = 30; int b = 0;
            int c = a/b;
        } catch (ArithmeticException e){
            System.out.println("You can't divide a numbver by zero!!");
        }
        try {
            int num = Integer.parseInt("Eureka");
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("The value isn't a number!");
        }
        try{
            int [] blewrys = new int[7];
            System.out.println(blewrys[9]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("This position not exists!");
        }
    }
}
