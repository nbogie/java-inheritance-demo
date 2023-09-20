import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ArrayList<Shape> myShapes = createShapes();
        reportShapes(myShapes);
    }

    private static ArrayList<Shape> createShapes() {
        ArrayList<Shape> myShapes = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Shape s = Math.random() < 0.5 ?
                    new Circle(RandomTools.randomLength()) :
                    new Square(RandomTools.randomLength());
            myShapes.add(s);
        }
        return myShapes;
    }

    private static void reportShapes(ArrayList<Shape> myShapes) {
        for (Shape shape: myShapes) {
            System.out.println(shape.report());
        }
    }
}