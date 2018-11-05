package Slow.slicing.advancedRanking;

public class ArrayPar {
	private long[] theArray;
	private int nElems;
	public ArrayPar(int max){
		theArray = new long[max];
		nElems = 0;
	}
	public void insert(long value){
		theArray[nElems] = value;
		nElems++;
	}
	public int size(){
		return nElems;
	}
	public void display(){
		for (int i = 0;i<nElems;i++){
			System.out.print(theArray[i] + " ");
		}
		System.out.println();
	}
	public int partitionIt(int left,int right,long pivot){
		int leftPtr = left -1;
		int rightPrt = right +1;
		while (true){
			while (leftPtr < right && theArray[++leftPtr] < pivot)
				;
			while (rightPrt > left && theArray[--rightPrt] > pivot)
				;
			if (leftPtr >= rightPrt)
				break;
			else
				swap(leftPtr,rightPrt);
		}
		return leftPtr;
	}

	private void swap(int dex1, int dex2) {
		long temp;
		temp = theArray[dex1];
		theArray[dex1] = theArray[dex2];
		theArray[dex2] = temp;
	}
}
