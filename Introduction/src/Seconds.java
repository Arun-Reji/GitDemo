import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Seconds {

	public static void main(String[] args) {
		        // Define the date format
		        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

		        // Parse the dates
		        LocalDateTime startDate = LocalDateTime.parse("2024-06-10 05:00:00", formatter);
		        LocalDateTime endDate = LocalDateTime.parse("2024-06-10 06:00:00", formatter);

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
