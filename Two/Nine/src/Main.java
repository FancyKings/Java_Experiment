import java.util.Random;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {
    private static Scanner cin = new Scanner(System.in);
    private static int[] dic = new int[100];
    private static int ask;

    public static void main(String[] args) {
        Random sank = new Random(20482);
        for (int i = 0; i < 100; ++i) {
            dic[i] = sank.nextInt(120);
        }
        while (cin.hasNextInt()) {
            ask = cin.nextInt();
            System.out.println(find());
        }
    }

    private static int find() {
        int ans = 0;
        for (int i = 0;i < dic.length; ++i) {
            if (i == ask) {
                ++ans;
            }
        }
        return ans;
    }
}
