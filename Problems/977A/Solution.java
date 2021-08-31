import java.util.Arrays;
import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = scan.nextLine().split(" ");
		int a = Integer.parseInt(s[0]);
		int b = Integer.parseInt(s[1]);
		int count = 0;
		for (int i = 0; i < b; i++) {
			if (a % 10 != 0) {
				a -= 1;
			} else {
				a /= 10;
			}
		}
		System.out.println(a);
	}

}