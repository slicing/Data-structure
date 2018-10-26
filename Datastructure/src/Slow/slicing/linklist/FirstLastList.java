package Slow.slicing.linklist;

public class FirstLastList {
	private Link2 first;
	private Link2 last;
	public FirstLastList(){
		first = null;
		last = null;
	}
	public boolean isEmpty(){
		return first == null;
	}
	public void insertFirst(long id){
		Link2 link2 = new Link2(id);
		if(isEmpty())
			last = link2;
		link2.next = first;
		first = link2;
	}

	public void insertLast(long id){
		Link2 link2 = new Link2(id);
		if (isEmpty())
			first = link2;
		else
			last.next = link2;
		last = link2;
	}
	public long deleteFirst(){
		long temp = first.dData;
		if(first.next == null)
			last = null;
		first = first.next;
		return temp;
	}


	public void  displayList(){
		System.out.print("List ( first --> last): ");
		Link2 current = first;
		while (current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println(" ");
	}
}
