import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int s = scan.nextInt();
		int max = 0;
		scan.nextLine();
		int p = 0;
		for (int i = 0; i < s; i++) {
			String s1[] = scan.nextLine().split(" ");
			int off = Integer.parseInt(s1[0]);
			int on = Integer.parseInt(s1[1]);
			p -= off;
			p += on;
			max = Math.max(max, p);
		}
		System.out.println(max);

	}

}