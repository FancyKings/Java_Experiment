import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    private static List<Student> dic = new ArrayList<>(16);
    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

    public static void main(String[] args) {
        final String exit = "exit";
        String name, className;
        int stuID, mark;
        while (cin.hasNext()) {
            String line = cin.nextLine();
            String[] lins = line.split(",");
            if (lins.length == 1 && lins[0].equals(exit)) {
                break;
            } else {
                name = lins[0];
                stuID = Integer.valueOf(lins[1]);
                className = lins[2];
                mark = Integer.valueOf(lins[3]);
                boolean ok = false;
                for (Student student : dic) {
                    if (student.getStuID() == stuID) {
                        student.setMark(mark);
                        ok = true;
                    }
                }
                if (!ok) {
                    dic.add(new Student(name, stuID, className, mark));
                }
            }
        }
        dic.sort((o1, o2) -> {
            if (o1.getMark() == o2.getMark()) {
                return o1.getStuID() - o2.getStuID();
            } else {
                return o2.getMark() - o1.getMark();
            }
        });
        int rank = 1;
        for (Student now : dic) {
            out.println("No" + rank++ + ":" + now.toString());
        }
    }

}

class Student {

    private String name;
    private int stuID;
    private String className;
    private int mark;

    Student(String name, int stuID, String className, int mark) {
        this.name = name;
        this.stuID = stuID;
        this.className = className;
        this.mark = mark;
    }

    int getMark() {
        return this.mark;
    }

    void setMark(int mark) {
        this.mark += mark;
    }

    int getStuID() {
        return this.stuID;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            Student so = (Student) o;
            return so.stuID == this.stuID;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return this.stuID + "," + this.name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

}
