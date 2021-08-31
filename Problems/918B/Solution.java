import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*package whatever //do not write package name here */

public final class Solution {
	public static void main(String[] args) throws IOException {

		BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));

		String s[] = bi.readLine().split(" ");
		int n = Integer.parseInt(s[0]);
		int m = Integer.parseInt(s[1]);
		Map<String, String> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			s = bi.readLine().split(" ");
			map.put(s[1], s[0]);
		}
		for (int i = 0; i < m; i++) {
			s = bi.readLine().split(" ");
			System.out.println(s[0] + " " + s[1] + " #" + map.get(s[1].replace(";", "")));
		}
	}

}