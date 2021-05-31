import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ConnectException;
import java.net.Socket;

public class ClientServer {
    public static void main(String[] args) {
        try {
            Socket s1 = new Socket("127.0.0.1" , 5432); // (host, port)
            InputStream is = s1.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            System.out.println(dis.readUTF());
            dis.close();
            s1.close();
        }catch (ConnectException e1){
            System.out.println(e1);
        }catch (IOException e2){
            e2.printStackTrace();
        }
    }
}
