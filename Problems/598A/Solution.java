import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(bi.readLine());
		while (t > 0) {
			BigInteger one = new BigInteger("1");
			BigInteger two = new BigInteger("2");

			BigInteger n = new BigInteger(bi.readLine());
			BigInteger total = (n.multiply(n.add(one))).divide(two);

			BigInteger a = one;
			while (a.compareTo(n) <= 0) {
				total = total.subtract(a.multiply(two));
				a = a.multiply(two);

			}
			System.out.println(total);
			t--;
		}
	}

}