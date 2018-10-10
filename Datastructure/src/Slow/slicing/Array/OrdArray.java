package Slow.slicing.Array;

public class OrdArray {
	private long[] a;
	private int nElems;

	public OrdArray(int max){
		a = new long[max];
		nElems = 0;
	}
	public int size(){
		return nElems;
	}

	public int find(long searchKey){
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;
		while (true){
			curIn = (lowerBound + upperBound)/2;
			if(a[curIn] == searchKey)
				return curIn;
			else if (lowerBound > upperBound)
				return nElems;
			else if (a[curIn] > searchKey){
				upperBound = curIn -1;
			}
			else
				lowerBound = curIn + 1;
		}
	}
	public void insert(long value){
		int i;
		for(i = 0;i<nElems;i++){
			if(a[i]>value)
				break;
		}
		for(int k = nElems;k>i;k--)
			a[k] = a[k-1];
		a[i] = value;
		nElems++;
	}

	public boolean delete(long value){
		int j = find(value);
		if(j == nElems){
			return false;
		}
		else {
			for(int k = j;k<nElems;k++){
				a[k] = a[k+1];
			}
			nElems--;
			return true;
		}
	}
	public void display(){
		for (int i = 0;i<nElems;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}

