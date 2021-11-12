import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			int n = Integer.parseInt(bi.readLine());

			String s[] = bi.readLine().split(" ");
			boolean l[] = new boolean[n];
			boolean r[] = new boolean[n];
			int l1[] = new int[n];
			int r1[] = new int[n];

			Stack<Integer> st = new Stack<Integer>();
			st.push(0);
			for (int i = 1; i < n; i++) {
				while (!st.isEmpty() && Integer.parseInt(s[i]) < Integer.parseInt(s[st.peek()])) {
					st.pop();
				}
				if (!st.isEmpty()) {
					l[i] = true;
					l1[i] = st.peek();
				}
				st.push(i);
			}
			st = new Stack<Integer>();
			st.push(n - 1);
			for (int i = n - 2; i >= 0; i--) {
				while (!st.isEmpty() && Integer.parseInt(s[i]) < Integer.parseInt(s[st.peek()])) {
					st.pop();
				}
				if (!st.isEmpty()) {
					r[i] = true;
					r1[i] = st.peek();
				}
				st.push(i);
			}
			boolean found = false;
			int ans = 0;
			for (int i = 1; i < n - 1; i++) {
				if (l[i] && r[i]) {
					ans = i;
					found = true;
					break;
				}
			}
			if (!found) {
				System.out.println("NO");
			} else {
				System.out.println("YES");
				System.out.println((l1[ans] + 1) + " " + (ans + 1) + " " + (r1[ans] + 1));
			}

			t--;
		}
	}

}