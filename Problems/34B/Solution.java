import java.util.Arrays;
import java.util.Scanner;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String[] str = scan.nextLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int m = Integer.parseInt(str[1]);
		String s[] = scan.nextLine().split(" ");
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(a);
		int ans = 0;
		int c = 0;
		int max = 0;
		while (m > 0) {
			ans -= a[c];
			max = Math.max(ans, max);
			m--;
			c++;
		}
		System.out.println(max);
	}

}