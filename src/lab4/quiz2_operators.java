package lab4;
import java.util.Scanner;
public class quiz2_operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Plz enter num1");
        int num1 = sc.nextInt();
        System.out.println("Plz enter num2");
        int num2 = sc.nextInt();

        int a = summation(num1 ,num2);
        System.out.println(a);
        int b = minus(num1 ,num2);
        System.out.println(b);
        int c = multiply(num1 ,num2);
        System.out.println(c);
        int d = divide(num1 ,num2);
        System.out.println(d);
    }//main


    private static int summation(int num1, int num2) {
        return  num1+num2;
    }
    private static int minus(int num1, int num2) {
        return  num1-num2;
    }
    private static int multiply(int num1, int num2) {
        return  num1*num2;
    }
    private static int divide(int num1, int num2) {
        return  num1/num2;
    }
}//main







