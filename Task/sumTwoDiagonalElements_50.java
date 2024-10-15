package Task;

public class sumTwoDiagonalElements_50 {
    public static void main(String[] args) {

        // ! Create a program to find the sum of two diagonal elements.

        System.out.println("Welcome to Sum of Two Diagonal Elements Program");

        int[][] arr = ArrayUtility_40.input2DArray();
        long sum = sum(arr);
        System.out.println("Sum of Two Diagonal Elements is: " + sum);
    }

    public static long sum(int[][] arr) {
        long leftSum = sumLeftDiagonal(arr);
        long rightSum = sumRightDiagonal(arr);
        long sum = leftSum + rightSum;
        if (arr.length % 2 != 0) {
            int ind = arr.length / 2;
            sum -= arr[ind][ind];
        }
        return sum;
    }

    public static long sumLeftDiagonal(int[][] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum += arr[i][i];
            i++;
        }

        return sum;
    }

    public static long sumRightDiagonal(int[][] arr) {
        long sum = 0;
        int i = 0;
        while (i < arr.length) {
            int j = (arr.length - 1)-i;
            sum+=arr[i][j];
            i++;
        }
        return sum;
    }
}
