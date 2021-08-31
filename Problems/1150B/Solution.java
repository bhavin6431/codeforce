import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(bi.readLine());
		char[][] a = new char[n][n];
		for (int i = 0; i < n; i++) {
			String s = bi.readLine();
			for (int j = 0; j < n; j++) {
				a[i][j] = s.charAt(j);
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == '.') {
					if (i - 1 >= 0 && i + 1 < n && j - 1 >= 0 && j + 1 < n && a[i - 1][j] == '.' && a[i][j - 1] == '.'
							&& a[i + 1][j] == '.' && a[i][j + 1] == '.') {
						a[i][j] = '1';
						a[i - 1][j] = '1';
						a[i][j - 1] = '1';
						a[i + 1][j] = '1';
						a[i][j + 1] = '1';
					}
				}
			}
		}
		boolean found = true;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (a[i][j] == '.') {
					found = false;
					break;
				}
			}
		}
		System.out.println(found ? "YES" : "NO");
	}
}

