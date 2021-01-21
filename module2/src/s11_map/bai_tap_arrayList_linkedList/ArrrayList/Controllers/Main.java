package s11_map.bai_tap_arrayList_linkedList.ArrrayList.Controllers;

import s11_map.bai_tap_arrayList_linkedList.ArrrayList.Models.Product;
import s11_map.bai_tap_arrayList_linkedList.ArrrayList.Service.Product.ProductManager;

import java.util.List;
import java.util.Scanner;

public class Main {
    private static ProductManager productManager = new ProductManager();
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("-------------Chuong trinh quan ly san pham------------");
        System.out.println("1. Them moi san pham");
        System.out.println("2. Danh sach moi san pham");
        System.out.println("3. Sua san pham");
        System.out.println("4. Xoa san pham");
        System.out.println("5. Tim kiem san pham theo ten");
        System.out.println("6. Sap xep san pham theo gia");
        System.out.println("Chon chuc nang ban muon thuc hien: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                createProduct();
                break;
            case 2:
                displayProduct();
                break;
            case 3:
                editProduct();
                break;
            case 4:
                removeProduct();
                break;
            case 5:
                showProductById();
                break;
            case 6:
                sortProduct();
                break;
            default:
                System.exit(0);
        }
    }

    private static void sortProduct() {
        productManager.sortById(true);

    }


    private static void showProductById(){
        System.out.println("Nhap id cua san pham muon edit");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println(productManager.findById(id));
    }

    private static void removeProduct(){
        System.out.println("Nhap id cua san pham muon edit");
        int id = Integer.parseInt(scanner.nextLine());
        productManager.remove(id);;
        List<Product> list = productManager.findAll();
        for (Product product : list) {
            System.out.println(product);
        }
    }

    private static void editProduct(){
        System.out.println("Nhap id cua san pham muon edit");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham");
        int price = Integer.parseInt(scanner.nextLine());
        productManager.edit(new Product(id,name, price), id);

        List<Product> list = productManager.findAll();
        for (Product product : list) {
            System.out.println(product);
        }
    }

    private static void createProduct() {
        System.out.println("Nhap id san pham");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap ten san pham");
        String name = scanner.nextLine();
        System.out.println("Nhap gia san pham");
        int price = Integer.parseInt(scanner.nextLine());
        productManager.save(new Product(id, name, price));
    }

    private static void displayProduct() {
        List<Product> list = productManager.findAll();
        for (Product product: list) {
            System.out.println(product);
        }
    }
}
