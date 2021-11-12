import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());
		String s[] = bi.readLine().split(" ");
		Integer a[] = new Integer[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(a);

		System.out.println(Math.min(a[n - 1] - a[1], a[n - 2] - a[0]));
	}
}