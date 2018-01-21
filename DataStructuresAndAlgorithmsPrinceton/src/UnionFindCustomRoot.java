import java.util.Arrays;

public class UnionFindCustomRoot {
	
	private int[] id;

	public UnionFindCustomRoot(int N) {
		id = new int[N];
		for (int i = 0; i < N; i++)
			id[i] = i;
	}

	private int root(int i) {
		while (i != id[i])
			i = id[i];
		return i;
	}

	public boolean connected(int p, int q) {
		return root(p) == root(q);
	}

	public void union(int p, int q) {
		int i = root(p);
		int j = root(q);
		id[i] = j;
	}

	private int find() {

		int max = 0;

		if (id.length == 0) {
			return 0;

		}
		if (id.length == 1) {
			return id[0];
		}

		for (int i = 0; i < id.length; i++) {

			if (id[i] > max) {
				max = id[i];
			}
		}

		return max;

	}

	public static void main(String[] args) {

		UnionFindCustomRoot ufc = new UnionFindCustomRoot(4);
		/*
		 * System.out.println(Arrays.toString(ufc.id)); System.out.println(ufc.root(2));
		 * System.out.println(ufc.connected(1, 2));
		 * 
		 * ufc.union(1, 2);
		 */

		System.out.println(Arrays.toString(ufc.id));
		System.out.println("Max element from array");
		System.out.println(ufc.find());
		System.out.println("Length of array");
		System.out.println(ufc.id.length);
		//System.out.println("test");

	}

}
