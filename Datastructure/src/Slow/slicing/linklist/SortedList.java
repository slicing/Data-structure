package Slow.slicing.linklist;

public class SortedList {
	private Link2 link2;
	public SortedList(){
		link2 = null;
	}
	public boolean isEmpty(){
		return link2 == null;
	}
	public void insert(long key){
		Link2 newlink = new Link2(key);
		Link2 previous = null;
		Link2 current = link2;
		while (current != null &&key>current.dData){
			previous = current;
			current = current.next;
		}
		if(previous == null)
			link2 = newlink;
		else
			previous.next = newlink;
		newlink.next = current;
	}

	public Link2 remove(){
		Link2 temp = link2;
		link2 = link2.next;
		return temp
				;
	}

	public void displayList(){
		System.out.print("List (first --> last): ");
		Link2 current = link2;
		while (current!=null){
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
