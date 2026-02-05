package lab1;
import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		
		String line = "-";
		line = line.repeat(name.length());
		
		System.out.println("+" + line + "+");
		System.out.println("|" + name + "|");
		System.out.println("+" + line + "+");
	}

}