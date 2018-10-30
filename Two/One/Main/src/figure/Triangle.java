package figure;

public class Triangle{
    private static double a, b, c;
    public double getA() {
        return Triangle.a;
    }

    public double getB() {
        return Triangle.b;
    }

    public double getC() {
        return Triangle.c;
    }

    public void setA(double a) {
        Triangle.a = a;
    }

    public void setB(double b) {
        Triangle.b = b;
    }

    public void setC(double c) {
        Triangle.c = c;
    }

    public double getPerimeter(){
        return (Triangle.a + Triangle.b + Triangle.c);
    }

    public double getArea(){
        double P = (Triangle.a + Triangle.b + Triangle.c) / 2.0;
        return (Math.sqrt(P * (P-Triangle.a) * (P-Triangle.b) * (P-Triangle.c)));
    }
}

