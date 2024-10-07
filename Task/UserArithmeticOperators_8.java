package Task;

import java.util.Scanner;

public class UserArithmeticOperators_8 {
    public static void main(String args[]) {
        
        //! Create a program that takes two numbers from the user and performs arithmetic operations on them.

        Scanner Input=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = Input.nextInt();
        System.out.print("Enter the value of b: ");
        int b = Input.nextInt();

        System.out.println("a = " + a + " b = " + b);
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a / b = " + (a/b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a % b = " + (a%b));

        Input.close();



    }
}
