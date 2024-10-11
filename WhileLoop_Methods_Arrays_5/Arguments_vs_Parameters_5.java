package WhileLoop_Methods_Arrays_5;

public class Arguments_vs_Parameters_5 {
    public static int add(int a, int b) { //! Parameters
        return a + b;
    }
    public static void main(String[] args) {

        // 1. Input values that a function takes.
        // 2. Parameters put value into function, while return gets value out.
        // 3. Naming Convention: Same as variable names.
        // 4. Parameter vs Argument
        // 5. Examples: System.out.print, Scanner.nextInt(), are functions we have already used
        // 6. Multiple Parameters: Functions can take more than one.
        // 7. Default Value: Can set a default value for a parameter.


        // Example 1: Parameter vs Argument

        int result = add(5, 10);//! Arguments
        System.out.println("Sum is:- "+result);

    }
}
