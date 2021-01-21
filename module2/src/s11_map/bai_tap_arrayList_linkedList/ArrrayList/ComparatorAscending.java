package s11_map.bai_tap_arrayList_linkedList.ArrrayList;

import s11_map.bai_tap_arrayList_linkedList.ArrrayList.Models.Product;

import java.util.Comparator;

public class ComparatorAscending implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if(o1.getPrice() < o2.getPrice()){
            return 1;
        }else if(o1.getPrice() == o2.getPrice()){
            return 0;
        }else{
            return -1;
        }
    }
}
