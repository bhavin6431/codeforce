import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static void main(String args[]) throws IOException { // BufferedReader
		// br = new BufferedReader(new FileReader("c://tmp//in.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = r_i(br);
		while (t > 0) {
			String s1 = r_s(br);
			String s2 = r_s(br);
			int lcm = lcm(s1.length(), s2.length());
			int i = 0;
			int j = 0;
			int k = 0;
			boolean f = true;
			while (i < lcm) {
				if (s1.charAt(j) != s2.charAt(k)) {
					f = false;
					break;
				}
				j++;
				k++;
				if (j % s1.length() == 0) {
					j = 0;
				}
				if (k % s2.length() == 0) {
					k = 0;
				}
				i++;
			}
			if (f) {
				if (s1.length() < s2.length()) {
					pr_o_nl(s1.repeat(lcm / s1.length()));
				} else if (s2.length() < s1.length()) {
					pr_o_nl(s2.repeat(lcm / s2.length()));
				} else {
					pr_o_nl(s1);
				}

			} else {
				pr_o_nl(-1);
			}

			t--;
		}

	}

	public static boolean isStrMadeUpOfStr(String s1, String s2) {
		if (s1.length() % s2.length() == 0) {
			int j = 0;
			boolean found = true;
			for (int i = 0; i < s1.length(); i++) {
				if (s1.charAt(i) != s2.charAt(j)) {
					found = false;
					break;
				}
				j++;
				if (j % s2.length() == 0) {
					j = 0;
				}
			}
			return found;
		} else {
			return false;
		}
	}

	public static int lcm(int a, int b) {
		return ((a * b) / gcd(a, b));
	}

	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		}
		return gcd(b, a % b);
	}

	public static void print(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				pr_o(m[i][j] + " ");
			}
			pr_nl();
		}
		pr_nl();
	}

	public static void print(boolean[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				pr_o(m[i][j] + " ");
			}
			pr_nl();
		}
		pr_nl();
	}

	public static void pr_o(Object s) {
		System.out.print(s);
	}

	public static void pr_o_nl(Object s) {
		System.out.print(s);
		pr_nl();
	}

	public static void pr_nl() {
		System.out.println();
	}

	public static int prs_s_i(String s) {
		return Integer.parseInt(s);
	}

	public static Long prs_s_l(String s) {
		return Long.parseLong(s);
	}

	public static int r_i(BufferedReader br) throws IOException {
		return prs_s_i(br.readLine());
	}

	public static long r_l(BufferedReader br) throws IOException {
		return prs_s_l(br.readLine());
	}

	public static String r_s(BufferedReader br) throws IOException {
		return br.readLine();
	}

	public static String[] r_s_a(BufferedReader br) throws IOException {
		return br.readLine().split(" ");
	}

	public static String[] r_s_a(BufferedReader br, String s) throws IOException {
		return br.readLine().split(s);
	}

	public static int[] r_i_a(BufferedReader br) throws IOException {
		String s[] = r_s_a(br);
		int a[] = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			a[i] = prs_s_i(s[i]);
		}
		return a;
	}

	public static long[] r_l_a(BufferedReader br) throws IOException {
		String s[] = r_s_a(br);
		long a[] = new long[s.length];
		for (int i = 0; i < s.length; i++) {
			a[i] = prs_s_l(s[i]);
		}
		return a;
	}

	public static int[] r_i_a(BufferedReader br, String split) throws IOException {
		String s[] = r_s_a(br, split);
		int a[] = new int[s.length];
		for (int i = 0; i < s.length; i++) {
			a[i] = prs_s_i(s[i]);
		}
		return a;
	}

	public static int[][] r_s_a_i(BufferedReader br, int a[][], int i) throws IOException {
		String s1[] = r_s_a(br);
		for (int j = 0; j < s1.length; j++) {
			a[i][j] = prs_s_i(s1[j]);
		}
		return a;
	}

	public static int[][] r_s_a_r_w_o_s(BufferedReader br, int a[][], int r) throws IOException {
		for (int i = 0; i < r; i++) {
			String s = r_s(br);
			for (int j = 0; j < r; j++) {
				if (s.charAt(j) == '.') {
					a[i][j] = 0;
				} else {
					a[i][j] = Integer.parseInt("" + s.charAt(j));
				}
			}
		}
		return a;
	}

	public static int[][] r_s_a_r(BufferedReader br, int a[][], int r) throws IOException {
		for (int i = 0; i < r; i++) {
			a = r_s_a_i(br, a, i);
		}
		return a;
	}

	public static Integer maxx(Integer... x) {
		int max = 0;
		for (Integer a : x) {
			max = Math.max(a, max);
		}
		return max;
	}

	public static Integer minn(Integer... x) {
		int min = Integer.MAX_VALUE;
		for (Integer a : x) {
			min = Math.min(a, min);
		}
		return min;
	}

	public static Long maxx(Long... x) {
		long max = 0;
		for (Long a : x) {
			max = Math.max(a, max);
		}
		return max;
	}

}