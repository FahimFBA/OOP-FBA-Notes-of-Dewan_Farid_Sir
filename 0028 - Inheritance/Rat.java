class Cat {
    public int x = 10;
    public int y = 20;

    public void show(){
        System.out.println(x +" " + y);
    }
}

public class Rat extends Cat {
    public int z = 30;
    public static void main(String[] args){
        Rat r = new Rat();
        r.show();
        System.out.println(r.x + " " + r.y + " " + r.z);
    }
}