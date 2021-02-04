package case_study.Commons.Comparator;

import case_study.Models.House;

import java.util.Comparator;

public class CompareHouse implements Comparator <House> {
    @Override
    public int compare(House o1, House o2) {
        return o1.getServiceName().compareTo(o2.getServiceName());
    }
}
