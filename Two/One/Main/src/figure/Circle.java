package figure;

public class Circle{
    private static double R;

    public double getR(){
        return Circle.R;
    }

    public void setR(double a){
        Circle.R = a;
    }

    public double getPerimeter(){
        return (2 * Math.acos(-1) * Circle.R);
    }

    public double getArea(){
        return (Math.acos(-1) * Circle.R * Circle.R);
    }
}