import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());
		String s[] = bi.readLine().split(" ");
		Map<Integer, List<Integer>> map = new TreeMap(Collections.reverseOrder());
		for (int i = 0; i < n; i++) {
			int val = Integer.parseInt(s[i]);
			List al = new ArrayList();
			if (map.containsKey(val)) {
				al = map.get(val);
			}
			al.add(i);
			map.put(Integer.parseInt(s[i]), al);
		}
		int x = 0;
		long sum = 0;
		StringBuilder sb = new StringBuilder();
		for (Integer i : map.keySet()) {
			for (Integer j : map.get(i)) {
				sum += (i * x) + 1;
				sb.append((j + 1) + " ");
				x++;
			}
		}
		System.out.println(sum);
		System.out.println(sb.toString());

	}
}