class Man {
    public void fly() {
        System.out.println("Man can not fly");
    }
}

class SuperMan extends Man {
    public void fly(){
        System.out.println("Superman can fly");
    }
}
 
public class TestMan{
    public static void main(String[] args){
        Man m = new SuperMan(); // polymorphism
        m.fly();
    }
}