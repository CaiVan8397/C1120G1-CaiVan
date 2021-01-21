package s11_map.bai_tap_arrayList_linkedList.ArrrayList.Service.CRUDInterface;

import java.util.List;

public interface CRUDService<T> {
    List<T> findAll(); // kiểu dữ liệu trả về là 1 dsach có kiểu dữ liệu là T
    T findById(int id);
    void save(T t); // truyền 1 đối tượng t có kiểu dữ liệu T
    void edit(T t, int id);
    void remove(int id);
}
