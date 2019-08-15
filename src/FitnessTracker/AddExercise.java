package FitnessTracker;

import java.util.Scanner;


public class AddExercise {
	
	private static final String TODAY_DAY = "Today is...";
	private static final String MONDAY = "Monday";
	private static final String TUESDAY = "Tuesday";
	private static final String WEDNESDAY = "Wednesday";
	private static final String THURSDAY = "Thursday";
	private static final String FRIDAY = "Friday";
	private static final String SATURDAY = "Saturday";
	private static final String SUNDAY = "Sunday";
	private static final String[] EXERCISE_TO_ADD_DAYS = {MONDAY, TUESDAY, WEDNESDAY,
														THURSDAY, FRIDAY, SATURDAY,
														SUNDAY};
	private Menu menu;
	

	public void addExerciseDays() {
		displayMessage();
		System.out.println(addExerciseDaysCount());
	}
	
	public String addExerciseDaysCount() {
	
		this.menu = new Menu(System.in, System.out);
		String choice = (String)menu.getChoiceFromOptions(EXERCISE_TO_ADD_DAYS);
		String exerciseDay = "";
		if(choice.equals(MONDAY)) {
			exerciseDay = "KILLED THE MONDAY BLUES!!";
		} else if(choice.equals(TUESDAY)) {
			exerciseDay = "MAKING TUESDAY THE NEW HUMP DAY.";
		} else if(choice.equals(WEDNESDAY)) {
			exerciseDay = "WHATS UP WEDNESDAY GOALS. YOU'RE KILLING THIS WEEK BOO!";
		} else if(choice.equals(THURSDAY)) {
			exerciseDay = "NO LONGER THIRSTY FOR THURSDAY, JUST THIRSTY FOR GAINZ";
		} else if(choice.equals(FRIDAY)) {

			exerciseDay = "FRIYAY! WAY TO KICK OFF THE WEEKEND VIBE.";
		} else if(choice.equals(SATURDAY)) {
			exerciseDay = "OH ISSA SATURDAY";
		} else if(choice.equals(SUNDAY)) {
			exerciseDay = "WHAT A BRILLIANT DAY TO END THE WEEK. CONGRATS!";
		} else {
			exerciseDay = "PLEASE SELECT A CORRECT DAY";
		}
		return exerciseDay;
		
	}
	
	public int exerciseCount() {
		
		this.menu = new Menu(System.in, System.out);
		String choice = (String)menu.getChoiceFromOptions(EXERCISE_TO_ADD_DAYS);
		int count = 0;

		for(int i = 0; i < EXERCISE_TO_ADD_DAYS.length; i++) {
			if(choice.equals(EXERCISE_TO_ADD_DAYS[i])) {
				count += 1;
			}
		}
		return count;
	}

	
	private void displayMessage() {
		System.out.println("Congratulations for completing a workout! Let's get tracking.");
		System.out.println(TODAY_DAY);	
	}
	
	@SuppressWarnings("resource")
	private String getUserInput(String prompt) {
		System.out.print(prompt + " >>> ");
		return new Scanner(System.in).nextLine();
	}
}
