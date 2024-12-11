import database.SaiPostGRESDBConnection;
import spring.dependencyinjection.Circle;
import spring.dependencyinjection.Rectangle;
import spring.dependencyinjection.Shape;
import spring.dependencyinjection.Triangle;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        SaiPostGRESDBConnection.connectToDB();
    }
}

