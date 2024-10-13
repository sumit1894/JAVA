package WhileLoop_Methods_Arrays_5;

public class Arrays_2D_7 {
    public static void main(String[] args) {
        
        // ! 2D Arrays
        // ! 2D Array Declaration

        // int arr [][]=new arr[3][3];
        // arr[0][0]=10;

        int arr1[][]={{10,20,30},{40,50,60},{70,80,90}};
        System.out.println(arr1[0][0]);

        // ! 2D Array Traversal
        int i=0;
        while (i<arr1.length){
            int j=0;
            while(j<arr1[i].length){
                System.out.print(arr1[i][j]+" ");
                j++;
            }
            System.out.println();
            i++;
        } 
    }
    
}
