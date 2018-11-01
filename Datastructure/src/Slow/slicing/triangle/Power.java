package Slow.slicing.triangle;

import java.util.Scanner;

public class Power {
	public static void main(String[] args) {
		int x,y,s;
		x = getInt();
		y = getInt();
		s = getPower(x,y);
		System.out.println(s);
	}

	private static int getPower(int x, int y) {
		if (y == 1)
			return x;
		else
			return (x*getPower(x,--y));
	}

	private static int getInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int x = scanner.nextInt();
		return x;
	}
}
