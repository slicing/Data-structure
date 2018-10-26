package Slow.slicing.linklist;

public class LinkList1App {
	public static void main(String[] args) {
		LinkList1 linkList1 = new LinkList1();
		linkList1.insertFirst(22,2.99);
		linkList1.insertFirst(44,4.99);
		linkList1.insertFirst(66,6.99);
		linkList1.insertFirst(88,8.99);
		linkList1.displayList();
		Link1 f = linkList1.find(44);
		if (f!=null)
			System.out.println("Found link with key " + f.iData);
		else
			System.out.println("Can`t find link");
		Link1 d = linkList1.delete(66);
		if(d != null)
			System.out.println("Deleted link with key " + d.iData);
		else
			System.out.println("Can`t delete link");
		linkList1.displayList();
	}
}
