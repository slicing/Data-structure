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
		int lowerBound = 0;
		int upperBound = nElems-1;
		int curIn;
		int i =0;
		while (true){
			curIn = (lowerBound + upperBound)/2;
			if(a[curIn] > value && a[curIn-1] < value){
				i= curIn;
				break;
			}
			else if (lowerBound > upperBound){
				i= nElems;
				break;
			}
			else if (a[curIn] > value){
				upperBound = curIn -1;
			}
			else
				lowerBound = curIn + 1;
		}
		for( int k = nElems;k>i;k--)
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
	public long[] merge(long[] arr1,long[]arr2){
		int m = arr1.length;
		int n = arr2.length;
		long[] arr = new long[m+n];
		int i = 0,j = 0, k = 0;
		while (i<m && j < n){
			if(arr1[i] < arr2[j])
				arr[k++] = arr1[i++];
			else if(arr1[i] == arr2[j]){
				arr[k++] = arr2[j++];
			}
		}
		while (i < arr1.length){
			arr[k++] = arr1[i++];
		}
		while (j < arr2.length){
			arr[k++] = arr2[j++];
		}
		return arr;
	}
}

