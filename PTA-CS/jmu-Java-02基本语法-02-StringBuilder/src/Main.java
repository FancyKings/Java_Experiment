import java.io.*;

/**
 * @author Fancyking
 */
public class Main {

    private static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

    public static void main(String[] args) throws IOException {
        while (cin.nextToken() != StreamTokenizer.TT_EOF) {
            int n = (int) cin.nval;
            cin.nextToken();
            int bg = (int) cin.nval;
            cin.nextToken();
            int ed = (int) cin.nval;
            StringBuilder ans = new StringBuilder("");
            for (int i = 0; i < n; ++i) {
                ans.append(i);
            }
            out.println(ans.subSequence(bg, ed));
        }
    }

}
