package case_study.Commons.ReadAndWrite;

import case_study.Models.Booking;
import case_study.Models.Customer;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadCustomer {
    static final String PATH_CUSTOMER = "src/case_study/Data/Customer.csv";
    static File file = new File(PATH_CUSTOMER);
    public static void customerWrite(List<Customer> list, boolean option) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(file,option);
            bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : list) {
                bufferedWriter.write(customer.toString());
                bufferedWriter.newLine();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            }catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static List<Customer> customerRead() {
        List<Customer> listCustomer = new ArrayList<>();
        FileReader fileReader = null;
        BufferedReader bufferedReader = null;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            String line = "";
            String[] array;
            while ((line = bufferedReader.readLine()) != null) {
                array = line.split(",");
                Customer customer = new Customer(array[0], array[1], array[2], array[3], array[4], array[5], array[6], array[7] );
                listCustomer.add(customer);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return listCustomer;
    }
}
