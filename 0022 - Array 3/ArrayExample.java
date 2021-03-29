class Car {
    public String carName;
    public String carModel;
    
    public Car (String carName, String carModel) {
        this.carName = carName;
        this.carModel = carModel;
    }

    public void display() {
        System.out.println("Name: " + carName + ", and Model: " + carModel);
    }
} // the end of the Car class


public class ArrayExample{
    public static void main(String[] args){
        Car[] myArray = new Car[3];
        myArray[0] = new Car("BMW" , "Road Track 509");
        myArray[1] = new Car("Toyota" , "X corola 2012");
        myArray[2] = new Car("Honda" , "M 2011");

        for (int i = 0; i < 3 ; i++){
            myArray[i].display();
        } // end of the for loop

    } // end of the main();
} // end of the class named  ArrayExample;