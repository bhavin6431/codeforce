import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = scan.nextLine().split(" ");
		int n = Integer.parseInt(s[1]);
		String[] s1 = scan.nextLine().split(" ");
		int count = 0;
		int k = Integer.parseInt(s1[n - 1]);
		for (int i = 0; i < s1.length; i++) {
			if (Integer.parseInt(s1[i]) >= k && Integer.parseInt(s1[i]) != 0) {
				count++;
			}
		}
		System.out.println(count);
	}

}