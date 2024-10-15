package Task;

public class sumAverage2DArray_49 {
    // ! Create a program to do sum and average of all elements in a 2-D array.
    public static void main(String[] args) {
        int[][] arr = ArrayUtility_40.input2DArray();
        int sum = sum(arr);
        System.out.println("Sum of 2D Array is: " + sum);
        double avg = average(arr);
        System.out.println("Average of 2D Array is: " + avg);
    }

    public static int sum(int[][] arr) {
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                sum += arr[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }

    public static double average(int[][] arr) {
        double avg = sum(arr);

        return avg / (arr.length * arr.length);
    }
}
