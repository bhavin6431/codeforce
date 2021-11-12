import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		String s[] = br.readLine().split(" ");
		PriorityQueue<Pair> pq = new PriorityQueue<Pair>();
		for (int i = 1; i < n - 1; i++) {
			int prev = Integer.parseInt(s[i - 1]);
			int val = Integer.parseInt(s[i]);
			int next = Integer.parseInt(s[i + 1]);
			pq.add(new Pair((i + 1) + "" + (i), next - val));
			pq.add(new Pair((i) + "" + (i - 1), val - prev));
		}

		int min = Integer.MAX_VALUE;
		for (int i = 1; i < n - 1; i++) {
			int prev = Integer.parseInt(s[i - 1]);
			int val = Integer.parseInt(s[i]);
			int next = Integer.parseInt(s[i + 1]);
			pq.remove(new Pair((i) + "" + (i - 1), (val - prev)));
			pq.remove(new Pair((i + 1) + "" + (i), (next - val)));
			pq.add(new Pair((i + 1) + "" + (i - 1), (next - prev)));

			min = Math.min(pq.peek().getVal(), min);
			pq.add(new Pair((i) + "" + (i - 1), (val - prev)));
			pq.add(new Pair((i + 1) + "" + (i), (next - val)));
			pq.remove(new Pair((i + 1) + "" + (i - 1), (next - prev)));
		}
		System.out.println(min);
	}
}

class Pair implements Comparable<Pair> {

	String pair;
	Integer val;

	public String getPair() {
		return pair;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pair == null) ? 0 : pair.hashCode());
		result = prime * result + ((val == null) ? 0 : val.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pair other = (Pair) obj;
		if (pair == null) {
			if (other.pair != null)
				return false;
		} else if (!pair.equals(other.pair))
			return false;
		if (val == null) {
			if (other.val != null)
				return false;
		} else if (!val.equals(other.val))
			return false;
		return true;
	}

	public void setPair(String pair) {
		this.pair = pair;
	}

	public Integer getVal() {
		return val;
	}

	public void setVal(Integer val) {
		this.val = val;
	}

	public Pair(String pair, Integer val) {
		super();
		this.pair = pair;
		this.val = val;
	}

	@Override
	public int compareTo(Pair o) {
		return o.getVal().compareTo(this.getVal());
	}
}