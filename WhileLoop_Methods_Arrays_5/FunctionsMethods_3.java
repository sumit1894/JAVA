package WhileLoop_Methods_Arrays_5;

public class FunctionsMethods_3 {

    // ! Function Definition

    public static void greetUser() {
        System.out.println("Good Morning User!");
    }

    // ! Right Hand Pyramid
    public static void RightHandPyramid() {
        int i = 1;
        while (i <= 5) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    // ! ReverseHandPyramid

    public static void ReverseHandPyramid() {
        int i = 5;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }

    }

    // ! LeftHandPyramid

    public static void LeftHandPyramid() {
        int i = 1;
        // int k = 1;
        while (i <= 5) {

            int j = 1;
            while (j <= (5 - i)) {
                System.out.print("  ");
                j++;
            }
            while (j <= 5) {
                System.out.print(" *");
                j++;
            }
            System.out.println();
            i++;
        }

    }

    public static void main(String[] args) {

        // * 1. Definition: Blocks of reusable code.
        // * 2. DRY Principle: "Don't Repeat Yourself" it Encourages code reusability.
        // * 3. Usage: Organizes code and performs specific tasks.
        // * 4. Naming Rules: Same as variable names: camelCase
        System.out.println();

        greetUser(); // ! Function Call or Invocation
        System.out.println();

        RightHandPyramid();
        System.out.println();

        ReverseHandPyramid();
        System.out.println();

        LeftHandPyramid();
        System.out.println();

    }

}
