package C209_L01;

import java.time.LocalTime;
import java.util.ArrayList;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * tanwentan, 6 Apr 2017 9:26:54 pm
 */

public class WhereToGo {
	public static void main(String[] args) {

		ArrayList<Country> countryList = new ArrayList<Country>();
		countryList.add(new Country("Thailand", 26.30, "Food, Massage, Shopping "));
		countryList.add(new Country("Singapore", 26.45, "Food, Shopping"));
		countryList.add(new Country("France", 10.70, "Skiing, Sight Seeing"));
		countryList.add(new Country("Iceland", 1.75, "Hot Spring, Aurora"));
		countryList.add(new Country("Japan", 11.15, "Food, Mount Fuji"));

	}

	// Refer to the sample flow and write code to match the requirements.
	// Hint: Refer to section F of your worksheet.

	public static void menu() {
		// Write code to display current date and menu here
		LocalTime currentTime = LocalTime.now();
		System.out.println("------------------------------");
		System.out.println("Time: " + currentTime);
		System.out.println("WHERE TO GO?");
		System.out.println("------------------------------");
		System.out.println("1. Warmer countries");
		System.out.println("2. Cooler countries");
		System.out.println("3. Search for recommendations by activity");
		System.out.println("4. Quit");
	}

	public static void countriesByTemp(ArrayList<Country> countryList, int choice) {
		// Write code here to display warm or cold countries depending on the choice by
		// the user.

		if (choice == 1) {

			for (int i = 0; i < countryList.size(); i++) {
				if (countryList.get(i).averageYearlyTempC > 25) {
					System.out.println(countryList.get(i));
				}
			}

		} else if (choice == 2) {
			
			for (int i = 0; i < countryList.size(); i++) {
				if (countryList.get(i).averageYearlyTempC <= 25) {
					System.out.println(countryList.get(i));
				}
			}
			
		}
	}

	public static void searchString(ArrayList<Country> countryList) {
		// Write code here to prompt user to enter an activity
		// and display countries that have that activity.
		String keywords = Helper.readString("Enter keywords: ");
		
		for (int i = 0; i < countryList.size(); i++) {
			if (countryList.get(i).thingsToDo.contains(keywords)) {
				System.out.println(countryList.get(i));
			}
		}
		
	}
}
