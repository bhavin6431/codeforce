import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s[] = bi.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int v = Integer.parseInt(s[1]);

		System.out.println(
				Math.min(v, n - 1) + (((Math.max(0, n - v) * Math.max(0, n - v + 1)) / 2) - ((n - v) > 0 ? 1 : 0)));
	}
}