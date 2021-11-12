import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		String s[] = br.readLine().split(" ");
		boolean found = true;
		int min = Integer.MAX_VALUE;
		int minIndex = -1;
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(s[i]);
			if (min > a[i]) {
				min = a[i];
				minIndex = i + 1;
			}
		}
		int minCount = 0;
		for (int i = 0; i < n; i++) {
			if (min == a[i]) {
				minCount++;
				if (minCount > 1) {
					found = false;
					break;
				}
			}
		}
		if (!found) {
			System.out.println("Still Rozdil");
		} else {
			System.out.println(minIndex);
		}
	}
}