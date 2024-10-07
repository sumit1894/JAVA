package Task;
import java.util.Scanner;
public class RectanglePerimeter_10 {
    public static void main(String args[]){

        //! .Create a program to calculate Perimeter of a rectangle. Perimeter of rectangle ABCD = A+B+C+D

        Scanner inputValue=new Scanner(System.in);
        System.out.print("Enter a length of rectangle: ");
        float a=inputValue.nextFloat();
        System.out.print("Enter a breadth of rectangle: ");
        float b=inputValue.nextFloat();

        System.out.println("Perimeter of rectangle = " + (2*(a+b))); //*    must use ().otherwise it will print the value of a and b.

        inputValue.close();
    }
}
