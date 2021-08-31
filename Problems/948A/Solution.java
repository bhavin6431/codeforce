import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
		String s2[] = bi.readLine().split(" ");
		int r = Integer.parseInt(s2[0]);
		int c = Integer.parseInt(s2[1]);
		char[][] a = new char[r][c];
		for (int i = 0; i < r; i++) {
			String s = bi.readLine();
			for (int j = 0; j < c; j++) {
				a[i][j] = s.charAt(j);
			}
		}
		boolean possible = true;

		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				if (a[i][j] == 'W') {
					if (i - 1 >= 0 && a[i - 1][j] == 'S') {
						possible = false;
						break;
					}
					if (j - 1 >= 0 && a[i][j - 1] == 'S') {
						possible = false;
						break;
					}

					if (i + 1 < r && a[i + 1][j] == 'S') {
						possible = false;
						break;
					}

					if (j + 1 < c && a[i][j + 1] == 'S') {
						possible = false;
						break;
					}
				} else if (a[i][j] == '.') {
					a[i][j] = 'D';
				}
			}
		}

		if (!possible) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
			for (int i = 0; i < r; i++) {
				for (int j = 0; j < c; j++) {
					System.out.print(a[i][j]);
				}
				System.out.println();
			}
		}
	}

}

