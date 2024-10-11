package WhileLoop_Methods_Arrays_5;

import java.util.Scanner;

public class ReturnStatement_4 {

    public static void greetUser() {
        System.out.println("Good Morning User!");
    }
    
    public static int readNumber(){
    Scanner input=new Scanner(System.in);
    System.out.print("Enter the  number: ");
    int a=input.nextInt();
    return a;
    }
    public static void main(String[] args) {

        // ! Return statement

        // 1. Sends a value back from a function.
        // 2. What Can Be Returned: Value, variable, calculation, etc.
        // 3. Return ends the function immediately.
        // 4. Function calls make code jump around.
        // 5. Prefer returning values over using global variables.

        // ! Return statement

        greetUser();

        System.out.println("Calculating Sum\n");
        int first=readNumber();
        int second=readNumber();

        int sum=first+second;
        System.out.println("The sum is: "+sum);





    }
}
