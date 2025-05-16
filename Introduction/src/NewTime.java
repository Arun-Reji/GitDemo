import java.time.Duration;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
public class NewTime {
	
	public static void main(String[] args) {
		
		        // Define the date format
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

		        // Parse the dates
		        ZonedDateTime startDate = ZonedDateTime.parse("2024-09-24T07:29:00.000-0500", formatter);
		        ZonedDateTime endDate = ZonedDateTime.parse("2024-09-25T13:25:00.000-0500", formatter);

		        // Calculate the duration between the two dates
		        Duration duration = Duration.between(startDate, endDate);

		        // Get the total seconds
		        long seconds = duration.getSeconds();
		        double hours = duration.toMillis() / (1000.0 * 60 * 60);

		        // Print the result
		        System.out.println("Seconds between the two dates: " + seconds+ " sec");
		        System.out.println("In hr: "+hours+" hr");
	}

}
