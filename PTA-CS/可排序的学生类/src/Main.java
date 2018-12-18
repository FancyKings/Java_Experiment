import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Student[] stus = new Student[3];

        for (int i = 0; i < 3; i++) {
            int no = scan.nextInt();
            String name = scan.next();
            Student s = new Student(no, name);
            stus[i] = s;
        }
        //将stus中的3个学生对象，放入到HashSet中
        HashSet<Student> stuSet = new HashSet<Student>();
        for (Student s : stus) {
            stuSet.add(s);
        }
        //要放入的第4个Student
        Student fourth = new Student(scan.nextInt(), scan.next());
        stuSet.add(fourth);//如果fourth的学号（no）与stuSet中的已有学生的no重复则无法放入
        System.out.println(stuSet.size());

        Arrays.sort(stus);//对stus中的3个原有对象，按照姓名首字符有小到大排序
        for (int i = 0; i < stus.length; i++) {
            System.out.println(stus[i]);//输出的格式为：no=XX&name=YY
        }

        scan.close();
    }

}
/* 请在这里填写答案 */

class Student implements Comparable<Student> {

    private String name;
    private int no;

    Student(int no, String name) {
        this.name = name;
        this.no = no;
    }

    @Override
    public boolean equals(Object o) {
        return (o instanceof Student) && (this.no == ((Student) o).no);
    }

    @Override
    public int hashCode() {
        return this.no;
    }

    @Override
    public int compareTo(Student o) {
        return (this.name.compareTo(o.name));
    }

    @Override
    public String toString() {
        return "no=" + this.no + "&name=" + this.name;
    }

}