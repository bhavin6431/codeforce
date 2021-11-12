import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s[] = br.readLine().split(" ");
		int na = Integer.parseInt(s[0]);
		int nb = Integer.parseInt(s[1]);
		s = br.readLine().split(" ");
		int k = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		String s1[] = br.readLine().split(" ");
		String s2[] = br.readLine().split(" ");
		int a[] = new int[s1.length];
		int b[] = new int[s2.length];
		for (int i = 0; i < na; i++) {
			a[i] = Integer.parseInt(s1[i]);
		}
		for (int i = 0; i < nb; i++) {
			b[i] = Integer.parseInt(s2[i]);
		}

		Arrays.sort(a);
		Arrays.sort(b);
		int p1 = 0;
		int p2 = 0;
		int k1 = 0;
		int m1 = nb;
		boolean flag = true;
		while (p1 < na && p2 < nb) {
			if (a[p1] < b[p2]) {
				k1++;
				p1++;
			} else {
				m1--;
				p2++;
			}

			if (k1 >= k && m1 >= m) {
				break;
			}

			if (m1 < m) {
				flag = false;
				break;
			}
		}

		if (!flag) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}

	}
}