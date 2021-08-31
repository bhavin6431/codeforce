import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String[] s = scan.nextLine().split(" ");
		String[] s1 = scan.nextLine().split(" ");
		Set<Integer> set = new HashSet();
		int p[] = new int[s.length - 1];
		int q[] = new int[s1.length - 1];

		for (int i = 0; i < Integer.parseInt(s[0]); i++) {
			set.add(Integer.parseInt(s[i + 1]));
		}
		for (int i = 0; i < Integer.parseInt(s1[0]); i++) {
			set.add(Integer.parseInt(s1[i + 1]));
		}

		if (set.size() == n) {
			System.out.println("I become the guy.");
		} else {
			System.out.println("Oh, my keyboard!");
		}

	}

}