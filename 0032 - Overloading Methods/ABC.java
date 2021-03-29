public class ABC {

    int a, b, c;

    public void setValue() {
        a = 2;
        b = 4;
        c = 6;
    }

    public void setValue(int a) {
        this.a = a;
        b = 4;
        c = 6;
    }

    public void setValue(int a, int b) {
        this.a = a;
        this.b = b;
        c = 6;
    }

    public int setValue(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        int z = a + b + c;
        return z;
    }
}