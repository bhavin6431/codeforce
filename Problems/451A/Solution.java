import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		String s[] = scan.nextLine().split(" ");
		int m = Integer.parseInt(s[0]);
		int n = Integer.parseInt(s[1]);

		int min = Math.min(m, n);

		if (min % 2 == 0) {
			System.out.println("Malvika");
		} else {
			System.out.println("Akshat");
		}
	}
}