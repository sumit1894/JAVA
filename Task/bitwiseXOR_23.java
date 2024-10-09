package Task;

import java.util.Scanner;

public class bitwiseXOR_23 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a number ");
        int inp1=input.nextInt();
        System.out.print("Enter a number ");
        int inp2=input.nextInt();

        System.out.println(inp1 ^ inp2);
        input.close();
    }
}

