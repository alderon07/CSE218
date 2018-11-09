
public class Node {
	int iData;
	double dData;
	Node leftChild;
	Node rightChild;
	
	public Node(int i, double d) {
		iData = i;
		dData = d;
	}
	
	public void displayNode() {
		System.out.print("{");
		System.out.print(iData);
		System.out.print(", ");
		System.out.print(dData);
		System.out.print("}");
	}
}
