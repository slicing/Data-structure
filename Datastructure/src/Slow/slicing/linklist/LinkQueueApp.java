package Slow.slicing.linklist;

public class LinkQueueApp {
	public static void main(String[] args) {
		LinkQueue theQueue = new LinkQueue();
		theQueue.insert(20);
		theQueue.insert(40);
		theQueue.displayQueue();
		theQueue.insert(50);
		theQueue.insert(24);
		theQueue.displayQueue();
		theQueue.remove();
		theQueue.remove();
		theQueue.displayQueue();
	}
}
