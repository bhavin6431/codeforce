import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			int n = Integer.parseInt(bi.readLine());
			String s[] = bi.readLine().split(" ");
			int a[] = new int[n];
			for (int i = 0; i < n; i++) {
				a[i] = Integer.parseInt(s[i]);
			}
			int l = 0;
			int r = n - 1;
			while (l < r) {
				if (a[l] % 2 != 0 && a[r] % 2 == 0) {
					int tmp = a[l];
					a[l] = a[r];
					a[r] = tmp;
					l++;
				} else if (a[l] % 2 != 0 && a[r] % 2 != 0) {
					r--;
				} else if (a[l] % 2 == 0) {
					l++;
				}
			}
			int count = 0;
			for (int i = 0; i < n - 1; i++) {
				if (a[i] % 2 == 0) {
					count += n - i - 1;
				} else {
					for (int j = i + 1; j < n; j++) {
						if (gcd(a[i], a[j]) > 1) {
							count++;
						}
					}
				}
			}
			System.out.println(count);
			t--;
		}

	}

	static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

}