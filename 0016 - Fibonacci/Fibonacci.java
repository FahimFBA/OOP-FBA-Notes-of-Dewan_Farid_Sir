public class Fibonacci{
    public static void main(String[] args){
        int x = 1, y = 1, z = 0;
        for (int i = 1 ; i <= 10 ; i++){
            if (i == 1){
                System.out.print(x + " " + y);
            }
            z = x + y;
            System.out.print(" " + z);
            x = y;
            y = z;
        }
    }
}