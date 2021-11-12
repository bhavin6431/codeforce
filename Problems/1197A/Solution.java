import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t > 0) {
			int n = Integer.parseInt(br.readLine());
			String s1[] = br.readLine().split(" ");
			ArrayList<Integer> a = new ArrayList(n);
			for (int i = 0; i < n; i++) {
				a.add(Integer.parseInt(s1[i]));
			}
			Collections.sort(a, Collections.reverseOrder());
			int minBase = Math.min(a.get(0), a.get(1));
			if (a.size() == 2) {
				System.out.println(0);
			} else {
				int max = minBase - 1;
				int extra = a.size() - 2;
				System.out.println(Math.min(max, extra));
			}
			t--;
		}
	}
}