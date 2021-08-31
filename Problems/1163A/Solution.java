import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		String s[] = bi.readLine().split(" ");
		PriorityQueue<Long> a = new PriorityQueue<Long>();
		int c = 0;
		int n = Integer.parseInt(s[0]);
		int k = Integer.parseInt(s[1]);
		if (n == k) {
			System.out.println(0);
		} else if (k < 2) {
			System.out.println(1);
		} else if (n >= (k * 2)) {
			System.out.println(k);
		} else {
			System.out.println(n - k);
		}
	}

}