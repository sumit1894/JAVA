package Task;
import java.util.Scanner;

public class Swap_7 {
    public static void main(String args[]) {
        
        //! Swapping two numbers .
        
        Scanner Input=new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = Input.nextInt();
        System.out.println("Enter the value of b: ");
        int b = Input.nextInt();

        System.out.println("Before Swapping: a = " + a + " b = " + b);
        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.print("After Swapping: a = " + a + " b = " + b);
        Input.close();
        
    }
}
