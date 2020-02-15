package How_long_you_live;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Life {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formatter1 = new SimpleDateFormat("dd MM yyyy");
        DecimalFormat formatter2 = new DecimalFormat("#,###,###,000");
        Date date = new Date();
        Scanner scanner = new Scanner(System.in);
        String currentDate = formatter1.format(date);

        System.out.println("\nCurrent data: " + currentDate);

        System.out.println("Enter your date of birth: (dd mm yyyy)");
        String line = scanner.nextLine();

        Date date1 = formatter1.parse(currentDate);
        Date date2 = formatter1.parse(line);

        long result = date1.getTime() - date2.getTime();

        long days = TimeUnit.DAYS.convert(result, TimeUnit.MILLISECONDS);
        System.out.println("You live since " + days + " days");
        long hours = TimeUnit.HOURS.convert(result, TimeUnit.MILLISECONDS);
        System.out.println("\t\t\t = " + formatter2.format(hours) + " hours");
        long seconds = TimeUnit.SECONDS.convert(result, TimeUnit.MILLISECONDS);
        System.out.println("\t\t\t = " + formatter2.format(seconds) + " seconds");

        main(null);
    }
}
