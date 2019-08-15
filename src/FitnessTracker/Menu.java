package FitnessTracker;

import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Menu {
	
	private PrintWriter out;
	private Scanner in;
	
	public Menu(InputStream input, OutputStream output) {
		this.out = new PrintWriter(output);
		this.in = new Scanner(input);
	}
	
	public Object getChoiceFromOptions(Object[] options) {
		Object choice = null;
		while(choice == null) {
			displayMenuOptions(options);
			choice = getChoiceFromUserInput(options);
		}
		return choice;
		
	}
	
	private Object getChoiceFromUserInput(Object[] options) {
		Object choice = null;
		String userInput = in.nextLine();
		try {
			int selectedOptionNumber = Integer.valueOf(userInput);
			if(selectedOptionNumber <= options.length) {
				choice = options[selectedOptionNumber - 1];
			}
		} catch(NumberFormatException e) {
			//take care of the error
		} if(choice == null) {
			out.println(userInput + " is not a valid option. Please try again.");
		}
		return choice;
	}
	
	private void displayMenuOptions(Object[] options) {
		out.println();
		for(int i = 0; i < options.length; i++) {
			int optionNumber = i + 1;
			out.println(optionNumber + ") " + options[i]);
		}
		out.println("Please choose an option: ");
		out.flush();
	}
	
}
