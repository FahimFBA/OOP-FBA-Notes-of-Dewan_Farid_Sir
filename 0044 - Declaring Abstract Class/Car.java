abstract class Vehicle{
    public String model = "E class";
    public String year = "2008";

    public abstract void goFast();

    public void show(){
        System.out.println("Model: " + model + " Year: " + year);
    }
}

public class Car extends Vehicle{
    public void goFast(){
        System.out.println("Car can go fast");
    }

    public static void main(String[] args){
        // Vehicle v = new Vehicle(); // compiler error
        Car c = new Car();
        c.show();
        c.goFast();
    }
}