import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t > 0) {
			String s[] = br.readLine().split(" ");
			int n = Integer.parseInt(s[0]);
			int st = Integer.parseInt(s[1]);
			int ty = Integer.parseInt(s[2]);

			long to = st + ty;
			long ol = to - n;

			System.out.println(Math.max(st, ty) - ol + 1);

			t--;
		}

	}
}