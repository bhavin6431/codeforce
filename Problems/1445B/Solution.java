import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t > 0) {
			String s[] = br.readLine().split(" ");
			System.out.println(Math.max(Integer.parseInt(s[0]) + Integer.parseInt(s[1]),
					Integer.parseInt(s[2]) + Integer.parseInt(s[3])));
			t--;
		}
	}
}