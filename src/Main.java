import socket.ClientOrUser;
import socket.MyServer;

import java.io.IOException;
import java.net.ServerSocket;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        // Amazon server
        MyServer amazon = new MyServer(1000);
        amazon.start();

        Thread.sleep(2000);

        System.out.println("::::::::Sai Kumar:::::::");
        ClientOrUser.connect("localhost", 1000, "Sai Kumar");
        Thread.sleep(5000);
        System.out.println("::::::::Sohil:::::::");
        ClientOrUser.connect("localhost", 1000, "Sohil");
    }
}

