import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Map<String, Integer> cp = new HashMap<>();
        int num = cin.nextInt();
        cin.nextLine();
        for (int i = 0; i < num; ++i) {
            String in = cin.nextLine();
            StringBuffer a = new StringBuffer();
            int b = 0;
            int k;
            for (k = 0; k < in.length(); ++k) {
                if (in.charAt(k) == ':') {
                    break;
                }
                else {
                    a.append(in.charAt(k));
                }
            }
            for (++k; k < in.length(); ++k) {
                if (in.charAt(k) >= '0' && in.charAt(k) <= '9') {
                    b *= 10;
                    b += (int) in.charAt(k) - (int) '0';
                }
            }
            cp.put(a.toString(), b);
        }
        int all = 0;
        for (Map.Entry<String, Integer> now : cp.entrySet()) {
            System.out.printf("%s : %d\n", now.getKey(), now.getValue());
            all += now.getValue();
        }
        System.out.print(all);
    }
}
