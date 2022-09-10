import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class getDateTime {

        public static Date makeDate() {
            Date date = new Date();
            Calendar cal = Calendar.getInstance();
            cal.setTime(date);
            cal.add(Calendar.DATE, 7);
            date = cal.getTime();
            return date;
        }
}

