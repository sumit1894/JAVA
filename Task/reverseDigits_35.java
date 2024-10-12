package Task;
import java.util.Scanner;

public class reverseDigits_35 {
    public static int reverseDigits(int n){

        int rev=0;
        while(n>0){ 
            int div=n%10;
            rev=rev*10+div;
            n=n/10;
        }
        return rev;
    }
    public static void main(String[] args) {
        
        //! Create a program to reverse the digits of a number
        
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = inp.nextInt();
        
        System.out.println(reverseDigits(n));
        inp.close();

    }
}
