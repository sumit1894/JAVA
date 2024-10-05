import java.util.Scanner;

public class input_Task_3_5 {
    public static void main(String args []){
        Scanner input_name=new Scanner(System.in);
        System.out.print("Enter a name:-");
        String name=input_name.nextLine();
        System.out.println("Welcome " + name + " to the world of Java!");
        input_name.close();
    }
}
