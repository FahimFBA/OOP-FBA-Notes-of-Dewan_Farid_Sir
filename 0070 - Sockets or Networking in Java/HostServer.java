import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class HostServer {
    public static void main(String[] args) {
        ServerSocket s = null;
        try {
            s = new ServerSocket(5432);
            Socket s1 = s.accept();
            OutputStream s1out = s1.getOutputStream();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s1out));
            bw.write("Hello Net World");
            bw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
