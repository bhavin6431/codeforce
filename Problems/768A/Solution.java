import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		Integer n = Integer.parseInt(bi.readLine());
		String s[] = bi.readLine().split(" ");
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(s[i]);
		}
		Arrays.sort(a);
		if (a[0] == a[n - 1]) {
			System.out.println(0);
		} else {
			int first = a[0];
			int start = 0;
			for (int i = 1; i < n; i++) {
				if (first != a[i]) {
					start = i - 1;
					break;
				}
			}
			int last = a[n - 1];
			int end = n - 1;
			for (int i = n - 2; i >= 0; i--) {
				if (last != a[i]) {
					end = i + 1;
					break;
				}
			}
			if (n >= 3) {
				System.out.println(Math.max(end - start - 1, 0));
			} else {
				System.out.println(0);
			}
		}
	}

}