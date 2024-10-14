package Task;

public class SumAndAverage_40 {

    public static void main(String[] args) {

        System.out.println("Welcome to array Sum and Average");

        int[] numArray = ArrayUtility_40.inputArray();

        long Sum = Sum(numArray);
        double Average = Average(numArray);

        System.out.println("Sum of number is " + Sum);
        System.out.println("Average of number is " + Average);
    }

    public static long Sum(int[] numArray) {
        int i = 0;
        int sum=0;
        while (i < numArray.length) {
            sum+=numArray[i];
            i++;
        }
        return sum;
    }

    public static double Average(int[] numArray) {
        double sum=Sum(numArray); 
        return sum/numArray.length;

    }

}