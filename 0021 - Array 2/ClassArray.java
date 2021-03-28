class Bird {
    public void fly() {
        System.out.println("Birds can fly");
    }
}

public class ClassArray {
    public static void main(String[] args) {
        Bird[] myArray = new Bird[3];
        for (int i = 0; i < 3; i++)
            myArray[i] = new Bird();
        for (int i = 0; i < 3; i++)
            myArray[i].fly();
    }
}