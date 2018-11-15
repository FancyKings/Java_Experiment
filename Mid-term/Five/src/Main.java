public class Main {
    private static int n1;
    private static int n2;

    public static void setNn(int n1t, int n2t) {
        Main.n1 = n1t;
        Main.n2 = n2t;
    }

    public static void main(String[] args) {
        Main.n1 = 10;
        Main.n2 = 5;
        System.out.println(Main.addition(n1, n2));
        System.out.println(Main.subtration(n1, n2));
        System.out.println(Main.multiply(n1, n2));
        System.out.println(Main.divid(n1, n2));
    }

    private static int addition(int n1, int n2) {
        return n1 + n2;
    }

    private static int subtration(int n1, int n2) {
        return n1 - n2;
    }

    private static int multiply(int n1, int n2) {
        return n1 * n2;
    }

    private static int divid(int n1, int n2) {
        if (n2 == 0) {
            return 0;
        }
        return n1 / n2;
    }

    public static int getN2() {
        return n2;
    }

    public static void setN2(int n2) {
        Main.n2 = n2;
    }

    public static int getN1() {
        return n1;
    }

    public static void setN1(int n1) {
        Main.n1 = n1;
    }
}
