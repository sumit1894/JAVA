package Task;

import java.util.Scanner;

public class sumOddNumbers_29 {

    public static int sumAllOddNumber(int a){
        int i=1;
        int sum=0;
        while (i<=a) {
            if(i%2!=0){
                sum=sum+i;
            }
            i++;
        }
        return sum;
    }
    public static void main(String[] args) {
        
        //! Create a program to sum all odd numbers from 1 to a specified number N. 

        Scanner inp= new Scanner(System.in);
        System.err.print("Enter a Number:- ");
        int a=inp.nextInt();
        
        System.err.println(sumAllOddNumber(a));

        inp.close();
    }
}
