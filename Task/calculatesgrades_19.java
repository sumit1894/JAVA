package Task;

import java.util.Scanner;

public class calculatesgrades_19 {
    public static void main(String[] args) {
        // ! Create a program that calculates grades based on marks
        // * A -> above 90%     B -> above 75%      
        // * C -> above 60%     D -> above 30%      
        // * F -> below 30%

        Scanner input= new Scanner(System.in);
        System.err.print("Enter a number:- ");
        float p= input.nextFloat();

        if(p>=90){
            System.out.println("A");
        }
        else if( p>=75){
            System.out.println("B");
        }
        else if(p>=60){
            System.out.println("C");
        }
        else if(p>=30){
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
        input.close();
    }
}
