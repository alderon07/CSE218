
public class Tree {
	private Node root;
	
	public Tree() {
		root = null;
	}
	
	public Node find(int key) {
		Node current = root;
		while(current.iData != key) {
			if(key < current.iData) {
				current = current.leftChild;
			} else {
				current = current.rightChild;
			}
			
			if (current == null) {
				return null;
			}
		}
		return current;
	}
	
	public void insert(Node newNode) {
//		Node newNode = new Node(iData, dData);
		if(root == null) { // insert into empty tree
			root = newNode;
		} else {
			Node current = root;
			Node parent;
			while(true){
				parent = current;
				if(newNode.iData < current.iData) { // go left
					current = current.leftChild;
					if(current == null) {
						parent.leftChild = newNode;
						return;
					}
				}
				else { // go right
					current = current.rightChild;
					if(current == null) {
						parent.rightChild = newNode;
						return;
					}
				}
				
			}
		}
	}
	
	public Node minimum() {
		Node current;
		Node last = null;
		current = root;
		while(current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}
	
	public Node maximum() {
		Node current;
		Node last = null;
		current = root;
		while(current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}
	
	public void inOrder(Node localRoot) {  // traverse
		if(localRoot != null) {
			inOrder(localRoot.leftChild); // left child
			System.out.print(localRoot.iData + " "); // parent
			inOrder(localRoot.rightChild); // right child
		}
	}
}
