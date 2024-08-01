package Java;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Dates {

	public static void main(String[] args) {

		Date D = new Date();
		System.out.println(D.toString());

		SimpleDateFormat SDF = new SimpleDateFormat("MM/dd/yyyy");
		System.out.println(SDF.format(D));

		SimpleDateFormat SD = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss aa");
		System.out.println(SD.format(D));

	}

}
