import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int ans = 0;
		scan.nextLine();
		String s = scan.nextLine();
		char prev = s.charAt(0);
		int count = 0;
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != prev) {
				prev = s.charAt(i);
			} else {
				ans++;
			}
		}
		System.out.println(ans);
	}

}