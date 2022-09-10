import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class getDateTime {

        public static Date makeDate(String input) {
            DateFormat formatter = new SimpleDateFormat("dd-M-yyyy");
            Date date;
            try {
                date = formatter.parse(input);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            return date;
        }

        public static boolean canMakeDate(String input){
            DateFormat formatter = new SimpleDateFormat("dd-M-yyyy");
            try
            {
                Date date = formatter.parse(input);
                return true;
            } catch (ParseException e) {
                return false;
            }

        }
}

