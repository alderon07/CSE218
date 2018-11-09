
public class Demo {

	public static void main(String[] args) {
		Tree theTree = new Tree();
		theTree.insert(100, 5.0);
		theTree.insert(50, 2.5);
		theTree.insert(125,  7.5);
		theTree.insert(90, 2.3);
		theTree.insert(70, 1.2);
		theTree.find(101).displayNode();
	}

}
