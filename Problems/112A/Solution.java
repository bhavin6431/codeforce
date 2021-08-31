import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.nextLine().toLowerCase();
		String s2 = scan.nextLine().toLowerCase();
		boolean flag = false;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) < s2.charAt(i)) {
				System.out.println(-1);
				flag = true;
				break;
			} else if (s1.charAt(i) > s2.charAt(i)) {
				System.out.println(1);
				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println(0);
		}
	}

}