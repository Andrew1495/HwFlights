import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
public class getDateTime {


        public static Date makeDate(String input) {
            DateFormat formatter = new SimpleDateFormat("dd-M-yyyy HH-mm-ss");
            Date date;
            int hourNum = ThreadLocalRandom.current().nextInt(00, 24 + 1);
            if(hourNum < 10 ){
                String hour = "0" + hourNum+"-";
            }
            String hour = hourNum+"-";
            int minNum = ThreadLocalRandom.current().nextInt(00, 60 + 1);
            if(minNum < 10 ){
                String min = "0" + minNum+"-";
            }
            String min = minNum+"-";
            try {
                date = formatter.parse( input + " " + hour + min + "00");
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

