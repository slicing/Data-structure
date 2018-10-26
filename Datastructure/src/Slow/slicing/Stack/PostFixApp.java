package Slow.slicing.Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PostFixApp {
	public static void main(String[] args) throws IOException {
		String input;
		int output;
		while (true) {
			System.out.print("Enter a String: ");
			System.out.flush();
			input = getString();
			if (input.equals(""))
				break;
			ParsePost parsePost = new ParsePost(input);
			output = parsePost.doParse();
			System.out.println("Evaluate to " + output);
		}
	}

		private static String getString () throws IOException {
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			String s = br.readLine();
			return s;

		}
}
