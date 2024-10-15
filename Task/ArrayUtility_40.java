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

    public static int[][] input2DArray(){

        Scanner inp=new Scanner(System.in);
        System.out.print("Pleased Enter the Row of an Array: ");
        int Row =inp.nextInt();
        System.out.print("Pleased Enter the Coloumns of an Array: ");
        int Coloumns =inp.nextInt();
        
        int[][] nums=new int[Row][Coloumns];
        
        int i=0;
        while(i<Row){
            int j=0;
            while(j<Coloumns){
                System.out.print("Enter " +(i+1)+ " row "+ (j+1)+ " coloum: ");
                nums[i][j]=inp.nextInt();
                j++;
            }
            i++;
            
        }
        return nums;
    }


    public static void diaplayArray(int[] nums){

        int i=0;
        while(i<nums.length){
            System.err.print(nums[i]+" ");
            i++;
        }
        System.err.println();

    }
}
