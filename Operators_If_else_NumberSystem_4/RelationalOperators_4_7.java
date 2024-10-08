package Operators_If_else_NumberSystem_4;

import java.util.Scanner;

public class RelationalOperators_4_7 {

    //! < , > , <= , >= , == , !=
    
    
    public  static void main(String args[]){
        System.out.print("Enter a number ");
        Scanner Input_value=new Scanner(System.in);
        int n=Input_value.nextInt();
        if(n<18){
            System.out.println("can't Drive");
        }
        else{
            System.out.println("You can Drive");
        }
        Input_value.close();
    }
}
