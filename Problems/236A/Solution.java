import java.util.Arrays;
import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine().toLowerCase();
		int f[] = new int[26];
		Arrays.fill(f, 0);
		for (int i = 0; i < name.length(); i++) {
			f[name.charAt(i) - 97]++;
		}
		int count = 0;
		for (int i = 0; i < f.length; i++) {
			if (f[i] >= 1) {
				count++;
			}
		}
		if (count % 2 == 0) {
			System.out.println("CHAT WITH HER!");
		} else {
			System.out.println("IGNORE HIM!");
		}
	}

}