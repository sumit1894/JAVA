package Task;

public class palindromeArray_46 {
    public static void main(String[] args) {
        
        int[] arr=ArrayUtility_40.inputArray();

        boolean pal=palindrome(arr);
        if(pal){
            System.out.println("palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }


    }

    public static boolean palindrome(int[] arr){
        int i=0;
        int j=arr.length-1;
        while(i<arr.length/2){
            if(arr[i]!=arr[j-i]){
                return false;
            }
            i++;
        }

        return true;
    }
}
