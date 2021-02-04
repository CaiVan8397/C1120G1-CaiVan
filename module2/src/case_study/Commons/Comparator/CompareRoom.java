package case_study.Commons.Comparator;

import case_study.Models.Room;

import java.util.Comparator;

public class CompareRoom implements Comparator <Room> {
    @Override
    public int compare(Room o1, Room o2) {
        return o1.getServiceName().compareTo(o2.getServiceName());
    }
}
