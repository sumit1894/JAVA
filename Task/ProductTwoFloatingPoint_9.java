package Task;

import java.util.Scanner;

public class ProductTwoFloatingPoint_9 {
    public static void main(String args[]){
        //! Create a program that takes two floating point numbers from the user and calculates their product.

        Scanner inputValue=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        float a=inputValue.nextFloat();
        System.out.print("Enter the value of b: ");
        float b=inputValue.nextFloat();

        System.out.println(" a * b = " + (a*b)); //must use ().otherwise it will print the value of a and b.

        inputValue.close();
    }
}
