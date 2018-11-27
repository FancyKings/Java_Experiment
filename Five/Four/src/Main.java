import java.io.IOException;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    public static void main(String[] args) throws IOException {
        int grade, id;
        String name, course;
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            id = cin.nextInt();
            name = cin.next();
            course = cin.next();
            grade = cin.nextInt();
            boolean isOK = Student.addStudent(new Student(id, name, course, grade));
            if (!isOK) {
                System.out.println("Save Student Fail");
            }
        }
        Student.showStudent();
        cin.close();
    }
}
