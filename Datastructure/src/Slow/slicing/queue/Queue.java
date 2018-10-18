package Slow.slicing.queue;

public class Queue {
	private int maxSise;
	private long[] queArray;
	private int front;
	private int rear;
	private int nItems;
	public Queue(int s){
		maxSise = s;
		queArray = new long[maxSise];
		front = 0;
		rear = -1;
		nItems = 0;
	}
	public void insert(long i){
		if(rear == maxSise-1)
			rear = -1;
		queArray[++rear] = i;
		nItems++;
	}
	public long remove(){
		long temp = queArray[front++];
		if(front == maxSise)
			front = 0;
		nItems--;
		return temp;
	}
	public long peekFront(){
		return queArray[front];
	}
	public boolean isEmpty(){
		return (nItems == 0);
	}
	public boolean isFul(){
		return (nItems == maxSise);
	}
}
