import java.io.*;

/**
 * @author Fancyking
 */
public class Main {

    private static StreamTokenizer cin = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

    public static void main(String[] args) throws IOException, CheckMarkException {
        cin.nextToken();
        int numOfStudents = (int) cin.nval;
        int goodStu = 0, badStu = 0, nowCheck;
        for (int i = 0; i < numOfStudents; ++i) {
            cin.nextToken();
            nowCheck = (int) cin.nval;
            if (nowCheck > 59 && nowCheck < 101) {
                goodStu += 1;
            } else if (nowCheck > -1 && nowCheck < 60) {
                badStu += 1;
            }
            try {
                if (nowCheck < 0 || nowCheck > 100) {
                    i -= 1;
                    throw new CheckMarkException(nowCheck);
                }
            } catch (CheckMarkException o) {
                o.printStackTrace(o.toString());
            }

        }
        out.println(goodStu);
        out.println(badStu);
    }

}

class CheckMarkException extends Exception {

    private int errorNum;

    public CheckMarkException() {
        super();
    }

    CheckMarkException(int nowCheck) {
        this.errorNum = nowCheck;
    }


    public int getErrorNum() {
        return errorNum;
    }

    public void setErrorNum(int errorNum) {
        this.errorNum = errorNum;
    }

    @Override
    public String toString() {
        return String.valueOf(errorNum) + "invalid!";
    }

    void printStackTrace(String toString) {
        System.out.println(toString);
    }

}
