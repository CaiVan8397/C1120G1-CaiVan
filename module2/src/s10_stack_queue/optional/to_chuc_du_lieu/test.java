package s10_stack_queue.optional.to_chuc_du_lieu;

import java.util.*;

public class test {
    public static void main(String[] args) {
        List<DanhSach> danhSach = new ArrayList<>();
       danhSach.add(new DanhSach("nam", 01, true, "01/02/1997"));
       danhSach.add( new DanhSach("Ngọc", 02, false, "11/02/1997"));
        danhSach.add(new DanhSach("Nhung", 03, false, "13/08/1997"));
        danhSach.add(new DanhSach("HƯng", 04, true, "02/05/1997"));
        danhSach.add(new DanhSach("Vy", 05, false, "21/09/1997"));
        danhSach.add( new DanhSach("Thảo", 06, false, "25/10/1997"));
        Queue <DanhSach> nu = new PriorityQueue<>();
        Queue <DanhSach> nam = new PriorityQueue<>();

        System.out.println(" trước khi sx");
        for (DanhSach ds: danhSach) {
            System.out.println(ds.toString());
        }

//        Collections.sort(danhSach, new ComparatorByBirthday());
//        System.out.println(" sau  khi sx theo tên và tuổi");
//        for (int i=0; i<danhSach.size(); i++){
//            System.out.println(danhSach.get(i));
//        }

        for (DanhSach ds : danhSach) {
            if (ds.isGender()=="Nam") {
                nam.add(ds);
            } else {
                nu.add(ds);
            }
        }

        ArrayList<DanhSach> danhSaches= new ArrayList<>();
        danhSaches.addAll(nu);
        danhSaches.addAll(nam);
        System.out.println(" sau sx");
        for (DanhSach ds: danhSaches) {
            System.out.println(ds.toString());
        }

    }
}
