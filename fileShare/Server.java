import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
class Server{
    public static void main(String args[])throws Exception{
        System.out.println("Connecting...");
        ServerSocket ss = new ServerSocket(8080);
        Socket s = ss.accept();
        System.out.println("Connection Establised");
        BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
        String str1;
        while(true){
            while((str1 = br.readLine() )!= null){
                System.out.println(str1);
            }
        br.close();
        s.close();
        ss.close();
        System.exit(0);
        }
    }
}