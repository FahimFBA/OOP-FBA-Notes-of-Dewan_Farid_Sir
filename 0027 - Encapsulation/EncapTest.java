class MyNumber {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}

public class EncapTest {
    public static void main(String[] args) {
        MyNumber my = new MyNumber();
        my.setNumber(45);
        System.out.println(my.getNumber());
    }

}