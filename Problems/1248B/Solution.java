import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String s[] = br.readLine().split(" ");
		ArrayList<Integer> a = new ArrayList(n);
		for (int i = 0; i < n; i++) {
			a.add(Integer.parseInt(s[i]));
		}
		Collections.sort(a, Collections.reverseOrder());
		long sum1 = 0;
		long sum2 = 0;
		int c = 0;
		for (Integer i : a) {
			if (c <= Math.ceil((double) n / 2) - 1) {
				sum1 += i;
			} else {
				sum2 += i;
			}
			c++;
		}
		System.out.println((sum1 * sum1) + (sum2 * sum2));
	}
}