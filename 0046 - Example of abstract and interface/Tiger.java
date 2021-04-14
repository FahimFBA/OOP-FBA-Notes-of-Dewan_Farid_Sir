abstract class Animal{
	public void type(){
		System.out.println("Animal");
	}
	public abstract void name();
}

interface Cat{
	public abstract void jump();
	void run(); // it will be automatically public and abstract
}

interface Bird{
	void fly();
}

public class Tiger extends Animal implements Cat, Bird{
	public void fly() {
		System.out.println("Tiger can't fly");
	}

	public void jump(){
		System.out.println("Tiger can jump");
	}

	public void run(){
		System.out.println("Tiger can run");
	}
	public void name(){
		 System.out.println("Tiger");
	}

	public static void main(String[] args){
		Tiger t = new Tiger();
		t.name();
		t.jump();
		t.run();
		t.fly();
	}
}