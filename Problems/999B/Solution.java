import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeSet;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		TreeSet<Integer> divs = new TreeSet();
		char c[] = s.toCharArray();
		div(n, divs);
		for (int i : divs) {
			int l = 0;
			int r = l + i - 1;
			while (l < r) {
				char tmp = c[l];
				c[l] = c[r];
				c[r] = tmp;
				l++;
				r--;
			}
		}

		System.out.println(new String(c));
	}

	static void div(int n, TreeSet<Integer> divs) {
		divs.add(1);
		divs.add(n);
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				divs.add(i);
				divs.add(n / i);
			}
		}
	}
}