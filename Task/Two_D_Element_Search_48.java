package Task;

import java.util.Scanner;

public class Two_D_Element_Search_48 {
    // ! Create a program to search an element in a 2-D array.
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to the 2D Array Search Program");
        int[][] arr = ArrayUtility_40.input2DArray();
        System.out.println("Enter the Element you want to search: ");
        int num = inp.nextInt();

        boolean isFound = search(arr, num);
        if (isFound) {
            System.out.println("Element is Found");
        } else {
            System.out.println("Element is not Found");
        }
    }

    public static boolean search(int[][] arr, int num) {

        int i = 0;
        while(i<arr.length){
            int j=0;
            while (j<arr[i].length) {
                if(arr[i][j]==num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
