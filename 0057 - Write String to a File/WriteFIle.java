import java.io.*;

public class WriteFIle {
    public static void main(String[] args) {
        File file = new File ("Test" , "MyText.txt");
        try{
            InputStreamReader isr= new InputStreamReader(System.in);
            BufferedReader in = new BufferedReader(isr);
            PrintWriter out = new PrintWriter(new FileWriter(file));
            System.out.println("Write String: ");
            String str = in.readLine();
            out.println(str);
            in.close();
            out.close();
        } catch(IOException e) {
            e.printStackTrace();
        }
    }
}

/** To access a physical file we have to create a File object, 
which contains the address and name of the file. 
The FileReader class uses to read characters
from a file and the FileWriter class uses to write characters to a file. 
The PrintWriter class is used the print() and println() methods */