import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int total = 0;
		scan.nextLine();
		for (int i = 0; i < t; i++) {
			int count = 0;
			String[] s = scan.nextLine().split(" ");
			if (s[0].equals("1"))
				count++;
			if (s[1].equals("1"))
				count++;
			if (s[2].equals("1"))
				count++;
			if (count > 1) {
				total++;
			}
		}
		System.out.println(total);

	}

}