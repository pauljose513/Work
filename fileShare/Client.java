import java.io.*;
import java.net.*;
 class Client{
    public static void main(String args[])throws Exception{
        Socket s = new Socket(InetAddress.getByName("192.168.1.5"), 7575);
        DataOutputStream dos = new DataOutputStream(s.getOutputStream());
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String str1;
        while(!((str1 = kb.readLine()).equals("Exit"))){
            dos.writeBytes(str1 + '\n');
        }
        dos.close();
        kb.close();
        s.close();
    }
 }