package Task;

import java.util.Scanner;

public class FahrenheitToCelsius_14 {
    public static void main(String args[]) {
        // ! .Create a program to convert Fahrenheit to Celsius
        // todo °C = (°F - 32) × 5/9

        Scanner inputValue=new Scanner(System.in);
        System.out.print("Enter a Fehrenheit value:- ");
        double F=inputValue.nextFloat();
        double C = (F-32)*5/9;
        System.out.print("Celsius is :- "+ C + "°C");

        inputValue.close();
    }
}
