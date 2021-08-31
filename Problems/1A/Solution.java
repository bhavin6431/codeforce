import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = scan.nextLine().split(" ");

		long m = Long.parseLong(s[0]);
		long n = Long.parseLong(s[1]);
		long a = Long.parseLong(s[2]);

		long top = m % a == 0 ? m / a : (m / a) + 1;
		long bottom = n % a == 0 ? n / a : (n / a) + 1;

		System.out.println(top * bottom);

	}

}