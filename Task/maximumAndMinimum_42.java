package Task;

public class maximumAndMinimum_42 {
    //! Create a program to find number of occurrences of an element in an array. 
    public static void main(String[] args) {

        int[] arr=ArrayUtility_40.inputArray();

        int maximun=maximun(arr);
        System.out.println("Maximum number in an array is: "+maximun);

        int minimum=minimum(arr);
        System.out.println("mininum number in an array is: "+minimum);




    }

    public static int maximun(int[] arr){
        int i=1;
        int max=arr[0];
        if(arr.length==0){
            return Integer.MIN_VALUE;
        }

        while (i<arr.length) {
            if(max<arr[i]){
                max=arr[i];
            }
            i++;
        }
        return max;
    }

    public static int minimum(int[] arr){
        int i=0;
        int min=Integer.MAX_VALUE;

        if(arr.length==0){
            return Integer.MIN_VALUE;
        }
        
        while(i<arr.length){

            if(min>arr[i]){
                min=arr[i];
            }
            i++;

        }
        return min;
    }
}
