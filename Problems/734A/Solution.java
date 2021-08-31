import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		scan.nextLine();
		String s = scan.nextLine();
		int numA = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'A') {
				numA++;
			}
		}
		System.out.println(numA > n - numA ? "Anton" : (numA == n - numA ? "Friendship" : "Danik"));
	}
}