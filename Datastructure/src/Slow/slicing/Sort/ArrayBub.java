package Slow.slicing.Sort;

public class ArrayBub {
	private long[] a;
	private int nElems;
	public ArrayBub(int max){
		a = new long[max];
		nElems = 0;
	}

	public void insert(long value){
		a[nElems] = value;
		nElems++;
	}

	public void display(){
		for(int i = 0;i<nElems;i++){
			System.out.print(a[i] +" ");
		}
		System.out.println();
	}

	public void bubbleSort(){
		int out,in;
		for(out=nElems-1;out>1;out--){
			for(in = 0;in<out;in++){
				if(a[in]> a[in+1])
					swap(in,in+1);
			}
			for(in = out-1;in > 0;in--){
				if(a[in] < a[in-1]){
					swap(in,in-1);
				}
			}
		}
	}

	public void oddEvenSort(){//奇偶排序
		int exchFlag = 1,start = 0;
		while (exchFlag == 1 || start == 1){
			exchFlag = 0;
			for (int i = start;i<nElems-1;i += 2){
				if(a[i]>a[i+1]){
					swap(i,i+1);
					exchFlag = 1;
				}
			}
			if(start == 0)
				start = 1;
			else
				start = 0;
		}

	}

	private void swap(int one, int two) {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	}
}
