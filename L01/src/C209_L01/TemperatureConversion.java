package C209_L01;

/**
 * I declare that this code was written by me. I will not copy or allow others
 * to copy my code. I understand that copying code is considered as plagiarism.
 *
 * tanwentan, 21 Apr 2021 10:09:50 am
 */

public class TemperatureConversion {

	public static void main(String[] args) {

		int option = 0;
		double celsius = 0.0;
		double fahrenheit = 0.0;
		String msg = null;

		while (option != 3) {

			System.out.println("------------------------------");
			System.out.println("TEMPERATURE CONVERSION");
			System.out.println("------------------------------");
			System.out.println("1. Convert Celsius to Fahrenheit");
			System.out.println("2. Convert Fahrenheit to Celsius");
			System.out.println("3. Quit");

			option = Helper.readInt("Enter an option > ");

			if (option == 1) {

				celsius = Helper.readDouble("Enter a temperature in celsius > ");
				fahrenheit = (celsius * 1.8) + 32;
				msg = String.format("%.2f", celsius) + " degrees Celsius is " + String.format("%.2f", fahrenheit)
						+ " degrees Fahrenheit.";

				System.out.println(msg);

			} else if (option == 2) {

				fahrenheit = Helper.readDouble("Enter a temperature in fahrenheit > ");
				celsius = (fahrenheit - 32) / 1.8;
				msg = String.format("%.2f", fahrenheit) + " degrees Fahrenheit is " + String.format("%.2f", celsius)
						+ " degrees Celsius.";

				System.out.println(msg);

			} else if (option == 3) {

				msg = "Good bye!";
				System.out.println(msg);

			} else {

				msg = "Invalid option entered!";
				System.out.println(msg);

			}

		}
	}
}