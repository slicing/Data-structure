package Slow.slicing.triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramApp {
	static int size;
	static int count;
	static char[] arrChar = new char[100];

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a word: ");
		String input = getString();
		size = input.length();
		count = 0;
		for (int i = 0;i<size;i++){
			arrChar[i] = input.charAt(i);
		}
		doAngram(size);
	}

	private static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		String s = bf.readLine();
		return s;
	}

	private static void doAngram(int size) {
		if (size == 1)
			return;
		for (int i = 0;i<size;i++){
			doAngram(size-1);
			if (size == 2)
				displayWord();
			rotate(size);
		}
	}

	private static void displayWord() {
		if (count <99)
			System.out.print("  ");
		if (count < 9)
			System.out.print(" ");
		System.out.print(++count + " ");
		for (int i = 0;i<size;i++)
			System.out.print(arrChar[i]);
		System.out.print("  ");
		System.out.flush();
		if (count%6 == 0)
			System.out.println(" ");
	}

	private static void rotate(int newsize) {
		int i ;
		int position = size - newsize;
		char temp = arrChar[position];
		for (i = position+1;i<size;i++){
			arrChar[i-1] = arrChar[i];
		}
		arrChar[i-1] = temp;
	}
}
