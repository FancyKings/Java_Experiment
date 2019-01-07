import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        String in;
        while (cin.hasNextLine()) {
            in = cin.nextLine();
            int len = in.length();
            for (int i = len - 1; i >= 0; --i) {
                System.out.print(in.charAt(i));
            }
            System.out.println();
        }
    }
}
