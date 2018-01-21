import java.util.Arrays;

public class UnionFindCustom {

	private int[] id;

	public UnionFindCustom(int N) {

		id = new int[N];

		for (int i = 0; i < N; i++)
			id[i] = i;
	}

	public boolean connected(int p, int q) {
		return id[p] == id[q];
	}

	public void union(int p, int q) {
		int pid = id[p];
		int qid = id[q];
		for (int i = 0; i < id.length; i++)
			if (id[i] == pid)
				id[i] = qid;
	}

	public static void main(String[] args) {

		UnionFindCustom ufObj = new UnionFindCustom(10);
		System.out.println(Arrays.toString(ufObj.id));
		System.out.println(ufObj.connected(1, 0));
		ufObj.union(1, 0);
		System.out.println(Arrays.toString(ufObj.id));
		System.out.println(ufObj.connected(1, 0));

	}

}
