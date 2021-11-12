import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s1[] = br.readLine().split(" ");

		int n = Integer.parseInt(s1[0]);
		int m = Integer.parseInt(s1[1]);

		String s2[] = br.readLine().split(" ");
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += Integer.parseInt(s2[i]);
			System.out.print((sum / m) + " ");
			sum -= (sum / m) * m;
		}

	}
}