import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double l = input.nextDouble();
        double w = input.nextDouble();
        double h = input.nextDouble();
        Cuboid myCuboid = new Cuboid(l, w, h);
        System.out.println(myCuboid.getArea());
        System.out.println(myCuboid.getVolume());

        input.close();
    }

}

class Cuboid {

    private double l, w, h;

    public Cuboid() {
        this.l = this.w = this.h = 1;
    }

    Cuboid(double l, double w, double h) {
        this.l = l;
        this.w = w;
        this.h = h;
    }

    double getArea() {
        return 2 * (this.l * this.h + this.h * this.w + this.w * this.l);
    }

    double getVolume() {
        return this.l * this.w * this.h;
    }

}
