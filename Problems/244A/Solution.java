import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {

	public static final int MOD = 1000050131;

	public static void main(String args[]) throws IOException {
		// BufferedReader br = new BufferedReader(new FileReader("c://tmp//in.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int in[] = r_i_a(br);
		int a[] = r_i_a(br);

		int n = in[0];
		int k = in[1];
		boolean f[] = new boolean[(n * k) + 1];
		for (int i = 0; i < a.length; i++) {
			f[a[i]] = true;
		}
		int a1[][] = new int[k][n];

		for (int i = 0; i < a1.length; i++) {
			a1[i][0] = a[i];
			for (int j = 1; j < a1[0].length; j++) {
				int p = 1;
				while (f[p]) {
					p++;
				}
				a1[i][j] = p;
				f[p] = true;
			}
		}
		for (int i = 0; i < a1.length; i++) {
			for (int j = 0; j < a1[0].length; j++) {
				pr_o(a1[i][j] + " ");
			}
			pr_nl();
		}
	}

	public static boolean isValid(int a[], int i, int i1, int i2) {
		if (a[i] != a[i1] && a[i1] != a[i2] && a[i] != a[i2] && a[i2] - a[i] < 3) {
			return true;
		}
		return false;
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
