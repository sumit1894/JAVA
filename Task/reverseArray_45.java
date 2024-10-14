package Task;

public class reverseArray_45 {
    public static void main(String[] args) {
        // ! Create a program to reverse an array.

        int[] arr=ArrayUtility_40.inputArray();

        ReverseArr(arr);
        System.out.println("your reverse array is ");
        ArrayUtility_40.diaplayArray(arr);

    
    }

    public static void ReverseArr(int[] arr){
        int i=0;
        
        while(i<arr.length/2){
            int swap=arr[i];
            arr[i]=arr[(arr.length-1)-i];
            arr[(arr.length-1)-i]=swap;
            i++;
        }
    }
}
