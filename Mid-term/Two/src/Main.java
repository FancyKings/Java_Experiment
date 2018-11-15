import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {
    private static Scanner cin = new Scanner(System.in);

    private static int[] init() {
        int[] dic = new int[11];
        dic[0] = 87;
        dic[1] = 76;
        dic[2] = 54;
        dic[3] = 43;
        dic[4] = 42;
        dic[5] = 39;
        dic[6] = 30;
        dic[7] = 15;
        return dic;
    }

    private static int[] insert(int[] dic, int key) {
        int pos = 0, len = dic.length;
        while (dic[pos] > key) {
            ++pos;
        }
        if (len - 1 - pos >= 0) {
            System.arraycopy(dic, pos, dic, pos + 1, len - 1 - pos);
        }
        dic[pos] = key;
        return dic;
    }

    public static void main(String[] args) {
        int[] dic = init();
        dic = insert(dic, 40);
        dic = insert(dic, 10);
        dic = insert(dic, 92);
        for (int i : dic) {
            System.out.printf(" %d", i);
        }
        System.out.println();
    }
}
