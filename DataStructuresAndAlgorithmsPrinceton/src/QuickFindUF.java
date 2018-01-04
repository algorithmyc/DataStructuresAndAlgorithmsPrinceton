
public class QuickFindUF {

	private int[] arrayOfIds;

	public QuickFindUF(int N) {

		arrayOfIds = new int[N];

		for (int i = 0; i < N; i++) {

			arrayOfIds[i] = i;

		}

	}

	public boolean connected(int p, int q) {
		return arrayOfIds[p] == arrayOfIds[q];
	}

	public void union(int p, int q) {

		int pid = arrayOfIds[p];
		int qid = arrayOfIds[q];

		for (int i = 0; i < arrayOfIds.length; i++) {

			if (arrayOfIds[i] == pid)

				arrayOfIds[i] = qid;

		}

	}

	public static void main(String[] args) {
		
		QuickFindUF qf = new QuickFindUF(5);
		
		//qf.union(1, 2);
		
		for (int i = 0; i < qf.arrayOfIds.length; i++) {
			System.out.println(qf.arrayOfIds[i]);
			
		}

	}

}
