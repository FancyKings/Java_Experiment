import java.util.Random;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {
    private static Random sank = new Random(1204);

    public static void main(String[] args) {
        int size = 6;
        int[][] dic = new int[size][size];
        int maxn = 0;
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                dic[i][j] = (int) sank.nextInt(30) % (20) + 10;
                maxn = Math.max(maxn, dic[i][j]);
            }
        }

        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                if (dic[i][j] == maxn) {
                    System.out.printf("Max position : %d %d\n", i, j);
                }
            }
        }
        int[][] transp = trans(dic);
        System.out.println("Transpose:");
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                if (j != 0) {
                    System.out.print(' ');
                }
                System.out.printf(" %d", transp[i][j]);
            }
            System.out.println();
        }
    }

    private static int[][] trans(int[][] dic) {
        int[][] ans = new int[dic[0].length][dic.length];
        for (int i = 0; i < dic[0].length; ++i) {
            for (int j = 0; j < dic.length; ++j) {
                ans[i][j] = dic[j][i];
            }
        }
        return ans;
    }
}
