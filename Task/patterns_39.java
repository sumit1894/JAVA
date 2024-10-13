package Task;

import java.util.Scanner;

public class patterns_39 {


    public static void Pattern1(int num){
        int i=1;
        while(i<=num){
            int j=1;
            while(j<=i){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }

    public static void Pattern2(int num){
        while(num>0){
            int j=1;
            while(j<=num){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            num--;
        }
    }

    public static void Pattern3(int num){
        int i=1;
        while(num>=i){
            int j=1;
            while(j<=num-i){
                System.out.print("  ");
                j++;
            }
            while(j<=num){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
    public static void main(String[] args) {
        
        Scanner inp=new Scanner(System.in);
        System.out.print(("Enetr the number:- "));
        int num=inp.nextInt();
        
        Pattern1(num);
        System.out.println();
        Pattern2(num);
        System.out.println();
        Pattern3(num);
        inp.close();


    }
}
