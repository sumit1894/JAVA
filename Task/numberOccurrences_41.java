package Task;

import java.util.Scanner;

public class numberOccurrences_41 {
    public static void main(String[] args) {

        // ! Create a program to find number of occurrences of an element in an array.

        int[] arr = ArrayUtility_40.inputArray();

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a Search value: ");
        int Search = inp.nextInt();

        int found = SearchTarget(arr, Search);

        System.out.print("Element Found "+found + " times in an array");
        inp.close();

    }

    public static int SearchTarget(int[] arr, int Search) {

        int i = 0;
        int count = 0;
        while (i < arr.length) {
            if (arr[i] == Search) {
                count++;
            }
            i++;
        }
        return count;
    }

}
