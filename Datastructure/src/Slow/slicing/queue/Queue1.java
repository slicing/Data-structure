package Slow.slicing.queue;

public class Queue1 {
	private int maxSize;
	private long[] queArray;
	private int front;
	private int rear;

	public Queue1(int s){
		maxSize = s+1;
		queArray = new long[maxSize];
		front = 0;
		rear = -1;
	}
	public void insert(long i) {
		if (rear == maxSize)
			rear = -1;
		queArray[++rear] = i;
	}
	public long remove(){
		long temp = queArray[front++];
		if(front == maxSize)
			front = 0;
		return temp;
	}

	public long peek(){
		return queArray[front];
	}
	public boolean isEmpty(){
		return (rear+1 == front || front+maxSize-2 == rear);
	}

	public boolean isFull(){
		return (rear+2 == front || front+maxSize-2 == rear);
	}

	public int seize(){
		if(rear >= front)
			return rear-front+1;
		else
			return (maxSize-front) + (rear+1);
	}
}
