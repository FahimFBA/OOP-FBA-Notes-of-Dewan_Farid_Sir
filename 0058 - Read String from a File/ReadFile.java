import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        File file = new File("TestFolder" , "MyText.txt");
        try{
            BufferedReader in = new BufferedReader(new FileReader(file));
            String str = in.readLine();
            while(str != null){
                System.out.println("Read: " + str);
                str = in.readLine();
            }
            in.close();
        } catch(FileNotFoundException e1){
            System.out.println("File not found");
        } catch(IOException e2){
            System.out.println("Input / Output problem");
        }
    }
}