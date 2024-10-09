package Operators_If_else_NumberSystem_4;

public class BitwiseOperators_4_11 {
    public static void main(String[] args) {
        // ! Bitwise Operators: Manipulate individual bits of a number.
        // ? & (AND): Sets each bit to 1 if both bits are 1.

        int a = 5; // ? Binary: 101
        int b = 7; // ? Binary: 111
        //                      -----
        //                      101
        //                      -----
        System.out.println(a & b); // ? Output: 5

        
        // ? | (OR): Sets each bit to 1 if one of the bits is 1.
        
        // int a = 5; // ? Binary: 101
        // int b = 7; // ? Binary: 111
        //                        -----
        //                         111
        //                        -----
        System.out.println(a | b); // ? Output: 7


        // ? ^ (XOR): Sets each bit to 1 if only one of the bits is 1.


        // int a = 5; // ? Binary: 101
        // int b = 7; // ? Binary: 111
        //                        -----
        //                         010
        //                        -----
        System.out.println(a ^ b); // ? Output: 2


        // ? ~ (NOT): Inverts all the bits.

        // int a = 5; // ? Binary: 101
        //                        -----
        //                         010
        //                        -----
        System.out.println(~a); // ? Output: -6


        // ? << (Left Shift): Shifts the bits to the left, discards the far left bit,
        // and assigns the rightmost bit a value of 0.

        // int a = 5; // ? Binary: 101
        //                        -----
        //                        1010
        //                        -----
        System.out.println(a << 1); // ? Output: 10


        // ? >> (Right Shift): Shifts the bits to the right, discards the far right bit,
        // and assigns the leftmost bit a value of 0.


        // int a = 5; // ? Binary: 101
        //                        -----
        //                         010
        //                        -----
        System.out.println(a >> 1); // ? Output: 2


        // ? >>> (Zero fill right shift): Shifts the bits to the right, discards the far
        // right bit, and assigns the leftmost bit a value of 0.

        // int a = 5; // ? Binary: 101
        //                        -----
        //                         010  
        //                        -----
        System.out.println(a >>> 1); // ? Output: 2

        

    }
}
