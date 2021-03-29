public class Light {
    int a, b, c;
    public Light(){
        a = 2;
        b = 4;
        c = 6;
    }
    public Light(int a){
        this.a = a;
        b = 4;
        c = 6;
    }
    public Light(int a, int b){
        this.a = a;
        this.b = b;
        c = 6;
    }

    public Light (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}