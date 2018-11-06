package Slow.slicing.Tree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeApp {
	public static void main(String[] args) throws IOException {
		int value;
		Tree theTree = new Tree();
		theTree.insert(50,1.2);
		theTree.insert(25,1.5);
		theTree.insert(23,3.5);
		theTree.insert(75,1.7);
		theTree.insert(12,7.3);
		theTree.insert(43,1.7);
		theTree.insert(73,1.2);
		theTree.insert(43,1.2);
		theTree.insert(30,1.5);
		theTree.insert(33,1.7);
		theTree.insert(87,1.5);
		theTree.insert(96,3.5);
		theTree.insert(28,7.3);
		while (true){
			System.out.print("Enter first letter of show, insert find delete or traverse: ");
			int choice = getChar();
			switch (choice){
				case 's':
					theTree.displayTree();
					break;
				case 'i':
					System.out.print("Enter value to insert: ");
					value = getInt();
					theTree.insert(value,value+0.9);
					break;
				case 'f':
					System.out.print("Enter value of find: ");
					value = getInt();
					Node found = theTree.find(value);
					if (found != null) {

						System.out.print("Found: ");
						found.displayNode();
						System.out.println();
					}
					else
						System.out.println("Could not find " + value);
					break;
				case 'd':
					System.out.println("Enter value to delete: ");
					value = getInt();
					boolean didDelete = theTree.delete(value);
					if (didDelete)
						System.out.println("Deleted " + value);
					else
						System.out.println("Could not delete " + value);
					break;
				case 't':
					System.out.println("Enter type 1,2 or 3");
					value = getInt();
					theTree.traverse(value);
					break;
					default:
						System.out.println("Invalid entry");
			}
		}
	}

	private static char getChar() throws IOException {
		String s = getString();
		return  s.charAt(0);
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
