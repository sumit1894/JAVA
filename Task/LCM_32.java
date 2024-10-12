package Task;

import java.util.Scanner;

public class LCM_32 {
    public static void  LCM(int a, int b) {
        int i=1;
        while(true){
            int fac= a*i;
            if(fac%b==0){
                System.out.println("LCM of "+a+" and "+b+" is "+fac);
                break;
            }
            i++;
        }
       
    }

    public static void main(String[] args) {

        // ! Create a program to find the Least Common Multiple (LCM) of two numbers.

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a 1 number:- ");
        int a = inp.nextInt();
        System.out.print("Enter a 2 number:- ");
        int b = inp.nextInt();

        LCM(a, b);
        inp.close();

    }
}
