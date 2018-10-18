package Slow.slicing.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BracketsApp {
	public static void main(String[] args) throws IOException {
		String input;
		while (true){
			System.out.println("Enter string containing delimiters:");
			System.out.flush();
			input = getString();
			if(input.equals(""))
				break;
			BracketChecher theChecker = new BracketChecher(input);
			theChecker.check();
		}
	}

	private static String getString() throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String s = br.readLine();
		return s;
	}

}
