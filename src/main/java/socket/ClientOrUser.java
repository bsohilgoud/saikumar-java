package socket;

import java.io.*;
import java.net.Socket;

public class ClientOrUser {
    public static void connect(String serverName, int port, String userName){
        try {
            System.out.println("\n" + userName + ":\nConnecting to server on port " + port);
            Socket client = new Socket(serverName, port);

            System.out.println("\n" + userName + ":\nHi iam successfully connected to server");
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("\n" + userName + ":\nHello server i am " + userName );
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);

            System.out.println("\n" + userName + ":\nServer is saying " + in.readUTF());
            client.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
