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
	public void sort(){
		long  temp;
		for(int i =0;i<nElems;i++){
			for(int j = 0;j<nElems-i;j++){
				if(a[j] < a[j+1]){
					temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
				}
			}
		}
		long[]arr = new long[nElems];
		for(int i = 0;i<nElems;i++){
			arr[i] = a[nElems-i-1];
		}
		a = arr;
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
	public void noDup(){
		for(int i = 0;i<nElems;i++){
			for(int j = i+1;j<nElems;j++){
				if(a[i] == a[j]){
					a[i] = Long.parseLong(null);
					break;
				}
			}
		}
		sort();
		int j = 0;
		for(int i = nElems-1;i>0;i--){
			if(Long.parseLong(null) != a[i]){
				j = i;
				break;
			}
		}
		nElems = j;
		display();
	}

	public void display(){
		for(int i=0;i<nElems;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
