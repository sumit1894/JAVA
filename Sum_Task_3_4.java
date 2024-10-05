import java.util.Scanner;
public class Sum_Task_3_4 {
    public static void main(String args[]){
        Scanner input_number=new Scanner(System.in);
        System.out.print("Enter the first number:- ");
        int first_number=input_number.nextInt();
        System.out.print("Enter the second number:- ");
        int second_number=input_number.nextInt();
        int sum =first_number+second_number;
        System.out.print("The sum of "+first_number+" and "+second_number+" is "+sum);
        input_number.close();


    }

    
} 