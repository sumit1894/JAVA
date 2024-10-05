package Variables_DataType_Input_3;
import java.util.Scanner;

public class User_Input_3_3 {
    public static void main(String args[]){

        Scanner input_Scanner=new Scanner(System.in);
        System.out.print("Enter the number of rows:- ");
        String name = input_Scanner.nextLine();
        System.out.println(name+",Good morning!");
        System.out.print(name +", Enter your age also:- ");
        int age =input_Scanner.nextInt();
        System.out.println("Your age is "+age);
        input_Scanner.close();// this is optional.


    }
}
