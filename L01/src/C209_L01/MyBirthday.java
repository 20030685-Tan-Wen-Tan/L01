/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20030685, 21 Apr 2021 11:32:29
 */

package C209_L01;

import java.time.LocalDate;

public class MyBirthday {
	
	public static void main(String[] args) {
	
	LocalDate birthDate = LocalDate.of(2001, 4, 9);
	
	System.out.println("I was born in " + birthDate.getYear());
	System.out.println("The month that I was born in was: " + birthDate.getMonth());
	System.out.println("The day I was born in was: " + birthDate.getDayOfWeek());
	
	}
}