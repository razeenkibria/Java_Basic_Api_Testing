package razeen;

import java.util.Scanner;

public class operators {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter your 1st num: ");
        int a=in.nextInt();

        System.out.println("Enter your 2nd num: ");
        int b=in.nextInt();

        System.out.println("Summation of a & b : "+(a+b));
        System.out.println("Summation of a & b : "+(a-b));
        System.out.println("Summation of a & b : "+(a*b));
        System.out.println("Summation of a & b : "+(a/b));
        System.out.println("Summation of a & b : "+(a%b));



    }
}
