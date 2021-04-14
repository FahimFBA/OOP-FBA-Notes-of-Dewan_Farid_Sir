interface Bounceable{
	public abstract void bounce();
	void setBounce(int b);
}
public class Tire implements Bounceable{
	public void bounce(){
		System.out.println("Love");
	}
	public void setBounce(int b){
		int a = b;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Tire t = new Tire();
		t.bounce();
		t.setBounce(15);
	}
}