package Task;

public class CheckSorted_43 {
    public static void main(String[] args) {
        // ! Create a program to check if the given array is sorted.

        int[] arr = ArrayUtility_40.inputArray();

        boolean Inc = isIncreasing(arr);
        boolean Dec = isDecreasing(arr);

        if (Dec || Inc) {
            System.out.print("your array is Sorted");
        } else {
            System.out.print("your array is not Sorted");
        }

    }

    public static boolean isIncreasing(int[] arr) {
        int i = 1;
        while (i < arr.length - 1) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
            i++;
        }

        return true;
    }

    public static boolean isDecreasing(int[] arr) {
        int i = 1;

        while (i < arr.length) {
            if (arr[i] > arr[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

}
