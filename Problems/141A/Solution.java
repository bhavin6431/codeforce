import java.util.Arrays;
import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String f = scan.nextLine().toLowerCase();
		String s = scan.nextLine().toLowerCase();
		String m = scan.nextLine().toLowerCase();
		int fr[] = new int[26];
		Arrays.fill(fr, 0);
		boolean flag = false;
		for (int i = 0; i < f.length(); i++) {
			fr[f.charAt(i) - 97]++;
		}
		for (int i = 0; i < s.length(); i++) {
			fr[s.charAt(i) - 97]++;
		}
		for (int i = 0; i < m.length(); i++) {
			if (fr[m.charAt(i) - 97] > 0) {
				fr[m.charAt(i) - 97]--;
			} else {
				flag = true;
				break;
			}
		}
		for (int i = 0; i < fr.length; i++) {
			if (fr[i] > 0) {
				flag = true;
			}
		}
		System.out.println(flag ? "NO" : "YES");
	}

}