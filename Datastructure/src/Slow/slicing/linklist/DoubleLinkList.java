package Slow.slicing.linklist;

import javax.xml.bind.Element;

public class DoubleLinkList {
	private Link2 first;
	private Link2 last;
	public DoubleLinkList(){
		first = null;
		last = null;
	}
	public boolean isEmpty(){
		return first == null;
	}
	public void insertFirst(long value){
		Link2 newlink = new Link2(value);
		if (isEmpty())
			last = newlink;
		else
			first.previous = newlink;
		newlink.next = first;
		first = newlink;
	}

	public void insertLast(long value){
		Link2 newLink = new Link2(value);
		if(isEmpty())
			first = newLink;
		else {
			last.next = newLink;
			newLink.previous = last;
		}
		last = newLink;
	}

	public Link2 deleteFisrt(){
		Link2 temp = first;
		if(first.next == null)
			last = null;
		else
			first.next.previous = null;
		first = first.next;
		return temp;
	}
	public Link2 deleteLast(){
		Link2 temp = last;
		if(first.next == null)
			last = null;
		else
			last.previous.next = null;
		last = last.next;
		return temp;
	}
	public boolean insertAfter(long key,long dd){
		Link2 current = first;
		while(current.dData != key){
			current = current.next;
			if(current == null)
				return false;
		}
		Link2 newLink = new Link2(dd);
		//System.out.println(last);
		if(current.next == last){
			newLink.next = null;
			last = newLink;
		}
		else {
			newLink.next = current.next;
			current.next.previous = newLink;
		}
		newLink.previous = current;
		current.next = newLink;
		return true;
	}
	public Link2 deleteKey(long key){
		Link2 current = first;
		while(current.dData != key){
			current = current.next;
			if(current == null)
				return null;
		}
		if(current == first)
			first = current.next;
		else
			current.previous.next = current.next;
		if(current == last)
			last = current.previous;
		else
			current.next.previous = current.previous;
		return current;
	}
	public void displayForward(){
		System.out.print("List(first --> last): ");
		Link2 current = first;
		while (current!=null){
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
	public void displayBackward(){
		System.out.print("List(last --> first): ");
		Link2 current = last;
		while (current!=null){
			current.displayLink();
			current = current.previous;
		}
		System.out.println();
	}


}

