package ClassesObjects_6;

public class DeclaringObjects_3 {
    public static void main(String[] args) {

        // ! Declaring Objects

        // 1. Object Creation: new instantiates a new object of a class.
        // 2. Memory Allocation: Allocates memory for the object in the heap.
        // 3. Constructor Invocation: Calls the class constructor to initialize the object.
        // 4. Reference Return: Returns a reference to the created object.
        // 5. Array Creation: Also used for creating arrays, like int[] arr = new int[5];.
        // 6. Dynamic Allocation: Unlike static allocation, new allows for dynamic
        // memory allocation, allocating memory at runtime.
        // * Objects are instances of a class.


        // ! Declaring Objects Syntax

        // ? Syntax: ClassName objectName = new ClassName();
        // * ClassName: The name of the class for which the object is created.
        // * objectName: The name of the object.
        // * new: The keyword that creates the object.
        // * ClassName(): The constructor of the class that initializes the object.

        // Example:
        //todo  car car = new car();
        // * car: The object name.
        // * car(): The constructor of the car class.
        //* new: Creates a new object of the car class.
        // * new car(): Creates a new object of the car class.


        // ! Declaring Objects Example

        //  myClass objRefVal = new myClass();

        // * myClass: class name.
        // * objRefVal:  reference variable.
        // * new :  new keyword.
        // * myClass():  constructor call

        //  myClass objRefVal  //! Declaration
        //  new   //! Instantiation
        //  myClass()  //! Initialization

        //? objRefVal: Reference variable that holds the memory address of the object.
        //? new: is a java keyword used to inisiate the class.


        // ! Using Objects
        //todo if u want to access the behavior or methods of an object u can use the object name followed by a dot(.) and the method name. 

        car car1=new car();
        

        car1.start();
        car1.drive();
        car1.addFuel(4);
        car1.drive();
        car1.addFuel(10);
        car1.drive();
        car1.stop();
        System.out.println("Current Fuel: "+car1.getCurrentFuel());

        



    }
}
