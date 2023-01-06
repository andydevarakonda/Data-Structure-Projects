public class BalanceTest {
	public static void main(String[] args) {
		
		int[][] values = {
				{4,3,6,1,5,2},
				{4,2,6,1,5,3},
				{1,2,3,4,5,6},
				{3,6,4,5,1,2},
				{3,5,2,4,6,1}
				};
		
		
		for(int i = 0; i < values.length; i++) {
			BST tree = new BST();
			for(int v : values[i]) {
				tree.add(v);
			}
			System.out.println("Tree "+(i+1)+": "+tree.toString());
			System.out.println("Is it balanced?  "+(tree.isBalanced()?"Yes":"No"));
			System.out.println();
		}
		
	}
}
