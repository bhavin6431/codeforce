import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(bi.readLine());
		String s[] = bi.readLine().split(" ");
		long max = 0;

		for (int i = 0; i < s.length; i++) {

			long ans = Long.parseLong(s[i]) + max;
			max = Math.max(max, ans);
			System.out.print(ans + " ");
		}

	}
}