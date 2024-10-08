package Task;

import java.util.Scanner;

public class leapYear_18 {
    public static void main(String[] args) {

        // ! Create a program that determines if a given year is a leap year
        // todo (considering conditions like divisible by 4 but not 100, unless also divisible by 400).


        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int y=input.nextInt();

        if(y%400==0 || (y%4==0 && y%100!=0)){
            System.out.println("Leap-Year");
        }
        else{
            System.out.println("Not Leap-Year");
        }
        input.close();
    }
}