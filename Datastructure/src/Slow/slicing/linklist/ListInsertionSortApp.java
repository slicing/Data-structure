package Slow.slicing.linklist;

import sun.plugin.javascript.navig.LinkArray;

public class ListInsertionSortApp {
	public static void main(String[] args) {
		int size = 10;
		Link2[] link2s = new Link2[size];
		for (int i = 0;i<size;i++){
			int n = (int)(java.lang.Math.random()*99);
			Link2 newLink = new Link2(n);
			link2s[i] = newLink;
		}
		System.out.println("Unsorted array:");
		for (int i = 0;i<size;i++){
			System.out.print(link2s[i].dData + " ");
		}
		System.out.println();
		SortedList1 theSortedList = new SortedList1(link2s);
		for (int i = 0;i<size;i++)
			link2s[i] = theSortedList.remove();
		System.out.print("Sorted array");
		for (int i = 0;i<size;i++)
			System.out.print(link2s[i].dData + " ");
		System.out.println();
	}
}
