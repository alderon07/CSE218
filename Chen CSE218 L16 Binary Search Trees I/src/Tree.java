
public class Tree {
	
	private Node root;
	
	public Tree() {
		root = null;
	}
	
	public Node find(int key) {
		Node current = root; // start at root
		
		while(current.iData != key) { // while no match
			if(key < current.iData) { // go left?
				current = current.leftChild;
			} else { // go right
				current = current.rightChild;
			}
			
			if(current == null) { // end of the line, no child found
				return null;
			}
		}
		return current;
	}
	
	public void insert(int id, double dd) {
		Node newNode = new Node();
		newNode.iData = id;
		newNode.dData = dd;
		if(root == null) { // empty?
			root = newNode;
		} else {
			Node current = root; // start at root
			Node parent;
			while(true) {
				parent = current;
				if(id < current.iData) { // go left?
					current = current.leftChild;
					if(current == null) { // if end of the line
						parent.leftChild = newNode;
						return;
					}
				} else { // go right
					current = current.rightChild;
					if(current == null) { // end of the line
						parent.rightChild = newNode;
						return;
					}
				}
			}
		}
	}
}
