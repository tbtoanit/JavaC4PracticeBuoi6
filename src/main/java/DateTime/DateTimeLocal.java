package DateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeLocal {
    public static void main(String[] args) {
        LocalDate lD = LocalDate.now();
        System.out.println(lD);

        LocalTime lT = LocalTime.now();
        System.out.println(lT);

        LocalDateTime lDT = LocalDateTime.now();
        System.out.println(lDT);

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Trước định dạng: " + myDateObj);
        DateTimeFormatter myFormatObj	= DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("Sau định dạng: " + formattedDate);

    }
}
