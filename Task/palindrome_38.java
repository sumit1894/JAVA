package Task;
import java.util.Scanner;

public class palindrome_38 {
    public static void Palindrome(int num){

        int temp=num;
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        if(temp==rev){
            System.out.println("The number is Palindrome");
        }
        else{
            System.out.println("The number is not Palindrome");
        }
    }
    public static void main(String[] args) {

        Scanner inp=new Scanner(System.in);
        System.out.print(("Enetr the number:- "));
        int num=inp.nextInt();
        
        Palindrome(num);
        inp.close();
    }
}
