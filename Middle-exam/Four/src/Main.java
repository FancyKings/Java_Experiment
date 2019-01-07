import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {
    private static Scanner cin = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] src = {100, 101, 102, 103, 104, 105};
        String dir = "./dest.txt";
        try {
            FileWriter fileWriter = new FileWriter(dir, true);
            for (int now : src) {
                fileWriter.write(String.valueOf(now) + '\n');
            }
            fileWriter.close();
        } catch (IOException o) {
            o.printStackTrace();
        }
        try {
            FileWriter fileWriter = new FileWriter(dir, true);
            for (int i = src.length - 1; i >= 0; --i) {
                fileWriter.write(String.valueOf(src[i]) + '\n');
            }
            fileWriter.close();
        } catch (IOException o) {
            o.printStackTrace();
        }

        try {
            FileReader fileReader = new FileReader(dir);
            char[] ans = new char[100];
            while ((fileReader.read(ans)) != -1) {
                System.out.println(ans);
            }
            fileReader.close();
        } catch (IOException o) {
            o.printStackTrace();
        }
    }
}
