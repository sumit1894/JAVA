package Task;
import java.util.Scanner;
public class differentAgeGroup_20 {
    public static void main(String args[]) {

        // ! .Create a program that categorize a person into different age groups
        // * Child -> below 13 Teen -> below 20
        // * Adult -> below 60 Senior-> above 60

        
        Scanner input=new Scanner(System.in);
        System.out.print("Enter number:- ");
        int n=input.nextInt();

        if(n<=13){
            System.err.println("Child");
        }
        else if(n<=20){
            System.err.println("Teen");
        }
        else if(n<=60){
            System.err.println("Adult");
        }
        else{
            System.err.println("Senior");

        }

        input.close();
    }
}
