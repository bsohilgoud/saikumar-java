package socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.Arrays;
import java.util.List;

public class MyServer extends Thread{
    ServerSocket serverSocket;
    List<String> products = Arrays.asList("iPhone15", "TV", "Fridge");
    public MyServer(int port) throws IOException {
        serverSocket = new ServerSocket(port);
    }

    public void run()  {
        while(true) {
            try {
                System.out.println("\n Server:\n I am Waiting for client on port " + serverSocket.getLocalPort() + "...");
                Socket user = serverSocket.accept();
                System.out.println("\n Server:\n I got a user request - " + user.getRemoteSocketAddress());
                DataInputStream in = new DataInputStream(user.getInputStream());
                System.out.println(in.readUTF());
                DataOutputStream out = new DataOutputStream(user.getOutputStream());
                out.writeUTF("\n Server \n: Thank you for coming to amazon!! \n Here are my products:" + products);
                user.close();
            } catch (SocketTimeoutException s) {
                System.out.println("Socket timed out!");
                break;
            } catch (IOException e) {
                e.printStackTrace();
                break;
            }
        }
    }
}
