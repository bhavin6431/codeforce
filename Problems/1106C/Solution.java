import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s1[] = br.readLine().split(" ");
		int a[] = new int[n];
		long total = 0;
		for (int i = 0; i < n; i++) {
			a[i] = -1 * Integer.parseInt(s1[i]);
		}
		Arrays.sort(a);
		for (int i = 0; i < n; i++) {
			a[i] = -1 * a[i];
		}

		for (int i = 0; i < n / 2; i++) {
			total += ((a[i] + a[n - 1 - i]) * (a[i] + a[n - 1 - i]));
		}

		System.out.println(total);
	}
}