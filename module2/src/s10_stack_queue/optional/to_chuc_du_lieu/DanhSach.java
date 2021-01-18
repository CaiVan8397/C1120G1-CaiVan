package s10_stack_queue.optional.to_chuc_du_lieu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DanhSach implements Comparable<DanhSach>{
    private String name;
    private int id;
    private boolean gender;
    private String birthday;

    public DanhSach() {
    }

    public DanhSach(String name, int id, boolean gender, String birthday) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String isGender() {
        String gen ="";
        if (gender){
            gen = "Nam";
        } else {
            gen = "Nữ";
        }
        return gen;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name: " + name +
                " , id: " + id +
                " , gende: " + isGender() +
                " , birthday: " + birthday + '}';
    }

    @Override
    public int compareTo(DanhSach o) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1= null;
        Date date2= null;
        try {
            date1 = simpleDateFormat.parse(this.getBirthday());
            date2 = simpleDateFormat.parse(o.getBirthday());
            return date1.compareTo(date2);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
