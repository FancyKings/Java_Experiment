import static java.lang.System.*;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner cin = new Scanner(in);
        int[][] matrix = new int[5][];
        for (int i = 0; i < 5; ++i) {
            matrix[i] = new int[i];
            for (int j = 0; j < i; ++j) {
                matrix[i][j] = i * j;
            }
        }
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < i; ++j) {
                if (j != 0) {
                    out.print(" ");
                }
                out.printf("%d", matrix[i][j]);
            }
            out.println();
        }
    }
}
