import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	private static Scanner cin = new Scanner(System.in);
	private static PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out), true);
	
	public static void main(String[] args) {
		int a = cin.nextInt();
		int b = cin.nextInt();
		if(a > b) {
			out.println(a);
		} else {
			out.println(b);
		}
	}
}
