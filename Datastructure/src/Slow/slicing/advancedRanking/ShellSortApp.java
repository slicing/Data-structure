package Slow.slicing.advancedRanking;

public class ShellSortApp {
	public static void main(String[] args) {
		int maxSize = 10;
		ArraySh arr;
		arr = new ArraySh(maxSize);
		for (int i = 0;i<maxSize;i++){
			long n = (int)(Math.random()*99);
			arr.insert(n);
		}
		arr.disPlay();
		arr.shellShort();
		arr.disPlay();
	}
}
