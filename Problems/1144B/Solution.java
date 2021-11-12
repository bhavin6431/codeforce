import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());
		String s[] = bi.readLine().split(" ");
		int ne = 0;
		int no = 0;
		long sum = 0;
		Integer a[] = new Integer[n];
		PriorityQueue<Integer> pqo = new PriorityQueue<Integer>(Collections.reverseOrder());
		PriorityQueue<Integer> pqe = new PriorityQueue<Integer>(Collections.reverseOrder());

		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(s[i]);
			if (a[i] % 2 == 0) {
				ne++;
				pqe.add(a[i]);
			} else {
				no++;
				pqo.add(a[i]);
			}
			sum += a[i];
		}
		boolean odd = no > ne ? true : false;
		while (!pqo.isEmpty() && !pqe.isEmpty()) {
			if (odd) {
				sum -= pqo.poll();
			} else {
				sum -= pqe.poll();
			}
			odd = !odd;
		}
		if (odd && !pqo.isEmpty()) {
			sum -= pqo.poll();

		} else if (!odd && !pqe.isEmpty()) {
			sum -= pqe.poll();
		}
		System.out.println(sum);
	}

}