package Task;

import java.util.Scanner;

public class bitwiseAND_21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the first number: ");
        int b = sc.nextInt();

        System.out.println(a & b);

        sc.close();
    }
}
