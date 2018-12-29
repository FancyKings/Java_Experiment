import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
    private static List<Person> dic = new ArrayList<>(16);

    public static void main(String[] args) {
        int n = cin.nextInt();
        for (int i = 0; i < n; ++i) {
            dic.add(new Person(cin.next(), cin.nextInt(), cin.nextBoolean()));
        }
        for (int i = dic.size() - 1; i >= 0; --i) {
            out.println(dic.get(i).toString());
        }
        Person emptyPerson = new Person();
        out.println(emptyPerson);
    }

}

class Person {

    private static int cntID = 0;
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);

    static {
        out.println("This is static initialization block");
    }

    private String name;
    private boolean gender;
    private int age;
    private int id;

    Person() {
        this.id = cntID++;
        out.println("This is initialization block, id is " + this.id);
        out.println("This is constructor");
        out.println(this.name + "," + this.age + "," + this.gender + "," + this.id);
    }

    Person(String name, int age, boolean gender) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = cntID++;
        out.println("This is initialization block, id is " + this.id);
    }

    @Override
    public String toString() {
        return "Person [" +
                "name=" + name +
                ", age=" + age +
                ", gender=" + gender +
                ", id=" + id +
                ']';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}