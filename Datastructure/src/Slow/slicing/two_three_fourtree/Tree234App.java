package Slow.slicing.two_three_fourtree;

import javax.swing.text.html.CSS;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tree234App {
	public static void main(String[] args) throws IOException {
		long value;
		Tree234 theTree = new Tree234();
		theTree.insert(50);
		theTree.insert(40);
		theTree.insert(60);
		theTree.insert(30);
		theTree.insert(70);
		while (true){
			System.out.print("Enter first letter of  show insert or find: \n");
			char choice = getChar();
			switch (choice){
				case 's':
					theTree.displayTree();
					break;
				case 'i':
					System.out.print("Enter value to insert: ");
					value = getInt();
					theTree.insert(value);
					break;
				case 'f':
					System.out.print("Enter value to find: ");
					value = getInt();
					int found = theTree.find(value);
					if (found != -1)
						System.out.print("Found " + value + "\n");
					else
						System.out.println("Could not find " + value);
					break;
					default:
						System.out.println("Invalid entry ");
			}
		}
	}

	private static int getInt() throws IOException {
		String s = getString();
		return Integer.parseInt(s);
	}

	private static char getChar() throws IOException {
		String s = getString();
		return s.charAt(0);
	}

	private static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bf = new BufferedReader(isr);
		String s = bf.readLine();
		return s;
	}
}
