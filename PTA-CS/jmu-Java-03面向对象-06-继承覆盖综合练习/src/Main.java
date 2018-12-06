import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author Fancyking
 */
public class Main {

    private static Scanner cin = new Scanner(System.in);
    private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
    private static List<Person> personList = new ArrayList<>(16);
    private static String cmd;

    public static void main(String[] args) {

        readInData();

        sortFunc();

        printOutData();

        goNextOrNot();
    }

    private static void goNextOrNot() {
        String sEXIT = "exit";
        String sRETURN = "return";
        cmd = cin.next();
        if ((!sEXIT.equals(cmd) && !sRETURN.equals(cmd))) {
            List<Student> stuList = new ArrayList<>(16);
            List<Employee> empList = new ArrayList<>(16);

            for (Person now : personList) {
                if (now instanceof Student) {
                    if (!stuList.contains(now)) {
                        stuList.add((Student) now);
                    }
                }
                if (now instanceof Employee) {
                    if (!empList.contains(now)) {
                        empList.add((Employee) now);
                    }
                }
            }
            out.println("stuList");
            for (Student now : stuList) {
                out.println(now.toString());
            }
            out.println("empList");
            for (Employee now : empList) {
                out.println(now.toString());
            }
        }

    }

    private static void printOutData() {
        for (Person o : personList) {
            out.println(o.toString());
        }
    }

    private static void sortFunc() {
        personList.sort((o1, o2) -> {
            if (o1.getString().compareTo(o2.getString()) < 0) {
                return -1;
            } else if (o1.getString().compareTo(o2.getString()) > 0) {
                return 1;
            } else {
                return o1.getAge() - o2.getAge();
            }
        });
    }

    private static void readInData() {
        while (cin.hasNext()) {
            cmd = cin.next();
            int age;
            boolean gender;
            String name;
            if ("s".equals(cmd)) {
                name = cin.next();
                age = cin.nextInt();
                gender = cin.nextBoolean();
                String stuNo = cin.next();
                String clazz = cin.next();
                personList.add(new Student(name, age, gender, stuNo, clazz));
            } else if ("e".equals(cmd)) {
                name = cin.next();
                age = cin.nextInt();
                gender = cin.nextBoolean();
                double salary = cin.nextDouble();
                String company = cin.next();
                if ("null".equals(company)) {
                    personList.add(new Employee(name, age, gender, new Company("null"), salary));
                } else {
                    personList.add(new Employee(name, age, gender, new Company(company), salary));
                }
            } else {
                break;
            }
        }
    }

}

class Person {

    private String name;
    private int age;
    private boolean gender;

    Person(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.name + "-" + age + "-" + gender;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Person) {
            return this.name.equals(((Person) o).name) && this.age == ((Person) o).age && this.gender == ((Person) o).gender;
        } else {
            return false;
        }
    }

    String getString() {
        return this.name;
    }

    int getAge() {
        return this.age;
    }

}

class Student extends Person {

    private String stuNo, clazz;

    Student(String name, int age, boolean gender, String stuNo, String clazz) {
        super(name, age, gender);
        this.stuNo = stuNo;
        this.clazz = clazz;
    }

    @Override
    public String toString() {
        return "Student:" + super.toString() + "-" + stuNo + "-" + clazz;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Student) {
            return super.equals(o) && this.stuNo.equals(((Student) o).stuNo) && this.clazz.equals(((Student) o).clazz);
        } else {
            return false;
        }
    }

}

class Company {

    private String name;

    Company(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Company) {
            return ((Company) o).name.equals(this.name);
        } else {
            return false;
        }
    }

}

class Employee extends Person {

    private Company company;
    private double salary;

    Employee(String name, int age, boolean gender, Company company, double salary) {
        super(name, age, gender);
        this.salary = salary;
        this.company = company;
    }

    @Override
    public String toString() {
        return "Employee:" + super.toString() + "-" + company.toString() + "-" + salary;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Employee) {
            Employee t = (Employee) obj;
            if (super.equals(obj)) {
                DecimalFormat p = new DecimalFormat("#.#");
                return t.company.equals(company) && p.format(t.salary).equals(p.format(salary));
            }
            return false;
        } else {
            return false;
        }
    }

}
