package razeen;

import java.util.Scanner;

public class conditional {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        System.out.println("Enter a :");
        int a=sc.nextInt();

        System.out.println("Enter b :");
        int b= sc.nextInt();

        if(a>b) {
            System.out.println(a + " is gather than " + b);
        } else if (a==b) {
            System.out.println(a+" is equal "+b);
        }
        else {
            System.out.println(a+" is less than "+b);
        }
        */

        System.out.println("Enter your name: ");
        String text=sc.nextLine();

        if(text.equalsIgnoreCase("Razeen")){
            System.out.println("Your text is razeen");
        }
    }
}
