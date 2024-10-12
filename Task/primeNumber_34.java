package Task;
import java.util.Scanner;
public class primeNumber_34 {
    public static void Prime(int n){
        int i=2;
        int count=0;
        while(i<n){
            if(n%i==0){
                count++;
            }
            i++;
        }
        if(count==0){
            System.out.println(n+" is a prime number.");
        }else{
            System.out.println(n+" is not prime number.");
        }
    }
    public static void main(String[] args) {
        //! Create a program to check whether a given number is prime.

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a number:- ");
        int n = inp.nextInt();
        Prime(n);
        inp.close();
    }
    
}
