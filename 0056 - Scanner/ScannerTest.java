import java.io.*;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(str);
        int num = s.nextInt();
        System.out.println(num);
        s.close();
    }
}