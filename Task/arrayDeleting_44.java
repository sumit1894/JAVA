package Task;

import java.util.Scanner;

public class arrayDeleting_44 {

    //! Create a program to return a new array deleting a specific element. 

    public static void main(String[] args) {
        
        //todo input array
        int[] arr=ArrayUtility_40.inputArray();

        //todo delete number selecting
        Scanner inp=new Scanner(System.in);
        System.out.print("Enter a number you want to Delete:- ");
        int del=inp.nextInt();

        // todo function call
        int[] newArray=DeleteArray(arr, del);

        // todo display function
        System.out.println("New Array");
        ArrayUtility_40.diaplayArray(newArray);


    }

    public static int[] DeleteArray(int[] arr, int del){
        int occ=numberOccurrences_41.SearchTarget(arr, del);
        if(occ==0){
            return arr;
        }

        int newSize=arr.length-occ;
        int[] newArr=new int[newSize];

        int i=0,j=0;

        while(i<arr.length){

            if(arr[i]!=del){
                newArr[j]=arr[i];
                j++;
            }

            i++;
        }


        return newArr;
    }
}
