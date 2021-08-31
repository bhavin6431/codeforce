import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new FileReader("c://tmp//in.txt"));
		String s = r_s(br);
		Map<String, Integer> map = new HashMap<>();
		for (int i = 0; i < 10; i++) {
			map.put(r_s(br), i);
		}
		for (int i = 0; i < s.length(); i += 10) {
			pr_o(map.get(s.substring(i, i + 10)));
		}
	}

	public static int move(int pi, int si, int ri) {
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		pq.add(new Pair(0, pi));
		pq.add(new Pair(1, si));
		pq.add(new Pair(2, ri));

		Pair f = pq.poll();
		Pair s = pq.poll();

		if (f.getV() == s.getV()) {
			if (f.getT() == 0 && s.getT() == 1 || f.getT() == 1 && s.getT() == 0) {
				return 4;
			} else if (f.getT() == 1 && s.getT() == 2 || f.getT() == 2 && s.getT() == 1) {
				return 5;
			} else if (f.getT() == 2 && s.getT() == 0 || s.getT() == 2 && f.getT() == 0) {
				return 3;
			} else {
				return 3;
			}
		} else {
			if (f.getT() == 0) {
				return 2;
			} else if (f.getT() == 1) {
				return 0;
			} else {
				return 1;
			}
		}
	}

// 0 - p
// 1 - s
// 2 - r

	static class Pair implements Comparable<Pair> {
		int v;
		int t;

		@Override
		public int compareTo(Pair o) {
			return o.getV() - this.getV();
		}

		public Pair(int t, int v) {
			super();
			this.v = v;
			this.t = t;
		}

		public int getV() {
			return v;
		}

		public void setV(int v) {
			this.v = v;
		}

		public int getT() {
			return t;
		}

		public void setT(int t) {
			this.t = t;
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

