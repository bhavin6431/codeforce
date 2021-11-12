import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		Long n = Long.parseLong(bi.readLine());
		String s1[] = bi.readLine().split(" ");
		Long t = Long.parseLong(bi.readLine());
		ArrayList<Long> a = new ArrayList<Long>();
		long sum = 0;
		for (int i = 0; i < n; i++) {
			long val = Long.parseLong(s1[i]);
			a.add(val);
			sum += val;
		}
		Collections.sort(a, Collections.reverseOrder());
		String s2[] = bi.readLine().split(" ");
		int i = 0;
		while (i < t) {
			int k = Integer.parseInt(s2[i]);

			System.out.println(sum - a.get(k - 1));
			i++;
		}
	}

}