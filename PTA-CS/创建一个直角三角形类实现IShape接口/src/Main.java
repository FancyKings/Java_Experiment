import java.text.DecimalFormat;
import java.util.Scanner;

interface IShape {

    public abstract double getArea();

    public abstract double getPerimeter();

}

/*你写的代码将嵌入到这里*/

class RTriangle implements IShape {

    private double a, b;

    RTriangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return this.a * this.b / 2;
    }

    @Override
    public double getPerimeter() {
        return this.a + this.b + Math.sqrt(this.a * this.a + this.b * this.b);
    }

}


public class Main {

    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("#.####");
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        IShape r = new RTriangle(a, b);
        System.out.println(d.format(r.getArea()));
        System.out.println(d.format(r.getPerimeter()));
        input.close();
    }

}