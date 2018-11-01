package Slow.slicing.triangle;

public class DArray {
	private long[] array;
	private int nElems;
	public DArray(int max){
		array = new long[max];
		nElems = 0;
	}
	public void insert(long value){
		array[nElems] = value;
		nElems++;
	}
	public void disPlay(){
		for (int i = 0;i<nElems;i++){
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	public void mergeSort(){
		long[] workSpace = new long[nElems];
		recMergeSort(workSpace,0,nElems-1);
	}

	private void recMergeSort(long[] workSpace, int lowerBound, int upperBound) {
		if (lowerBound == upperBound)
			return;
		else {
			int mid = (lowerBound + upperBound)/2;
			recMergeSort(workSpace,lowerBound,mid);
			recMergeSort(workSpace,mid+1,upperBound);
			merge(workSpace,lowerBound,mid+1,upperBound);
		}
	}

	private void merge(long[] workSpace, int lowerPtr, int hightPtr, int upperBound) {
		int i = 0;
		int lowerBound = lowerPtr;
		int mid = hightPtr-1;
		int n = upperBound-lowerBound+1;
		while (lowerPtr <= mid && hightPtr <= upperBound){
			if (array[lowerPtr] < array[hightPtr])
				workSpace[i++] = array[lowerPtr++];
			else
				workSpace[i++] = array[hightPtr++];
		}
		while (lowerPtr<=mid)
			workSpace[i++] = array[lowerPtr++];
		while (hightPtr <= upperBound)
			workSpace[i++] = array[hightPtr++];
		for (i = 0;i<n;i++)
			array[lowerBound+i] = workSpace[i];

	}
}
