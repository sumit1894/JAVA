package ClassesObjects_6;

public class car {

        // Properties of Car
    
        // int noOfWheels;   can make method to get no of wheels, same for all.
        String color;
        float price;
        float CurrentFuleInLitres;
        int NumberOfSeats;
    
        // Methods of Car
    
        public void start(){
            System.out.println("Car is starting");
        }
    
        public void drive(){
            if(CurrentFuleInLitres==0){
                System.out.println("No fuel, please add fuel");
            }
            else if(CurrentFuleInLitres<=5){
                System.out.println("Car is in reserve mode, please refuel");
                CurrentFuleInLitres--;
            }
            else {
                System.out.println("Car is driving");
                CurrentFuleInLitres--;
            }
        }
    
        public void addFuel(float fuel){
            CurrentFuleInLitres += fuel;
        }
    
        public float getCurrentFuel(){
            return CurrentFuleInLitres;
        }
       
        public void stop(){
            System.out.println("Car is stopping");
        }
}
