package WhileLoop_Methods_Arrays_5;

public class Array_5 {
    public static void main(String[] args) {

        // ! What is an Array?

        // * 1. An Array is just a list of values.
        // * 2. Index: Starts with 0.
        // * 3. Arrays are used for storing multiple values in a single variable.

        // ! Array Syntax

        // todo Syntax Rules:
        // ? Brackets start and end the array.
        // ? Values separated by commas.
        // ? Can span multiple lines.


        //! Declaring an Array

        int[] arr= new int[5]; // * Declaring an array of 5 integers.
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;


        //! Accessing Array Elements
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        System.out.println();
        int index=3;
        System.out.println(arr[index]);
        

        System.out.println();
        //!  Array can be initialized in a single line.

        int[] arr1={10,20,30,40,50};
        System.out.println(arr1[0]);
        System.out.println(arr1[1]);
        System.out.println(arr1[2]);
        System.out.println(arr1[3]);
        System.out.println(arr1[4]);


        //! Array length
        System.out.println();
        System.out.println(arr.length);


        System.out.println();
        //! Looping through an Array

        int i=0;
        while(i<arr.length){
            System.out.println(arr[i]);
            i++;
        }





    }

}
