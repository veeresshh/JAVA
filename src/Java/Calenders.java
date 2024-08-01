package Java;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Calenders {

	public static void main(String[] args) {

		Calendar CAL = Calendar.getInstance();

		SimpleDateFormat SDF = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
		System.out.println(SDF.format(CAL.getTime()));

		System.out.println(CAL.get(Calendar.DAY_OF_MONTH));

		System.out.println(CAL.get(Calendar.DAY_OF_WEEK_IN_MONTH));

		System.out.println(CAL.get(Calendar.WEEK_OF_MONTH));

		System.out.println(CAL.get(Calendar.AM_PM));

		System.out.println(CAL.get(Calendar.WEEK_OF_YEAR));

		System.out.println(CAL.get(Calendar.MINUTE));

	}

}
