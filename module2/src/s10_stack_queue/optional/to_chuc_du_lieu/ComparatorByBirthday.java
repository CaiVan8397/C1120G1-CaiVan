package s10_stack_queue.optional.to_chuc_du_lieu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

public class ComparatorByBirthday implements Comparator <DanhSach> {
    @Override
    public int compare(DanhSach o1, DanhSach o2) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1= null;
        Date date2= null;
        try {
            date1 = simpleDateFormat.parse(o1.getBirthday());
            date2 = simpleDateFormat.parse(o2.getBirthday());
            return date1.compareTo(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
