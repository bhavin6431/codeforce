import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());
		int i = 0;
		boolean bad[] = new boolean[n];
		while (n > 0) {
			String s[] = bi.readLine().split(" ");
			for (int j = 0; j < s.length; j++) {
				if (s[j].equals("3")) {
					bad[i] = true;
					bad[j] = true;
				} else if (s[j].equals("1")) {
					bad[i] = true;
				} else if (s[j].equals("2")) {
					bad[j] = true;
				}
			}
			i++;
			n--;
		}
		int c = 0;
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int p = 0; p < bad.length; p++) {
			if (!bad[p]) {
				c++;
				a.add(p + 1);
			}
		}
		System.out.println(c);
		for (Integer a1 : a) {
			System.out.print(a1 + " ");
		}

	}
}
