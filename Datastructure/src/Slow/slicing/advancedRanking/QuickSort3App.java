package Slow.slicing.advancedRanking;

public class QuickSort3App {
	public static void main(String[] args) {
		int maxSize = 16;
		ArrayIns arrayIns;
		arrayIns = new ArrayIns(maxSize);
		for (int i = 0;i<maxSize;i++){
			long n = (int)(Math.random()*99);
			arrayIns.insert(n);
		}
		arrayIns.display();
		arrayIns.quickSort2();
		arrayIns.display();
	}
}
