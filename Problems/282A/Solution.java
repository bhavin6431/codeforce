import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int ans = 0;
		scan.nextLine();
		for (int i = 0; i < s; i++) {
			String s1 = scan.nextLine();
			if (s1.contains("++")) {
				ans++;
			} else {
				ans--;
			}
		}

		System.out.println(ans);
	}

}