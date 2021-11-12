import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());
		Set<Long> f = new TreeSet();
		long f1 = 0;
		long f2 = 1;
		f.add(0L);
		f.add(1L);
		while (f2 < n) {
			f.add(f1 + f2);
			long tmp = f1 + f2;
			f1 = f2;
			f2 = tmp;
		}

		boolean found = false;
		long a1 = 0;
		long a2 = 0;
		for (Long i1 : f) {
			for (Long i2 : f) {
				if (f.contains(n - (i1 + i2))) {
					found = true;
					a1 = i1;
					a2 = i2;
					break;
				}
			}
		}

		System.out.println(found ? a1 + " " + a2 + " " + (n - (a1 + a2)) : "I'm too stupid to solve this problem");
	}
}