package Task;

import java.util.Scanner;

public class bitwiseCompliment_24 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number ");
        int inp1=input.nextInt();


        System.out.println(~inp1);
        input.close();
    }
}