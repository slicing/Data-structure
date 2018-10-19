package Slow.slicing.Stack;

public class StackX1 {

	private int maxSize;
	private char[] stackArray;
	private int top;
	public StackX1(int s){
		maxSize = s;
		stackArray = new char[maxSize];
		top = -1;
	}
	public void push(char j){
		stackArray[++top] = j;
	}
	public char pop( ){
		return stackArray[top--];
	}
	public char peek(){
		return stackArray[top];
	}
	public boolean isEmpty(){
		return (top == -1);
	}
	public char peekN(int n){
		return stackArray[n];
	}
	public int size(){
		return top+1;
	}
	public void displayStack(String s){
		System.out.print(s);
		System.out.print("Stack (bottom -->top: ");
		for(int j = 0;j<size();j++){
			System.out.print(peekN(j));
			System.out.print(' ');
		}
		System.out.println();
	}
	public boolean isFull(){
		return (top == maxSize-1);
	}

}