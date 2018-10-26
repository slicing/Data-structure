package Slow.slicing.linklist;


public class LinkList2 {
	private Link2 first;
	public LinkList2(){
		first = null;
	}

	public Link2 getFirst() {
		return first;
	}

	public ListIterator getIterator(){
		return new ListIterator(this);

	}

	public void setFirst(Link2 first) {
		this.first = first;
	}

	public boolean isEmpty(){
		return first==null;
	}
	public void insertLink(long dd){
		Link2 newlink = new Link2(dd);
		newlink.next = first;
		first = newlink;
	}
	public long deleteFirst(){
		Link2 temp = first;
		first = first.next;
		return temp.dData;
	}

	public void displayList(){
		Link2 current = first;
		while (current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
