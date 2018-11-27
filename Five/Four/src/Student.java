import java.io.*;
import java.nio.file.Paths;

/**
 * @author Fancyking
 */
class Student {

    private String name, course;
    private int stuID, grade;
    private static String saveDir = "./data.dat";

    Student(int stuID, String name, String course, int grade) {
        this.stuID = stuID;
        this.name = name;
        this.course = course;
        this.grade = grade;
    }

    static boolean addStudent(Object o) throws IOException {
        if (!(o instanceof Student)) {
            System.out.println("Unrecognized type");
            return false;
        } else {
            File file = new File(String.valueOf(Paths.get(saveDir)));
            if (!file.exists()) {
                System.out.println("Creat File Succeed");
                boolean isOK = file.createNewFile();
                if (!isOK) {
                    System.out.println("Creat File Error");
                }
            }
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(o.toString());
            fileWriter.close();
            return true;
        }
    }

    static void showStudent() throws IOException {
        File file = new File(String.valueOf(Paths.get(saveDir)));
        if (!file.exists()) {
            System.out.println("No Dat File");
            return;
        }
        BufferedReader fReader = new BufferedReader(new FileReader(file));
        String now;
        while ((now = fReader.readLine()) != null) {
            now = now.trim();
            System.out.println(now);
        }
        fReader.close();
    }

    @Override
    public String toString() {
        return this.name + " " + this.stuID + " " + this.course + " " + this.grade + "\n";
    }
}
