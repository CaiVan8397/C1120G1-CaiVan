package s11_map.bai_tap_arrayList_linkedList.ArrrayList.Service.Product;

import s11_map.bai_tap_arrayList_linkedList.ArrrayList.ComparatorAscending;
import s11_map.bai_tap_arrayList_linkedList.ArrrayList.ComparatorDecrease;
import s11_map.bai_tap_arrayList_linkedList.ArrrayList.Models.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductManager implements ProductService {
    private static List<Product> listProduct;

    static {
        listProduct = new ArrayList<>();
        listProduct.add(new Product(1, "Iphone 10", 600));
        listProduct.add(new Product(2, "Iphone 11", 700));
        listProduct.add(new Product(3, "Iphone 12", 800));
        listProduct.add(new Product(4, "SamSung Note 10", 800));
        listProduct.add(new Product(5, "SamSung Note 11", 1000));
    } // static block

    @Override
    public List<Product> findAll() {
        return listProduct;
    }

    @Override
    public Product findById(int id) {
        for (Product product1: listProduct) {
            if (id == product1.getId()) {
                return product1;
            }
        }
        return null;
    }

    @Override
    public void save(Product product) {
        listProduct.add(product);
    }

    @Override
    public void edit(Product product, int id) {
        for (Product product1: listProduct) {
            if (id == product1.getId()){
                product1.setName(product.getName());
                product1.setPrice(product.getPrice());
            }
        }
    }

    @Override
    public void remove(int id) {
        listProduct.removeIf(product1 -> id == product1.getId());
    }

    @Override
    public List<Product> sortById(boolean choose) {
        if (choose){
            Collections.sort(listProduct, new ComparatorAscending());
        } else {
            Collections.sort(listProduct, new ComparatorDecrease());
        }
        return listProduct;
    }

}
