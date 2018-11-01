package Slow.slicing.triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TriangleApp {
	static int theNumber;

	public static void main(String[] args) throws IOException {
		System.out.println("Enter a number: ");
		theNumber = getInt();
		int theAnswer = triangle(theNumber);
		System.out.println("Triangle=" + theAnswer);
	}

	private static int triangle(int number) {
		if (number == 1)
			return 1;
		else
			return (number+triangle(number-1));
	}

	private static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}

	private static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		String s = bf.readLine();
		return s;
	}
}
