import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;


public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    LocalDate today=LocalDate.now();//todays date
    System.out.println("today ="+today);
    
    LocalDate date=LocalDate.of(2019,Month.AUGUST,15);//to create date
    System.out.println("date = "+date);
    
    LocalTime time=LocalTime.now();//current time
    System.out.println("Time = "+time);
    
    LocalDateTime dTime=LocalDateTime.now();//current date and time
    System.out.println("Date and Time = "+dTime);
    
    ZonedDateTime zDate = ZonedDateTime.now();
    System.out.println("zDate  = "+zDate);
    
    ZonedDateTime datezone=ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("Europe/Paris") );
    System.out.println("datezone = "+datezone);
    
    Period diff=today.until(date);
   System.out.println("diff ="+diff.getDays()+" days"+diff.getMonths()+" months "+diff.getYears()+" years");
	
   Calendar cal = Calendar.getInstance();
   cal.add(Calendar.DATE, 14);
   System.out.println("date after `14 days : " + getDate(cal));
   

	}

	public static String getDate(Calendar cal){
	       return "" + cal.get(Calendar.DATE) +"/" +
	               (cal.get(Calendar.MONTH)+1) + "/" + cal.get(Calendar.YEAR);
	   }

}
