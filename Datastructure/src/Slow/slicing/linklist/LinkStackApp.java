package Slow.slicing.linklist;

public class LinkStackApp {
	public static void main(String[] args) {
		LinkStack thestack = new LinkStack();
		thestack.push(20);
		thestack.push(40);
		thestack.displayStack();
		thestack.push(60);
		thestack.push(80);
		thestack.displayStack();
		thestack.pop();
		thestack.pop();
		thestack.displayStack();
	}
}
