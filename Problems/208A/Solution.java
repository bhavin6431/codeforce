import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();
		System.out.println(s.replace("WUB", " ").trim());
	}
}