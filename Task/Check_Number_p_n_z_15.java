package Task;

import java.util.Scanner;

public class Check_Number_p_n_z_15 {
    public static void main(String args[]){

        //! Create a program that determines if a number is positive, negative,or zero.

        Scanner Input_value=new Scanner(System.in);
        System.out.print("Enter a number ");
        int n=Input_value.nextInt();
        if(n==0){
            System.out.println("Zero");
        }
        else if(n>0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
        Input_value.close();
    }
}
