import java.sql.Time;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;

public class practiceSet15 {
    public static void main(String[] args) {
        // Question 1
        ArrayList arrayList = new ArrayList();
        arrayList.add(15);
        arrayList.add(17);
        arrayList.add(20);
        arrayList.add(8);
        arrayList.add(17);
        arrayList.add(16);
        arrayList.add(13);
        arrayList.add(10);
        arrayList.add(19);
        for (Object o: arrayList
             ) {
            System.out.println(o);
            
        }
        //Question 2
        Date date = new Date();
        System.out.println(date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds());
        //Question 3
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND));
        // Question 4
        LocalDateTime dt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("k:m:s");
        String myDate = dt.format(df);
        System.out.println(myDate);
        // Question 5
        HashSet<Integer> hs = new HashSet();
        hs.add(5);
        hs.add(65);
        hs.add(54);
        hs.add(5);
        System.out.println(hs);




    }
}
