package Task;
import java.util.Scanner;
public class ArrayUtility_40 {

    public static int[] inputArray(){

        Scanner inp=new Scanner(System.in);
        System.out.print("Pleased Enter the Size of an Array: ");
        int size =inp.nextInt();
        
        int[] nums=new int[size];
        
        int i=0;
        
        while(i<size){
            System.out.print("Enter " +(i+1)+ " element: ");
            nums[i]=inp.nextInt();
            i++;
            
        }
        return nums;
    }
}
