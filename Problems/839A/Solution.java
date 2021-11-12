import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		String s1[] = br.readLine().split(" ");

		int ans = 0;
		int bag = 0;
		for (int i = 0; i < n; i++) {
			bag += Integer.parseInt(s1[i]);
			if (bag >= 8) {
				bag -= 8;
				k -= 8;
			} else {
				k -= bag;
				bag = 0;
			}

			if (k <= 0) {
				ans = i + 1;
				break;
			}
		}
		if (k > 0) {
			System.out.println(-1);
		} else {
			System.out.println(ans);
		}

	}
}