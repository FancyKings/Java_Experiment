import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	private static Scanner cin = new Scanner(System.in);
	private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
	
	public static void main(String[] args) {
		String name = cin.next();
		int age = cin.nextInt();
		String sex = cin.next();
		Student stu = new Student(name, sex, age);
		out.println(stu.toString());
		out.close();
	}
}

class Student {
	
	private String name;
	private String sex;
	private int age;
	
	Student(String name, String sex, int age) {
		this.name = name;
		this.sex = sex;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Student [name='" + this.name + "', sex='" + this.sex + "', age=" + this.age + "]";
	}
}