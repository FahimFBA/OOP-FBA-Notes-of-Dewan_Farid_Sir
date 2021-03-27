public class Welcome2 { 
    public static void main(String[] args) { // main method
        Hello hello = new Hello(); // creating an object named hello of Hello class
        hello.display(); // calling the display method of the hello object of Hello class 
    }
}
 
class Hello {
    public void display() { // method of the class
        System.out.println("Welcome to Java World");
    }
}