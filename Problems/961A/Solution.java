import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s[] = bi.readLine().split(" ");
		String s1[] = bi.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		int a[] = new int[n];
		for (int i = 0; i < m; i++) {
			a[Integer.parseInt(s1[i]) - 1]++;
		}
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			min = Math.min(min, a[i]);
		}
		System.out.println(min);
	}
}

