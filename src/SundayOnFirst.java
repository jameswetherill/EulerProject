
import java.text.DateFormatSymbols;

import java.util.Calendar;

public class SundayOnFirst {

	public static void main(String[] args) {

		int startYear = 1901;

		int endYear = 2000;

		int totalSundayFound = 0;

		/**
		 * 
		 * Gets weekday strings. For example: "Sunday", "Monday", etc.
		 */

		String[] weekdays = new DateFormatSymbols().getWeekdays();

		for (; startYear <= endYear; startYear++) {

			for (int i = 0; i < 12; i++) {

				Calendar calendar = Calendar.getInstance();

				calendar.set(startYear, i, 1);

				if (weekdays[calendar.get(Calendar.DAY_OF_WEEK)].equalsIgnoreCase("sunday")) {

					System.out.println(calendar.getTime());

					totalSundayFound++;

				}

			}

		}

		System.out.println("Total Sundays Fell on the 1st: " + totalSundayFound);

	}

}