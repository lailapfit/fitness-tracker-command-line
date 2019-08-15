package FitnessTracker;

import java.util.Scanner;

public class FitnessTrackerApp {
	
	private static final String MAIN_MENU_ADD_EXERCISE = "Add a workout";
	private static final String MAIN_MENU_WEIGHT = "Update current weight";
	private static final String MAIN_MENU_PROGRESS_REPORT = "Progress Report";
	private static final String MAIN_MENU_EXIT = "Exit";
	private static final String[] MAIN_MENU_OPTIONS = new String[] {MAIN_MENU_ADD_EXERCISE,
																	MAIN_MENU_WEIGHT, 
																	MAIN_MENU_PROGRESS_REPORT,
																	MAIN_MENU_EXIT};
	
	private static final String ADD_WORKOUT_SUBMENU_DAYS = "Today is ";
	private static final String ADD_WORKOUT_SUBMENU_EXERCISE_KIND = "Select workout type: ";
	private static final String ADD_WORKOUT_SUBMENU_MINUTES = "Length (minutes)";
	private static final String[] SUBMENU_OPTIONS = new String[] {ADD_WORKOUT_SUBMENU_DAYS,
																ADD_WORKOUT_SUBMENU_EXERCISE_KIND, 
																ADD_WORKOUT_SUBMENU_MINUTES};
	
	private static final String PROGRESS_REPORT_SUBMENU_EXERCISE_COUNT = "Exercises logged: ";
	private static final String PROGRESS_REPORT_SUBMENU_EXERCISE_LIST = "List of exercises completed: ";
	private static final String PROGRESS_REPORT_SUBMENU_EXERCISE_MINUTES = "Total minutes logged: ";
	private static final String PROGRESS_REPORT_SUBMENU_WEIGHT_CURRENT = "Current weight: ";
	private static final String PROGRESS_REPORT_SUBMENU_WEIGHT_INITIAL = "Initial weight: ";
	private static final String[] PROGRESS_REPORT_OPTIONS = new String[] {PROGRESS_REPORT_SUBMENU_EXERCISE_COUNT,
																		PROGRESS_REPORT_SUBMENU_EXERCISE_LIST,
																		PROGRESS_REPORT_SUBMENU_EXERCISE_MINUTES,
																		PROGRESS_REPORT_SUBMENU_WEIGHT_CURRENT,
																		PROGRESS_REPORT_SUBMENU_WEIGHT_INITIAL};
	
	private Menu menu;
	private static final String MAIN_MENU_WELCOME_BANNER = "Welcome to the Fitness Tracker App!";
	private AddExercise exercise = new AddExercise();
	private UpdateWeight weight = new UpdateWeight();
	
	public static void main(String[] args) {
		FitnessTrackerApp application = new FitnessTrackerApp();
		application.run();

	}

	public FitnessTrackerApp() {
		
		this.menu = new Menu(System.in, System.out);

}
	
	private void run() {
		displayMessage();
		while(true) {
			System.out.println("Main Menu: ");
			String mainMenuChoice = (String) menu.getChoiceFromOptions(MAIN_MENU_OPTIONS);
			if(mainMenuChoice.equals(MAIN_MENU_ADD_EXERCISE)) {
				addExerciseSubMenu();
			} else if(mainMenuChoice.equals(MAIN_MENU_WEIGHT)) {
				weight.updateWeight();
			} else if (mainMenuChoice.equals(MAIN_MENU_PROGRESS_REPORT)) {
				
			} else if (mainMenuChoice.equals(MAIN_MENU_EXIT)) {
				System.exit(0);
			}
			
		}
	}
	
	private void addExerciseSubMenu() {
		System.out.println("Congratulations! You completed a workout, add your success.");
		String addExerciseChoice = (String)menu.getChoiceFromOptions(SUBMENU_OPTIONS);
		if(addExerciseChoice.equals(ADD_WORKOUT_SUBMENU_DAYS)) {
			exercise.addExerciseDays();
		} else if(addExerciseChoice.equals(ADD_WORKOUT_SUBMENU_EXERCISE_KIND)) {
			System.out.println("working");
		} else if(addExerciseChoice.equals(ADD_WORKOUT_SUBMENU_MINUTES)) {
			System.out.println("working");
		}
	}
	
	private void displayMessage() {
		System.out.println(MAIN_MENU_WELCOME_BANNER);
		
	}
	
	
	@SuppressWarnings("resource")
	private String getUserInput(String prompt) {
		System.out.print(prompt + " >>> ");
		return new Scanner(System.in).nextLine();
	}
	
	

}
