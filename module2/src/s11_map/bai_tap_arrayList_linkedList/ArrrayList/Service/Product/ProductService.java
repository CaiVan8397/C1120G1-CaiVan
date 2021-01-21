package s11_map.bai_tap_arrayList_linkedList.ArrrayList.Service.Product;

import s11_map.bai_tap_arrayList_linkedList.ArrrayList.Models.Product;
import s11_map.bai_tap_arrayList_linkedList.ArrrayList.Service.CRUDInterface.CRUDService;

import java.util.List;

public interface ProductService extends CRUDService<Product> {
    List<Product> sortById(boolean choose);
}
