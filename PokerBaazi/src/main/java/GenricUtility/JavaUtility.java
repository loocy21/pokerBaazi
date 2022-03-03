package GenricUtility;

import java.util.Date;
import java.util.Random;

public class JavaUtility {
		/* Description: generate random number to avoid duplicate
		 * @return random number
		 * */
		public static String getRandomDate() {
			Random random = new Random();
			int ran = random.nextInt(1000);
			return ""+ran;
			
		}
		/* Description: used to generate current date 
		 * @return currentDate
		 * */
		public static String getCurrentDate() {
			Date date = new Date();
			String currentdate = date.toString();
			return currentdate;
			
		}

}
