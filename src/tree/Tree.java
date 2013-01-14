package tree;

public class Tree {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Tree launch = new Tree();
		launch.launch3();
		
	}
	
	private void launch()
	{
		IntegerTreeNode tree = new IntegerTreeNode(5);
		tree.add(10);
		tree.add(3);
		tree.add(8);
		tree.add(1);
		tree.add(4);
		tree.add(7);
		tree.add(2);
		tree.add(6);
		tree.add(9);
		
		tree.treeList(tree);
		
		System.out.println("Contains integer 2: " +  tree.contains(2));
		
		System.out.println("Smallest value: " + tree.getMin());
		System.out.println("Highest value: " + tree.getMax());
		System.out.println("to string: \n" + tree.toString());
		System.out.println("Tree Depth: \n" + tree.depth());
		
	}
	
	private void launch2()
	{
		TreeIntSet tree2 = new TreeIntSet(5);
		tree2.add(10);
		tree2.add(3);
		tree2.add(8);
		tree2.add(1);
		tree2.add(4);
		tree2.add(7);
		tree2.add(2);
		tree2.add(6);
		tree2.add(9);
		
		tree2.treeList();
		
		int test = 2;
		System.out.println("Contains integer " + test + ": " +  tree2.contains(test));
		
		tree2.containsVerbose(test);
		
		System.out.println("to string: \n" + tree2.toString());
		
	}
	private void launch3()
	{
		ListIntSet list = new ListIntSet(5);
		list.add(10);
		list.add(3);
		list.add(8);
		list.add(1);
		list.add(4);
		list.add(7);
		list.add(2);
		list.add(6);
		list.add(12);
		
		list.listNodes();
		
		/**
		System.out.println("to string: \n" + list.toString());
		*/
		int test = 9;
		System.out.println("Contains integer " + test + ": " +  list.contains(test));
		
		boolean x = list.containsVerbose(test);
		System.out.print(" " + x);
		
		System.out.println("\nto string: \n" + list.toString());
	}
}
