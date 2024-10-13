package WhileLoop_Methods_Arrays_5;

import java.util.Scanner;

public class Array_5_1 {

    public static boolean isFound(int arr[],int num){
        
        int index=0;
        while(index<arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }

        return false;
    }
    public static void main(String[] args) {

        // ! Array Searching

        int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number to search:- ");
        int num = inp.nextInt();

        // ! Linear Search

        boolean isFound = isFound(arr, num);

        if(isFound){
            System.out.println("Number is found.");
        }
        else{
            System.out.println("Number is not found.");
        }
        inp.close();


        System.out.println();
        // ! String Array

        String[] names= new String[5];
        names[0]="John";    
        

        System.out.println(names[0]);

        String[] name={"John","Doe","Jane","Doe","Alice"};
        System.out.println(name[4]);
        System.out.println(name.length);





    }
}
