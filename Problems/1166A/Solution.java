import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		int l[][] = new int[1001][1001];

		l[0][0] = 1;
		for (int i = 1; i < 1001; i++) {
			// Set every nCr = 1 where r = 0
			l[i][0] = 1;
			for (int j = 1; j < i + 1; j++) {

				// Value for the current cell of Pascal's triangle
				l[i][j] = (l[i - 1][j - 1] + l[i - 1][j]);
			}
		}

		int f[] = new int[26];
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			f[s.charAt(0) - 97]++;
		}
		long total = 0;
		for (int i = 0; i < f.length; i++) {
			if (f[i] > 2) {
				int tmp = f[i] / 2;
				int tmp1 = f[i] - (f[i] / 2);
				total += l[tmp][2] + l[tmp1][2];
			}
		}
		System.out.println(total);
	}
}