package Slow.slicing.Array;

public class HighArray {
	private long[] a;
	private int nElems;
	public HighArray(int max){
		a = new long[max];
		nElems = 0;

	}
	public boolean find(long searchKey){
		int j;
		for(j = 0;j<nElems;j++){
			if(a[j] == searchKey){
				break;
			}
		}
		if(j == nElems)
			return false;
		else
			return true;
	}

	public void insert(long value){
		a[nElems] = value;
		nElems++;
	}
	public long getMax(){
		long max = -1;
		for (int i  = 0;i<nElems;i++){
			if(a[i] > max){
				max = a[i];
			}
		}
		return max;
	}
	public void removeMax(){
		boolean flag;
		flag = delete(getMax());
		display();
	}

	public boolean delete(long value){
		int i;
		for (i = 0;i<nElems;i++){
			if(a[i] == value)
				break;
		}
		if(i == nElems)
			return false;
		else {
			for (int j = i;j<nElems;j++){
				a[j] = a[j+1];
			}
			nElems--;
			return true;
		}
	}

	public void display(){
		for(int i=0;i<nElems;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
