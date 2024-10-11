package Task;

import java.util.Scanner;
public class multiplicationTable_28 {

    public static void table(int a){
        int i=1;
        while(i<=10){
            System.out.println(a+" x "+i+" = "+(a*i));
            i++;
        }
    }


    public static void main(String[] args) {
        //! Develop a program that prints the multiplication table for a given number.
        
        // * Input
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int Input = input.nextInt();
        input.close();
        
        table(Input);
    }
}
