import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			String s[] = bi.readLine().split(" ");
			int A = Integer.parseInt(s[0]);
			int B = Integer.parseInt(s[1]);
			int n = Integer.parseInt(s[2]);

			String a[] = bi.readLine().split(" ");
			String b[] = bi.readLine().split(" ");
			PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
			for (int i = 0; i < n; i++) {
				pq.add(new Pair(Integer.parseInt(a[i]), Integer.parseInt(b[i])));
			}

			boolean possible = true;
			while (!pq.isEmpty()) {
				if (B <= 0) {
					possible = false;
					break;
				}
				Pair p = pq.poll();
				Integer x = p.getB();
				int hm = x % A == 0 ? (x / A) : (x / A) + 1;
				int mm = B % p.getA() == 0 ? (B / p.getA()) : (B / p.getA()) + 1;
				if(hm > mm) {
					possible = false;
					break;
				}
				
				B -= hm * p.getA();

			}
			if (pq.isEmpty() && possible) {
				System.out.println("YES");
			} else {
				System.out.println("NO");

			}

			t--;
		}
	}

	static class Pair implements Comparable<Pair> {
		Integer a;
		Integer b;

		public Pair(Integer a, Integer b) {
			super();
			this.a = a;
			this.b = b;
		}

		public Integer getA() {
			return a;
		}

		public void setA(Integer a) {
			this.a = a;
		}

		public Integer getB() {
			return b;
		}

		public void setB(Integer b) {
			this.b = b;
		}

		@Override
		public int compareTo(Pair o) {

			return this.getA().compareTo(o.getA());

		}

	}
}