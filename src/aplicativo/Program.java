package application;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
public class Program {

	public static void main(String[] args) {
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss"); 
		Date d = Date.from(Instant.parse("2021-09-22T15:42:07Z"));
		
		System.out.println(sdf.format(d));
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		//cal.add(Calendar.HOUR_OF_DAY, 4);
		//d = cal.getTime();
		
		int minutes = cal.get(Calendar.MINUTE);
		int month = 1+cal.get(Calendar.MONTH);
		
		System.out.println("Minutos: "+minutes);
		System.out.println("M�s: "+month);
	}

}
