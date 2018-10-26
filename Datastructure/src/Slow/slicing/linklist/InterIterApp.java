package Slow.slicing.linklist;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InterIterApp {
	public static void main(String[] args) throws IOException {
		LinkList2 theList = new LinkList2();
		ListIterator iterator = theList.getIterator();
		long value;
		iterator.insertAfter(20);
		iterator.insertAfter(40);
		iterator.insertAfter(60);
		iterator.insertBefore(80);
		while (true){
			System.out.println("Enter first letter of show,reset, ");
			System.out.println("next.get,before,after,delete: ");
			System.out.flush();
			int choice = getChar();
			switch (choice){
				case 's':
					if (!theList.isEmpty())
						theList.displayList();
					else
						System.out.println("List is empty");
					break;
				case 'r':
					iterator.reset();
					break;
				case 'n':
					if(!theList.isEmpty() && !iterator.atEnd())
						iterator.nextLink();
					else
						System.out.println("Can`t do to next link");
					break;
				case 'g':
					if (!theList.isEmpty()){
						value = iterator.getCurrent().dData;
						System.out.println("Returned " + value);
					}
					else
						System.out.println("List is empty");
					break;
				case 'b':
					System.out.println("Enter value to insert: ");
					System.out.flush();
					value = getInt();
					iterator.insertBefore(value);
					break;
				case 'a':
					System.out.println("Enter value to insert: ");
					System.out.flush();
					value = getInt();
					iterator.insertAfter(value);
					break;
				case 'd':
					if (!theList.isEmpty()){
						value = iterator.deleteCurrent();
						System.out.println("Deleted  " + value);
					}
					else
						System.out.println("Can`t delete");
					break;
					default:
						System.out.println("Invalid entry");
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
