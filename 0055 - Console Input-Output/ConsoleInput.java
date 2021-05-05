import java.io.*;
public class ConsoleInput{
    public static void main(String[] args){
        String s;
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(isr);
        try {
            System.out.println("Write something: ");
            s = in.readLine();
            System.out.println("Read: " + s);
            in.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}



/**       The above code provides an example of keyboard input, which import
the java.io.*; package. 
- In line 6, InputStreamReader reads characters and converts the row bytes into Unicode characters. 
- In line 7, BufferedReader provides the readLine() method (in line 10), which enables the program to read from standard input (keyboard) one line at a time. 
- Line 12, close the buffered reader. 
- The readLine() method can throw an I/O exception, so this code is in a try-catch block.              */

