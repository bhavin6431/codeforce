import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		Integer t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			Integer n = Integer.parseInt(bi.readLine());
			String s = bi.readLine();
			if (n < 2) {
				System.out.println(-1);
			} else {
				int oc = 0;
				int lastIndexOfOdd = n;
				int firstIndexOfOdd = -1;
				for (int i = 0; i < s.length(); i++) {
					if (Integer.parseInt(s.charAt(i) + "") % 2 != 0) {
						lastIndexOfOdd = i;
						if (firstIndexOfOdd == -1) {
							firstIndexOfOdd = i;
						}
						oc++;
					}
				}
				if (oc > 0) {
					String ans = s;
					if (lastIndexOfOdd != n - 1) {
						ans = s.substring(0, lastIndexOfOdd + 1);
					}
					if (oc % 2 == 0) {
						System.out.println(ans.replaceFirst("^0+(?!$)", ""));
					} else {
						if (oc == 1) {
							System.out.println(-1);
						} else {
							if (firstIndexOfOdd == 0) {
								ans = ans.substring(1, ans.length());
								System.out.println(ans.length() == 0 ? -1 : ans.replaceFirst("^0+(?!$)", ""));
							} else {
								ans = ans.substring(0, firstIndexOfOdd - 1)
										+ ans.substring(firstIndexOfOdd + 1, ans.length());
								System.out.println(ans.length() == 0 ? -1 : ans.replaceFirst("^0+(?!$)", ""));
							}
						}
					}
				} else {
					System.out.println(-1);
				}
			}

			t--;
		}
	}
}