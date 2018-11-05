package Slow.slicing.advancedRanking;

public class PartitionApp {
	public static void main(String[] args) {
		int maxSize = 16;
		ArrayPar arrayPar;
		arrayPar = new ArrayPar(maxSize);
		for (int j = 0;j<maxSize;j++){
			long n = (int)(Math.random()*199);
			arrayPar.insert(n);
		}
		arrayPar.display();
		long pivot = 99;
		System.out.print("Pivot is " + pivot);
		int size = arrayPar.size();
		int partDex = arrayPar.partitionIt(0,size-1,pivot);
		System.out.println(" , Partition is at index " + partDex);
		arrayPar.display();
	}
}
