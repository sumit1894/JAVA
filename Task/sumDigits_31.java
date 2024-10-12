package Task;

import java.util.Scanner;

public class sumDigits_31 {

    public static int sumDigit(int n){
        int sum=0;
        while(n>0){
                int val=n%10;
                sum=sum+val;
                n=n/10;
        }
        return sum;
    }
    public static void main(String[] args) {

        //! Create a program that computes the sum of the digits of an integer.
        
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n=inp.nextInt();

        System.out.println(sumDigit(n));
        inp.close();
    }
}
