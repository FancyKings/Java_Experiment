import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 输入10个整数，输出这10个整数的的平均数，要求输出的平均数保留2位小数
 *
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) {
        int maxFor = 10;
        BigDecimal ans = BigDecimal.valueOf(0);
        for (int i = 0; i < maxFor; ++i) {
            ans = ans.add(cin.nextBigDecimal());
        }
        DecimalFormat df = new DecimalFormat("0.00");
        ans = ans.divide(new BigDecimal(maxFor));
        String dans = df.format(ans);
        System.out.println(dans);
    }

}
