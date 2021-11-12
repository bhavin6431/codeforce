import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());
		String s[] = bi.readLine().split(" ");
		int ne = 0;
		int no = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int val = Integer.parseInt(s[i]);
			if (val % 2 == 0) {
				ne++;
			} else {
				no++;
			}
			sum += val;
		}
		System.out.println(sum % 2 == 0 ? ne : no);
	}
}