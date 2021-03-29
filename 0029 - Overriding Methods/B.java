class A {
    public void show(){
        System.out.println("Bird can fly");
    }
}

public class B extends A {
    public void show(){
        System.out.println("Bird fly in the sky");
    }

    public static void main(String[] args){
        B b = new B();
        b.show();
    }
}