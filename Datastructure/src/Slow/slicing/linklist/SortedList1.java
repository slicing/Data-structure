package Slow.slicing.linklist;

public class SortedList1 {
	private Link2 first;
	public SortedList1(){
		first = null;
	}
	public SortedList1(Link2[] linkArr){
		first = null;
		for (int i = 0;i<linkArr.length;i++){
			insert(linkArr[i]);
		}
	}

	private void insert(Link2 k) {
		Link2 previous = null;
		Link2 current = first;
		while (current != null && k.dData > current.dData){
			previous = current;
			current = current.next;
		}
		if (previous == null)
			first = k;
		else
			previous.next = k;
		k.next = current;
	}

	public Link2 remove(){
		Link2 temp = first;
		first = first.next;
		return temp;
	}
}
