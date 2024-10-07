package Task;

import java.util.Scanner;

public class CompoundInterest_13 {
    public static void main(String args[]) {

        Scanner InputValue = new Scanner(System.in);
        System.out.print("Enter a initial principal balance :- ");
        float P = InputValue.nextFloat();
        System.out.print("Enter a annual interest rate value:- ");
        float R = InputValue.nextFloat();
        System.out.print("Enter time (in years):- ");
        float T = InputValue.nextFloat();

        System.out.println("Compound Interest is:- " +   P*(1 + R/100)*T );

        InputValue.close();
    }
}
