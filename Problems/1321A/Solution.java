import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s[] = br.readLine().split(" ");
		String s1[] = br.readLine().split(" ");
		int p1 = 0;
		int p2 = 0;
		for (int i = 0; i < s.length; i++) {
			if (s1[i].equals("0") && s[i].equals("1")) {
				p1++;
			} else if (s1[i].equals("1") && s[i].equals("0")) {
				p2++;
			}
		}
		if (p1 == 0) {
			System.out.println(-1);
		} else {
			System.out.println((int) Math.ceil(((double) p2 + 1) / p1));
		}

	}
}