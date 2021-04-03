class Car {
    public void abc(){
        System.out.println("Car");
    }
}

class Bus {
    public void xyz(){
        System.out.println("Bus");
    }
}

public class Testinstanceof {
    public static void main(String[] args) {
        Car c = new Car();
        Bus b = new Bus();
        Testinstanceof t = new Testinstanceof();
        t.test(c);
        t.test(b);
    }

    public void test (Object obj){
        if(obj instanceof Car){
            System.out.println("Object is of Car class");
        }
        else if (obj instanceof Bus){
            System.out.println("Object is of Bus class");
        }
        else{
            System.out.println("Object is not of Car/Bus class");
        }
    }
}