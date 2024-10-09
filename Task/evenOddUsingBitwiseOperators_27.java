package Task;

import java.util.Scanner;

public class evenOddUsingBitwiseOperators_27 {
    public static void main(String[] args) {

        // ! Write a program to check if a given number is even or odd using bitwise operators.
        
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int a=inp.nextInt();
        int res=a&1;
        if(res==1){
            System.out.println("odd");
        }
        else{
            System.out.println("Even");

        }
    
        inp.close();

    }
}
