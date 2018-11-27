import java.nio.file.Paths;

/**
 * @author Fancyking
 */
public class Main {
    public static void main(String[] args) {
        String dir = "./";
        FileList.printContentsInOneDirectory(String.valueOf(Paths.get(dir)));
    }
}
