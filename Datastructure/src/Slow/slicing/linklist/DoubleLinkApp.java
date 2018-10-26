package Slow.slicing.linklist;

public class DoubleLinkApp {
	public static void main(String[] args) {
		DoubleLinkList theLink = new DoubleLinkList();
		theLink.insertFirst(22);
		theLink.insertFirst(44);
		theLink.insertFirst(66);
		theLink.insertLast(11);
		theLink.insertLast(33);
		theLink.insertLast(55);
		theLink.displayForward();
		theLink.displayBackward();
		theLink.deleteFisrt();
		theLink.deleteLast();
		theLink.deleteKey(11);
		theLink.displayForward();
		theLink.insertAfter(22,77);
		theLink.displayForward();
		theLink.insertAfter(33,88);
		theLink.displayForward();
	}
}
