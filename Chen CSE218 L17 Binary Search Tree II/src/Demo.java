
public class Demo {

	public static void main(String[] args) {
		Tree tree = new Tree();
		
		Node nodeA = new Node(20, 1.1);
		Node nodeB = new Node(10, 2.2);
		Node nodeC = new Node(30, 3.2);
		Node nodeD = new Node(5, 1.1);
		Node nodeE = new Node(12, 2.2);
		Node nodeF = new Node(25, 1.2);
		Node nodeG = new Node(35, 2.3);
				
				
		
		tree.insert(nodeD); // root
		tree.insert(nodeE);
		tree.insert(nodeB);
		tree.insert(nodeC);
		tree.insert(nodeF);
		tree.insert(nodeG);
		tree.insert(nodeA);

		
		tree.inOrder(nodeD);
		
	}

}
