package Task;

import java.util.Scanner;
// 
// r	=	
// t	=	

public class SimpleInterest_12 {
    public static void main(String args[]){
        Scanner InputValue=new Scanner(System.in);
        System.out.print("Enter a initial principal balance :- ");
        float p=InputValue.nextFloat();
        System.out.print("Enter a annual interest rate value:- ");
        float r=InputValue.nextFloat();
        System.out.println("Enter time (in years):- ");
        float t= InputValue.nextFloat();

        System.out.println("Simple Interest is:- "+  (p * t * r)/100);

    }
}
