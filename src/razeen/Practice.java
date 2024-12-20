package razeen;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        //num:01
        /*
        System.out.println("Enter number :");
        int a=sc.nextInt();

        if(a>0){
            System.out.println("Positive number : "+a);
        } else if (a==0) {
            System.out.println("equal number : "+a);
        }
        else{
            System.out.println("Negative number :"+a);
        }
    */
        //num:02

        System.out.println("Enter number :");
        int a=sc.nextInt();

        System.out.println("Enter number :");
        int b=sc.nextInt();

        System.out.println("Enter number :");
        int c=sc.nextInt();

        if(a>b && a>c){
            System.out.println("a is big "+a);
        }

        else if(b>a && b>c){
            System.out.println("b is big "+b);
        } else if (c>a &c>b) {
            System.out.println("c is big"+c);
        }
        else {
            System.out.println("Nothing ");
        }

        // num:03

    }
}
