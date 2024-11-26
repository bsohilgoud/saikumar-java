import spring.dependencyinjection.Circle;
import spring.dependencyinjection.Rectangle;
import spring.dependencyinjection.Shape;
import spring.dependencyinjection.Triangle;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
//            // Conside triangle is old and outdated -> example MySQL speed 400ms
//            Triangle triangle= new Triangle();
//            triangle.draw();
//
//            // Example PostGRES = latest = 100ms
//            Circle circle = new Circle();
//            circle.draw();

            //Abstraction
            Shape shape = new Rectangle();
            shape.draw();

//            @Autowired
//            Shape shape;
    }
}

