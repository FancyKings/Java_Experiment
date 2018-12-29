import java.util.Scanner;
/* 你的代码将被嵌入到这里 */

class Rectangle {

    private double height, width;

    Rectangle() {
        this.height = 1;
        this.width = 1;
    }

    Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    double getArea() {
        return this.height * this.width;
    }

    double getPerimeter() {
        return 2 * (this.height + this.width);
    }

}

/**
 * @author Fancyking
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double w = input.nextDouble();
        double h = input.nextDouble();
        Rectangle myRectangle = new Rectangle(w, h);
        System.out.println(myRectangle.getArea());
        System.out.println(myRectangle.getPerimeter());

        input.close();
    }

}
