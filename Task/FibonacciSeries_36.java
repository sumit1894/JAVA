package Task;

import java.util.Scanner;

public class FibonacciSeries_36 {

    public static void FibonacciSeries(int n){ //15
        int a=0,b=1,temp;

        if(n==0){
            System.out.println("0");
        }
        else if(n==1){
            System.out.println("0 1");
        }
        else if(n>=2){
            System.out.print("0 1");
            while(n>=b){
                
                temp=a;
                a=b;
                System.out.print(" "+b);
                b=temp+a;

                
            }
            
        }

    }
    public static void main(String[] args) {
        
        //! Create a program to print the Fibonacci series up to a certain number.

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = inp.nextInt();

        FibonacciSeries(n);
        inp.close();

    }
}
