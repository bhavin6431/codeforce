import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);

		String s[] = scan.nextLine().split(" ");
		int st = Integer.parseInt(s[0]);
		int n = Integer.parseInt(s[1]);
		String s1[] = scan.nextLine().split(" ");
		int v[] = new int[s1.length];
		for (int i = 0; i < n; i++) {
			v[i] = Integer.parseInt(s1[i]);
		}
		Arrays.sort(v);
		int min = Integer.MAX_VALUE;
		for (int i = 0; i <= v.length - st; i++) {
			min = Math.min(min, v[i + st - 1] - v[i]);
		}
		System.out.println(min == Integer.MAX_VALUE ? 0 : min);
	}
}