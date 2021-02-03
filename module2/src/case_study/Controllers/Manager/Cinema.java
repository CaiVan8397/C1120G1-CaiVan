package case_study.Controllers.Manager;

import case_study.Commons.ReadAndWrite.WriteAndReadCustomer;
import case_study.Models.Customer;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Cinema {
    public static void cinema4D(){
        List<Customer> listCustomer = WriteAndReadCustomer.customerRead();
        Queue<Customer> customerQueue = new LinkedList<>();
        customerQueue.addAll(listCustomer);
        System.out.println("List of seat cinema: ");
        int count =1;
        for (Customer list : customerQueue){
            System.out.println("Seat "+ count++ + ": "  + list.getCustomerName());
        }
    }
}
