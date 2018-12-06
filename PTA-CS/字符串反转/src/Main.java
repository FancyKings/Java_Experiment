import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        String in;
        while(cin.hasNext()){
            in = cin.next();
            System.out.println(new StringBuilder(in).reverse());
        }
    }
}
