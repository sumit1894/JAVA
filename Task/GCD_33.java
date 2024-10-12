package Task;

import java.util.Scanner;
public class GCD_33 {


    public static void GCD(int a, int b){

        int min = a<b?a:b;
        int z=1;
        int sum=0;
        while(min!=z){
            if(a%z==0 && b%z==0){
                sum=z;
            }
            z++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        
        //! Create a program to find the Greatest Common Divisor (GCD) of two integers.

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a 1 number:- ");
        int a = inp.nextInt();
        System.out.print("Enter a 2 number:- ");
        int b = inp.nextInt();

        GCD(a, b);
        inp.close();

    }
}
