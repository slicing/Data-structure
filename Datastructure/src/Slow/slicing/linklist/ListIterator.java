package Slow.slicing.linklist;

public class ListIterator {
	private Link2 current;
	private Link2 previous;
	private LinkList2 ourList;

	public ListIterator(LinkList2 list){
		ourList = list;
		reset();
	}

	public void reset() {
		current = ourList.getFirst();
		previous = null;
	}
	public boolean atEnd(){
		return current.next == null;
	}
	public void nextLink(){
		previous = current;
		current = current.next;
	}

	public Link2 getCurrent(){
		return current;
	}

	public void insertAfter(long dd){
		Link2 newLink = new Link2(dd);
		if(ourList.isEmpty()){
			ourList.setFirst(newLink);
			current = newLink;
		}
		else {
			newLink.next = current.next;
			current.next = newLink;
			nextLink();
		}
	}
	public void insertBefore(long dd){
		Link2 newLink = new Link2(dd);
		if(previous==null){
			newLink.next = ourList.getFirst();
			ourList.setFirst(newLink);
			reset();
		}
		else{
			newLink.next = previous.next;
			previous.next = newLink;
			current = newLink;
		}
	}
	public long deleteCurrent() {
		long value = current.dData;
		if (previous == null) {
			ourList.setFirst(current.next);
			reset();
		} else {
			previous.next = current.next;
			if (atEnd())
				reset();
			else
				current = current.next;
		}
		return value;
	}
}
