package Slow.slicing.Sort;

public class ArrayInOb {
	private Person[] a;
	private  int nElems;
	public ArrayInOb(int max){
		a = new Person[max];
		nElems = 0;
	}

	public void insert(String last,String first,int age){
		a[nElems] = new Person(last,first,age);
		nElems++;
	}
	public void disPlay(){
		for (int i = 0;i<nElems;i++){
			a[i].display();
		}
		System.out.println();
	}
	public void insertSort(){
		int in,out;
		for(out=1;out<nElems;out++){
			Person temp = a[out];
			in = out;
			while (in>0&&a[in-1].getLastName().compareTo(temp.getLastName())>0){
				a[in] = a[in-1];
				--in;
			}
			a[in] = temp;
		}
	}
}
