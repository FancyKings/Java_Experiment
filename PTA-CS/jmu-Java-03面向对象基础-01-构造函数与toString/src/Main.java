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

    public static void main(String[] args) {
        int n = cin.nextInt();
        List<Person> dic = new ArrayList<>(n);
        String name;
        int age;
        boolean gender;
        for (int i = 0; i < n; ++i) {
            name = cin.next();
            age = cin.nextInt();
            gender = cin.nextBoolean();
            dic.add(new Person(name, age, gender));
        }
        for (int i = dic.size() - 1; i >= 0; --i) {
            out.println(dic.get(i).toString());
        }
        Person emptyPerson = new Person();
        out.println(emptyPerson.toString());
    }

}

class Person {

    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
    private String name;
    private int age;
    private boolean gender;
    private int id;

    Person() {
        out.println("This is constructor");
        out.println(this.name + "," + this.age + "," + this.gender + "," + this.id);
    }

    Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person [name=" + this.name + ", age=" + this.age + ", gender=" + this.gender + ", id=" + this.id + "]";
    }

}