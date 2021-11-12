import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int x = Integer.parseInt(s[0]);
		int y = Integer.parseInt(s[1]);
		int n = Integer.parseInt(br.readLine());
		double min = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			String s1[] = br.readLine().split(" ");
			int x1 = Integer.parseInt(s1[0]);
			int y1 = Integer.parseInt(s1[1]);
			int v = Integer.parseInt(s1[2]);
			min = Math.min(min,
					Math.sqrt((Math.abs(x - x1) * Math.abs(x - x1)) + (Math.abs(y - y1) * Math.abs(y - y1))) / v);
		}

		System.out.println(min);
	}
}