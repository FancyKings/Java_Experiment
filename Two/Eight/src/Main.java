import java.io.*;

/**
 * @author Lab
 */
public class Main {
    private static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

    public static void main(String[] args) throws IOException {
        int m, n;
        while (cin.nextToken() != StreamTokenizer.TT_EOF) {
            m = (int) cin.nval;
            cin.nextToken();
            n = (int) cin.nval;

            Matrix p = new Matrix(m, n);
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    cin.nextToken();
                    p.set(i, j, cin.nval);
                }
            }
            cin.nextToken();
            m = (int) cin.nval;
            cin.nextToken();
            n = (int) cin.nval;
            Matrix q = new Matrix(m, n);
            for (int i = 0; i < m; ++i) {
                for (int j = 0; j < n; ++j) {
                    cin.nextToken();
                    q.set(i, j, cin.nval);
                }
            }
            out.println("First Matrix:");
            p.print();
            out.println("Second Matrix:");
            q.print();
            out.println("Add answer:");
            Matrix addmN = p.add(q);
            addmN.print();
            Matrix mTranspose = p.transpose();
            out.println("First Matrix Transpose:");
            mTranspose.print();
            Matrix nTranspose = q.transpose();
            out.println("Second Matrix Transpose:");
            nTranspose.print();
            Matrix mul = p.multiply(q);
            out.println("Two Matrix Multiply:");
            mul.print();
        }
        out.close();
    }
}
