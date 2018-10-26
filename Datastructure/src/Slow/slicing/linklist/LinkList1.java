package Slow.slicing.linklist;

import java.util.Currency;

public class LinkList1 {
	private Link1 first;
	public LinkList1(){
		first = null;
	}
	public void insertFirst(int id,double dd){
		Link1 newlink = new Link1(id,dd);
		newlink.next = first;
		first = newlink;
	}
	public Link1 find(int key){
		Link1 current = first;
		while (current.iData != key){
			if(current.next == null)
				return null;
			else
				current = current.next;
		}
		return current;
	}

	public Link1 delete(int key){
		Link1 current = first;
		Link1 pervious = first;
		while (current.iData!=key){
			if(current.next == null)
				return null;
			else {
				pervious = current;
				current = current.next;
			}
		}
		if(current == first)
			first = first.next;
		else
			pervious.next = current.next;
		return current;
	}

	public void displayList(){
		System.out.print("List (first --> last): ");
		Link1 current = first;
		while (current != null){
			current.displayLink();
			current = current.next;
		}
		System.out.println();
	}
}
