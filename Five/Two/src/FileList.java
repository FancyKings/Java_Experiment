import java.io.File;
import java.nio.file.Paths;

/**
 * @author Fancyking
 */
class FileList {
    private static String getSpace(int num) {
        StringBuilder ans = new StringBuilder();
        while (num > 0) {
            ans.append("-");
            num--;
        }
        return ans.toString();
    }

    private static int initSpaceNum = 0;

    static void printContentsInOneDirectory(String path) {
        File dir = new File(String.valueOf(Paths.get(path)));
        File[] dicFiles = dir.listFiles();
        if (dicFiles == null) {
            System.out.println("No File Exits");
            return;
        }
        for (File now : dicFiles) {
            if (now.isFile()) {
                System.out.println(getSpace(initSpaceNum) + "[File]" + now.getName());
            } else if (now.isDirectory()) {
                System.out.println(getSpace(initSpaceNum) + "[Directory]" + now.getName());
                initSpaceNum += 2;
                printContentsInOneDirectory(now.getPath());
                initSpaceNum -= 2;
            }
        }
    }
}
