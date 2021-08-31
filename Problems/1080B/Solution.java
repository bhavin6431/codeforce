import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());
		while (n > 0) {
			String s[] = bi.readLine().split(" ");
			int st = Integer.parseInt(s[0]);
			int ed = Integer.parseInt(s[1]);
			if (st == ed) {
				if (st % 2 == 0) {
					System.out.println(st);
				} else {
					System.out.println(st * -1);
				}
			} else {

				// start even
				if (st % 2 == 0) {
					// even elements
					if ((ed - st + 1) % 2 == 0) {
						System.out.println(((ed - st + 1) / 2) * -1);
					} else {
						System.out.println(st + (ed - st + 1) / 2);
					}
				} else {
					if ((ed - st + 1) % 2 == 0) {
						System.out.println(((ed - st + 1) / 2));
					} else {
						System.out.println((st * -1) + (((ed - st + 1) / 2) * -1));
					}
				}
			}
			n--;
		}
	}
}

