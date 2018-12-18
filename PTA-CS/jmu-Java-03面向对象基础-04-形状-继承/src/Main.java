import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

    private static List<Shape> list = new ArrayList<>(16);

    public static void main(String[] args) {

        readInData();

        out.println(sumAllPerimeter(list));
        out.println(sumAllArea(list));

        printTypeList();

        printClass();

    }

    private static void printClass() {
        for (Object now : list) {
            out.printf("%s,%s\n", now.getClass(), now.getClass().getSuperclass());
        }
    }

    private static void printTypeList() {
        String ansType = Arrays.toString(new List[]{list});
        for (int i = 1; i < ansType.length() - 1; ++i) {
            out.print(ansType.charAt(i));
        }
        out.println();
    }

    private static void readInData() {
        final String rect = "rect";
        final String cir = "cir";
        int numOfShape, width, length, radius;
        String shapeType;

        numOfShape = cin.nextInt();
        while (numOfShape-- != 0) {
            shapeType = cin.next();
            if (rect.equals(shapeType)) {
                width = cin.nextInt();
                length = cin.nextInt();
                list.add(new Rectangle(width, length));
            }
            if (cir.equals(shapeType)) {
                radius = cin.nextInt();
                list.add(new Circle(radius));
            }
        }
    }

    private static double sumAllArea(List o) {
        double ansArea = 0D;
        for (Object now : o) {
            if (now instanceof Circle) {
                ansArea += ((Circle) now).geArea();
            }
            if (now instanceof Rectangle) {
                ansArea += ((Rectangle) now).geArea();
            }
        }
        return ansArea;
    }

    private static double sumAllPerimeter(List o) {
        double ansPerimeter = 0D;
        for (Object now : o) {
            if (now instanceof Rectangle) {
                ansPerimeter += ((Rectangle) now).getPerimeter();
            }
            if (now instanceof Circle) {
                ansPerimeter += ((Circle) now).getPerimeter();
            }
        }
        return ansPerimeter;
    }

}

abstract class Shape {

    final double PI = 3.14;

    public abstract double getPerimeter();

    public abstract double geArea();

}

class Rectangle extends Shape {

    private int width, length;

    Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double getPerimeter() {
        return (this.width + this.length) * 2;
    }

    @Override
    public double geArea() {
        return (this.width * this.length);
    }

    @Override
    public String toString() {
        return "Rectangle [width=" + this.width + ", length=" + this.length + "]";
    }

}

class Circle extends Shape {

    private int radius;

    Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * this.radius;
    }

    @Override
    public double geArea() {
        return PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Circle [radius=" + this.radius + "]";
    }

}
