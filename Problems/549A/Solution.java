import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.BitSet;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new FileReader("c://tmp//in.txt"));
		int a[] = r_i_a(br);
		int r = a[0];
		int c = a[1];
		char m[][] = new char[r][c];
		for (int i = 0; i < r; i++) {
			String s = r_s(br);
			for (int j = 0; j < c; j++) {
				m[i][j] = s.charAt(j);
			}
		}

		BitSet bs = new BitSet(4);
		int ans = 0;
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {

				if (exists(m[i][j])) {
					// top right
//					bs = new BitSet(4);
//					setBit(bs, m[i][j]);
//					if (i - 1 >= 0 && j + 1 < c) {
//						setBit(bs, m[i - 1][j]);
//						setBit(bs, m[i][j + 1]);
//						setBit(bs, m[i - 1][j + 1]);
//						if (bs.cardinality() == 4) {
//							ans++;
//						}
//					}
//
//					bs = new BitSet(4);
//					setBit(bs, m[i][j]);
//					// top left
//					if (i - 1 >= 0 && j - 1 >= 0) {
//						setBit(bs, m[i - 1][j]);
//						setBit(bs, m[i - 1][j - 1]);
//						setBit(bs, m[i][j - 1]);
//						if (bs.cardinality() == 4) {
//							ans++;
//						}
//					}
//					bs = new BitSet(4);
//					setBit(bs, m[i][j]);
//					// bottom left
//					if (i + 1 < r && j - 1 >= 0) {
//						setBit(bs, m[i][j - 1]);
//						setBit(bs, m[i + 1][j]);
//						setBit(bs, m[i + 1][j - 1]);
//						if (bs.cardinality() == 4) {
//							ans++;
//						}
//					}
					bs = new BitSet(4);
					setBit(bs, m[i][j]);
					// bottom right
					if (i + 1 < r && j + 1 < c) {
						setBit(bs, m[i + 1][j]);
						setBit(bs, m[i][j + 1]);
						setBit(bs, m[i + 1][j + 1]);
						if (bs.cardinality() == 4) {
							ans++;
						}
					}
				}
			}
		}

		pr_o_nl(ans );

	}

	public static boolean exists(char c) {
		if (c == 'f' || c == 'a' || c == 'c' || c == 'e') {
			return true;
		}
		return false;
	}

	public static void setBit(BitSet bs, char c) {

		if (c == 'f') {
			bs.set(0);
		} else if (c == 'a') {
			bs.set(1);
		} else if (c == 'c') {
			bs.set(2);
		} else if (c == 'e') {
			bs.set(3);
		}
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

	public static int[] r_i_a(BufferedReader br) throws IOException {
		String s[] = r_s_a(br);
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

