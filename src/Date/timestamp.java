package Date;

import java.awt.font.FontRenderContext;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class timestamp {
	
	public static void main(String[] args) {
		
		
		Timestamp time = new Timestamp(System.currentTimeMillis());
		long t1 = time.getTime();
		System.out.println(time);
		System.out.println(t1);
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		long l = 1473256141;
		Date date =  new Date(l*1000);
		Timestamp time1 = new Timestamp(l*1000);
		String str = sdf.format(date);
		
		System.out.println(str);
		System.out.println(date);
		System.out.println(time1);
		
	}

}
