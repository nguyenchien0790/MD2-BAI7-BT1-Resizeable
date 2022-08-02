package rikkei.academy;

public class ReziseableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Circle();
        shapes[1] = new Rectangle();
        for (Shape shape:shapes){
            System.out.println("pre-resize");
            System.out.println(shape);
            if (shape instanceof Circle){
                Resizeable resizeable = (Circle) shape;
                resizeable.resize(0.5);
                System.out.println("after-resize");
                System.out.println(shapes[0]);
            }if (shape instanceof Rectangle){
                Resizeable resizeable = (Rectangle) shape;
                resizeable.resize(2);
                System.out.println("after-resize");
                System.out.println(shapes[1]);
            }
        }
    }
}
