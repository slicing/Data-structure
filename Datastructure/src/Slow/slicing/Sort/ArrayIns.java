package Slow.slicing.Sort;

public class ArrayIns {
	private long[] a;
	private int nElems;

	public ArrayIns(int max){
		a = new long[max];
		nElems = 0;
	}

	public void insert(long value){
		a[nElems] = value;
		nElems++;
	}

	public void display(){
		for (int i = 0;i<nElems;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	public long median(){
		long num;
		if(nElems%2 == 0){
			num = (a[nElems/2-1]+a[nElems/2])/2;
		}
		else
			num = a[nElems/2];
		return num;
	}

	public void noDups(){
		for(int i = 0;i<nElems;i++){
			for(int j = i+1;j<nElems;j++){
				if(a[i] == a[j]){
					a[i] = Long.parseLong(null);
					break;
				}
			}
		}
		for(int i = nElems-1;i>0;i++){
			if(a[i] !=  Long.parseLong(null))
				nElems = i+1;
		}
	}

	public void insertSort(){
		int in,out;
		int count = 0;
		int copy = 0;
		for (out = 1;out<nElems;out++){
			long temp = a[out];
			in = out;
			while(in > 0 && a[in-1] >= temp){
				a[in] = a[in-1];
				--in;
				copy++;
			}
			a[in] =   temp;
			count++;
		}
	}
}
