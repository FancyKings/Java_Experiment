import java.io.*;

/**
 * @author FancyKing
 */
public class Matrix {
    private int m, n;
    private double[][] dic;
    private StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

    Matrix(int m, int n) {
        this.m = m;
        this.n = n;
        dic = new double[m][n];
    }

    int getM() {
        return m;
    }

    int getN() {
        return n;
    }

    void set(int m, int n, double val) throws AssertionError {
        if ((m >= this.m) || (n >= this.n)) {
            throw new AssertionError("Set Out of Matrix!");
        }
        dic[m][n] = val;
    }

    public double get(int m, int n) throws AssertionError {
        if ((m >= this.m) || (n >= this.n)) {
            throw new AssertionError("Get Out of Matrix!");
        }
        return dic[m][n];
    }

    public int width() {
        return n;
    }

    public int height() {
        return m;
    }

    void print() {
        for (int i = 0; i < this.m; ++i) {
            for (int j = 0; j < this.n; ++j) {
                if (j != 0) {
                    out.print(" ");
                }
                out.print(dic[i][j]);
            }
            out.println();
        }
    }

    Matrix add(Matrix b) {
        if (this.m != b.m || this.n != b.n) {
            out.println("Can't Add Two Matrix!");
            return new Matrix(0, 0);
        }
        Matrix ans = new Matrix(this.m, this.n);
        for (int i = 0; i < this.m; ++i) {
            for (int j = 0; j < this.n; ++j) {
                ans.dic[i][j] = this.dic[i][j] + b.dic[i][j];
            }
        }
        return ans;
    }

    /**
     * @ method : 求矩阵的转置
     */
    Matrix transpose() {
        Matrix ans = new Matrix(this.n, this.m);
        for (int i = 0; i < this.n; ++i) {
            for (int j = 0; j < this.m; ++j) {
                ans.set(i, j, this.dic[j][i]);
            }
        }
        return ans;
    }

    Matrix multiply(Matrix b) throws AssertionError {
        if (this.n != b.m) {
            out.println("Multiply Two Matrix Error!");
            return new Matrix(0, 0);
        }
        Matrix ans = new Matrix(this.m, b.n);
        for (int i = 0; i < ans.getM(); ++i) {
            for (int j = 0; j < ans.getN(); ++j) {
                for (int k = 0; k < this.getN(); ++k) {
                    ans.dic[i][j] += this.dic[i][k] * b.dic[k][j];
                }
            }
        }
        return ans;
    }
}
