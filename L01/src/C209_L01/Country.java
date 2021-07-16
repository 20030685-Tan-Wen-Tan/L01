/**
 * I declare that this code was written by me.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20030685, 21 Apr 2021 12:19:17
 */

package C209_L01;

public class Country {

	String name;
	double averageYearlyTempC;
	String thingsToDo;

	public Country(String name, double averageYearlyTempC, String thingsToDo) {
		super();
		this.name = name;
		this.averageYearlyTempC = averageYearlyTempC;
		this.thingsToDo = thingsToDo;
	}

	public void display() {
		System.out.println(name);
		System.out.println(averageYearlyTempC);
		System.out.println(thingsToDo);

	}

}
