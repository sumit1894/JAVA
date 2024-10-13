package Task;

import java.util.Scanner;
public class ArmstrongNumber_37 {

    public static int Pow(int a) {
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }
    


    public static void ArmstrongNumber(int n) {

        int res;
        int temp = n;
        int ans = 0;

        while (n > 0) { // 153
            res = n % 10;
            ans = ans + (int) Math.pow(res, Pow(temp));
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
