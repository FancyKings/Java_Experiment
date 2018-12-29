/**
 * 这个实在是无法决定风格，就像函数题目一样
 *
 * @author Fancyking
 */
public class Main {

    public static void main(String[] args) {
        new RR(true);
    }

}

class RR {

    public RR() {
        System.out.print("8");
    }

    public RR(int x) {
        this();
        System.out.print(".");
    }

    public RR(boolean b) {
        this(1);
        System.out.print("00");
    }

}