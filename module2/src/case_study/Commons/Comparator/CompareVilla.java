package case_study.Commons.Comparator;

import case_study.Models.Villa;

import java.util.Comparator;

public class CompareVilla implements Comparator <Villa> {
    @Override
    public int compare(Villa o1, Villa o2) {
        return o1.getServiceName().compareTo(o2.getServiceName());
    }
}
