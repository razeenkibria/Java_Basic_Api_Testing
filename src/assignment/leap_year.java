package assignment;

import java.util.Scanner;

public class leap_year {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter a year : ");
        int year=in.nextInt();

        if(((year%4==0) & (year%100!=0)) || (year%400==0))
        {
            System.out.println(year+ " Leap Year");
        }
        else {
            System.out.println(year+ " Not Leap year");
        }
    }
}
