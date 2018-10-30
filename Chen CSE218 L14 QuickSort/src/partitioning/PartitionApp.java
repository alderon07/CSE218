package partitioning;

public class PartitionApp {

	public static void main(String[] args) {
		int maxSize = 16;
		ArrayPar arr = new ArrayPar(maxSize);
		
		for(int j = 0; j < maxSize; j++) {
			long n = (int) (Math.random() * 199);
			arr.insert(n);
		}
		
		arr.display();
		
		long pivot = 100;
		System.out.println("The pivot value is " + pivot);
		int size = arr.size();
		int partitionIndex = arr.partitionIt(0, size-1, pivot);
		arr.display();
		System.out.println("Partition Index is: " + partitionIndex);
	}

}
