package s16_IO_binaryFile_serialization.bai_tap_manageProduct;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    private static List<Product> productList = new ArrayList<>();
    private static final String PATH_FILE = "src/s16_IO_binaryFile_serialization/bai_tap_manageProduct/ListProduct";
    private static void writeToDatabase() throws IOException {
        File file = new File(PATH_FILE);
        FileOutputStream fileOutput = new FileOutputStream(file);
        ObjectOutputStream output = null;
        try {
            output = new ObjectOutputStream(fileOutput);
            for(Product product : productList){
                output.writeObject(product.toString());
            }

        } catch (Exception e){
            System.out.println("Error" + e);
        } finally {
            output.flush();
            output.close();
        }
    }
}
