import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String s = scan.nextLine();

		char prev = 'a';
		char prevprev = 'a';
		boolean found = true;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1' || s.charAt(i) == '4') {
				if (s.charAt(i) == '1') {
					prevprev = prev;
					prev = s.charAt(i);
					continue;
				}
				if ((s.charAt(i) == '4' && prev == '1') || (s.charAt(i) == '4' && prev == '4' && prevprev == '1')) {
					prevprev = prev;
					prev = s.charAt(i);
					continue;
				} else {
					found = false;
					break;
				}
			} else {
				found = false;
				break;
			}

		}

		if (!found) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}
}