import figure.*;
import java.util.*;
import static java.lang.System.*;

public class Main{
    public static void main(String[] args) {
        Scanner cin = new Scanner(in);
        // Circle Part
        Circle C = new Circle();
        double cR = cin.nextDouble();
        C.setR(cR);
        out.println("Circle:");
        out.printf("%f %f\n", C.getPerimeter(), C.getArea());
        // Triangle Part
        double a = cin.nextDouble(),
                b = cin.nextDouble(),
                c = cin.nextDouble();
        Triangle T = new Triangle();
        T.setA(a);
        T.setB(b);
        T.setC(c);
        out.println("Triangle:");
        out.printf("%f %f\n", T.getPerimeter(), T.getArea());
        // Rectangle Part
        a = cin.nextDouble();
        b = cin.nextDouble();
        Rectangle R = new Rectangle();
        R.setA(a);
        R.setB(b);
        out.println("Rectangle:");
        out.printf("%f %f\n", T.getPerimeter(), T.getArea());
    }
}
