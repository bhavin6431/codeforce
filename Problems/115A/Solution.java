import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class Solution {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int n = t;
		scan.nextLine();
		boolean visited[] = new boolean[t + 1];
		Set<Integer> adj[] = new HashSet[t + 1];
		int a[] = new int[t + 1];
		for (int i = 0; i < t + 1; i++) {
			adj[i] = new HashSet<>();

		}
		int indx = 1;
		while (t > 0) {
			int v = Integer.parseInt(scan.nextLine());
			if (v != -1) {
				adj[indx].add(v);
				adj[v].add(indx);
			}
			a[indx] = v;
			indx++;
			t--;
		}
		int maxLevel = 1;
		for (int i = 1; i < visited.length; i++) {
			if (a[i] == -1) {
				Stack<Pair> s = new Stack<Pair>();
				s.push(new Pair(i, 1));
				visited[i] = true;
				while (!s.isEmpty()) {
					Pair r = s.pop();

					visited[r.getNode()] = true;
					maxLevel = Math.max(maxLevel, r.getLevel());
					for (Integer j : adj[r.getNode()]) {
						if (!visited[j]) {
							s.push(new Pair(j, r.getLevel() + 1));
						}
					}
				}
			}
		}
		System.out.println(maxLevel);
	}

	static class Pair {
		int node;
		int level;

		public Pair(int node, int level) {
			super();
			this.node = node;
			this.level = level;
		}

		public int getNode() {
			return node;
		}

		public void setNode(int node) {
			this.node = node;
		}

		public int getLevel() {
			return level;
		}

		public void setLevel(int level) {
			this.level = level;
		}

	}
}