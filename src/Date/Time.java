package Date;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;

public class Time {
	public static void main(String[] args) {
//		Date date = new Date();
//		Timestamp time = new Timestamp(date.getTime());
//		Date date1 = new Date(time.getTime());
//		System.out.println(time);
//		System.out.println(date);
//		System.out.println(date1);
		
		Calendar c = Calendar.getInstance();
		c.setTime(new Date());
		
		int a = c.get(Calendar.YEAR);
		int b = c.get(Calendar.MONTH);
		int c1 = c.get(Calendar.DATE);
		int d = c.get(Calendar.AM_PM);
		int e = c.get(Calendar.DAY_OF_WEEK);
		
		System.out.println(a+"," +b +"," +c1 +","+d +"," +e);
		System.out.println(new Date().getTime());
		
		c.setTimeInMillis(1473772328990L);
		Date da = c.getTime();
		System.out.println(da);
	}
	

}
