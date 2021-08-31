import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		scan.nextLine();
		String s[] = scan.nextLine().split(" ");
		int max = 0;
		int seq = 1;
		int prev = Integer.parseInt(s[0]);
		for (int i = 1; i < s.length; i++) {
			if (prev <= Integer.parseInt(s[i])) {
				seq++;
			} else {
				max = Math.max(seq, max);
				seq = 1;
			}
			prev = Integer.parseInt(s[i]);
		}
		max = Math.max(seq, max);
		System.out.println(max);
	}
}