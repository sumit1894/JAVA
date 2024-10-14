package Task;

public class mergeTwoSorted_47 {
    public static void main(String[] args) {
        // ! Create a program to merge two sorted arrays.

        int[] arr1 = ArrayUtility_40.inputArray();
        int[] arr2 = ArrayUtility_40.inputArray();

        int[] newArr = Merge(arr1, arr2);

        ArrayUtility_40.diaplayArray(newArr);
    }

    public static int[] Merge(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length || j < arr2.length) {
            // The condition ensures that we don't go out of bounds in either array
            if (j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])) {
                newArr[k] = arr1[i];
                i++;
            } else {
                newArr[k] = arr2[j];
                j++;
            }
            k++;
        }

        return newArr;
    }
}
