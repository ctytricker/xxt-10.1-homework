import java.util.ArrayList;
import java.util.Scanner;

public class ShapeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        String line = sc.nextLine();
        Scanner sc2 = new Scanner(line);

        while (sc2.hasNext()) {
            list.add(sc2.nextInt());
        }
        if (list.size() == 2) {
            Circle circle = new Circle(list.get(1));
            subOne(circle);
            Cylinder cylinder = new Cylinder(list.get(0), circle);
            System.out.println(cylinder);
        } else if (list.size() == 3) {
            Rectangle rectangle = new Rectangle(list.get(1), list.get(2));
            subOne(rectangle);
            Cylinder cylinder = new Cylinder(list.get(0), rectangle);
            System.out.println(cylinder);
        } else {
            Triangle triangle = new Triangle(list.get(1), list.get(2), list.get(3));
            subOne(triangle);
            Cylinder cylinder = new Cylinder(list.get(0), triangle);
            System.out.println(cylinder);
        }
    }

    public static void subOne(Shape shape) {
        if (shape instanceof Circle) {
            Circle c = (Circle) shape;
            c.setRadius(c.getRadius() - 1);
        } else if (shape instanceof Rectangle) {
            Rectangle r = (Rectangle) shape;
            r.setLength(r.getLength() - 1);
            r.setWidth(r.getWidth() - 1);
        } else if (shape instanceof Triangle) {
            Triangle t = (Triangle) shape;
            t.setA(t.getA() - 1);
            t.setB(t.getB() - 1);
            t.setC(t.getC() - 1);
        }
    }
}