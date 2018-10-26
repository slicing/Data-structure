package Slow.slicing.linklist;

public class LinkList {
	private Link first;
	public LinkList(){
		first = null;
	}
	public boolean isEmpty(){
		return (first == null);
	}
	public void insertFirst(int id,double dd){
		Link link = new Link(id,dd);
		link.next  = first;
		first = link;
	}
	public Link deleteFirst(){
		Link temp = first;
		first = first.next;
		return temp;
	}

	public  void displayList(){
		System.out.print("List ( first --> last): ");
		Link current = first;
		while (current != null){
			current.disPlayLink();
			current = current.next;
		}
		System.out.println(" ");
	}
}
