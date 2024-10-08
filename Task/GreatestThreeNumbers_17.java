package Task;

import java.util.Scanner;

public class GreatestThreeNumbers_17 {
    public static void main(String args[]){
        //! Create a program that determines the greatest of the three numbers. 

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        float n1=input.nextFloat();
        
        System.out.print("Enter a number:- ");
        float n2=input.nextFloat();

        System.out.print("Enter a number:- ");
        float n3=input.nextFloat();

        if(n1>n2 && n1>n3){
            System.out.println(n1+" is greatest");
        }
        else if(n2>n1 && n2>n3){
             System.out.println(n2+" is greatest");
             
            }
            else{
             System.out.println(n3+" is greatest");
         }

         input.close();
    }
}
