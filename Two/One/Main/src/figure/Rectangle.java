package figure;

public class Rectangle{
    private static double a, b;

    public  void setB(double b) {
        Rectangle.b = b;
    }

    public  void setA(double a) {
        Rectangle.a = a;
    }

    public double getB() {
        return Rectangle.b;
    }

    public double getA() {
        return Rectangle.a;
    }

    public double getPerimeter(){
        return (2 * (Rectangle.a + Rectangle.b));
    }

    public double getArea(){
        return (Rectangle.a * Rectangle.b);
    }
}