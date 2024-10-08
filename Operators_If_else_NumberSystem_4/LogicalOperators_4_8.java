package Operators_If_else_NumberSystem_4;
public class LogicalOperators_4_8{
    public static void main(String args[]){
        boolean fruit=false;
        boolean vegitable=true;

        if(fruit && vegitable){
            System.out.println("This is fruit\n");
        }
        else if(fruit || vegitable){
            System.out.println("This is Vegitable\n");
        }
        else{
            System.out.println("pulses\n");
        }

    }
}
