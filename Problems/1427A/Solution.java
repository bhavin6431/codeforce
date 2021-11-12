import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			int n = Integer.parseInt(bi.readLine());
			String s[] = bi.readLine().split(" ");
			ArrayList<Integer> a = new ArrayList();
			int sum = 0;
			int sumn = 0;
			int sump = 0;
			for (int i = 0; i < n; i++) {
				int a1 = Integer.parseInt(s[i]);
				sum += a1;
				if (a1 < 0) {
					sumn += (-1) * a1;
				} else {
					sump += a1;
				}
				a.add(a1);
			}
			if (sum == 0) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
				if (sump > sumn) {
					Collections.sort(a, Collections.reverseOrder());
				} else {
					Collections.sort(a);
				}
				for (Integer a2 : a) {
					System.out.print(a2 + " ");
				}
				System.out.println();

			}
			t--;
		}
	}

}