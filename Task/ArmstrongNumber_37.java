package Task;

import java.util.Scanner;

public class ArmstrongNumber_37 {
    public static void ArmstrongNumber(int n) {
        int res;
        int temp = n;
        int ans = 0;
        while (n > 0) { // 153
            res = n % 10;
            ans = ans + (int) Math.pow(res, 3);
            n = n / 10;
        }

        if(ans==temp){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }

    public static void main(String[] args) {

        // ! Create a program to check if a number is an Armstrong number

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int a = inp.nextInt();

        ArmstrongNumber(a);
        inp.close();

    }
}
