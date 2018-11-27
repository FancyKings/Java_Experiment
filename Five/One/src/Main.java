import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Fancyking
 */
public class Main {

    private static List<String> dic = new ArrayList<>(16);

    public static void main(String[] args) throws IOException {
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        String now;
        String exit = "exit";
        do {
            now = cin.readLine();
            if (exit.equals(now)) {
                saveFile();
            } else {
                dic.add(now);
                System.out.println(now);
            }
        } while (!exit.equals(now));
        cin.close();
    }

    private static void saveFile() throws IOException {
        String writeDir = "./log.txt";
        File point = new File(writeDir);
        BufferedWriter fw = new BufferedWriter(new FileWriter(point));
        if (!point.exists()) {
            if (!point.createNewFile()) {
                System.out.println("Creat File Error");
            }
        }
        if (point.exists()) {
            for (String now : dic) {
                fw.write(now);
            }
        }
        fw.close();
    }
}
