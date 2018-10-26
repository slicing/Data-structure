package Slow.slicing.linklist;

public class LinkStack {
	private LinkList2 theLink;
	public LinkStack(){
		theLink = new LinkList2();
	}
	public void push(long i){
		theLink.insertLink(i);
	}
	public long pop(){
		return  theLink.deleteFirst();
	}
	public boolean isEmpty(){
		return theLink.isEmpty();
	}

	public void displayStack(){
		System.out.print("Stack (top --> bottom)");
		theLink.displayList();
	}
}
