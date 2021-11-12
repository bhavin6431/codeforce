import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		// 1 1 1 1 1 0

		int min = 0;
		int rem = n % 7;
		if (rem > 5) {
			min = ((n / 7) * 2) + 1;
		} else {
			min = (n / 7) * 2;
		}

		// 0 0 1 1 1 1

		int max = 0;
		rem = n % 7;
		if (rem < 3) {
			max = ((n / 7) * 2) + rem;
		} else {
			max = ((n / 7) * 2) + 2;
		}

		System.out.println(min + " " + max);

	}
}