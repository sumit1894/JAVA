package Task;

import java.util.Scanner;

public class calculatesFactorial_30 {

    public static int calculatesFactorial(int a) { // 5*4*3*2*1
        int ans = 1;
        if (a==0) {
            System.out.println(1);
        }
        while (a != 1) {
            ans = ans * a;
            a--;
        }

        return ans;
    }

    public static void main(String[] args) {

        // ! Write a function that calculates the factorial of a given number.

        System.out.println("Factorial\n");
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int a = inp.nextInt();

        System.err.println(calculatesFactorial(a));
        inp.close();

    }
}
