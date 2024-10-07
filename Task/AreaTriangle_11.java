package Task;

import java.util.Scanner;

public class AreaTriangle_11 {

    // ! .Create a program to calculate the Area of a Triangle.
    // todo Area of triangle = ½*B*H

    public static void main(String[] args) {
        Scanner inputValue=new Scanner(System.in);
        System.out.print("Enter the base of the triangle: ");
        float base=inputValue.nextFloat();
        System.out.print("Enter the height of the triangle: ");
        float height=inputValue.nextFloat();

        System.out.println("Area of triangle = " + (0.5*base*height)); 

        inputValue.close();
    }
}
