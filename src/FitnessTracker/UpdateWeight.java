package FitnessTracker;

import java.io.PrintWriter;
import java.util.Scanner;

public class UpdateWeight {
	
	private static final String WEIGHT_BANNER = "Please update your weight.";
	private static final String WEIGHT_SUBMENU_BANNER = "Please update your current weight (lbs)";
	private static final String WEIGHT_SUBMENU_INITIAL_BANNER = "Please record your initial weight to track your progress(lbs)";
	private static final String WEIGHT_CURRENT = "Current weight: ";
	private static final String WEIGHT_INITIAL = "Initial weight: ";
	private static final String[] WEIGHT_UPDATE_SUBMENU = {WEIGHT_CURRENT, WEIGHT_INITIAL};
	
	private PrintWriter out;
	private Scanner in;
	
	private Menu menu;
	
	public void updateWeight() {
		System.out.println(WEIGHT_BANNER);
		weightSubMenu();
		
	}
	
	private void weightSubMenu() {
		this.menu = new Menu(System.in, System.out);
		String choice = (String)menu.getChoiceFromOptions(WEIGHT_UPDATE_SUBMENU);
		if(choice.equals(WEIGHT_CURRENT)) {
			System.out.println(WEIGHT_CURRENT + addCurrentWeight());	
		} else if(choice.equals(WEIGHT_INITIAL)) {
			System.out.println(WEIGHT_INITIAL + addInitialWeight());
		}
		
	}
	
	private Integer addCurrentWeight() {
		System.out.println(WEIGHT_SUBMENU_BANNER);
		Integer userInput = new Scanner(System.in).nextInt();	
		
		return userInput;
	}
	
	private Integer addInitialWeight() {
		System.out.println(WEIGHT_SUBMENU_INITIAL_BANNER);
		Integer userInputInitialWeight = new Scanner(System.in).nextInt();	
		
		return userInputInitialWeight;
	}
	

}
