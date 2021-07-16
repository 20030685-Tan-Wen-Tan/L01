/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20030685, 21 Apr 2021 15:13:20
 */

package C209_L01;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class FirstSchDay {

	public static void main(String[] args) {

		LocalDateTime firstDayOfSch = LocalDateTime.of(2019, 4, 15, 9, 15);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE MMMM yyyy, hhmm a");

		System.out.println("The first day of school is on " + firstDayOfSch.format(formatter));

	}

}
