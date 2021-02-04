package case_study.Controllers.Manager;

import case_study.Commons.CheckValidate.Customer.ValidateCheckCustomer;
import case_study.Commons.Comparator.CustomerSort;
import case_study.Commons.Exception.*;
import case_study.Commons.ReadAndWrite.WriteAndReadCustomer;
import case_study.Models.Customer;
import java.util.*;

public class ManageCustomer {
    static Scanner scanner = new Scanner(System.in);
    public static void addNewCustomer() {
        List<Customer> customerList = new ArrayList<>();
        String nameCustomer;
        String birthDayCustomer;
        String genderCustomer;
        String cardIdCustomer;
        String phoneNumber;
        String email;
        String typeCustomer;
        String address;
        do {
            try {
                System.out.println( "Enter Name Customer (capitalize first letter): " );
                nameCustomer = scanner.nextLine();
                if (ValidateCheckCustomer.regexName( nameCustomer )) {
                    break;
                }
                throw new NameException( "Client name invalid" );
            } catch (NameException e) {
                System.err.println( e.getMessage() );
            }
        } while (true);
        do {
            try {
                System.out.println( "Enter birth day customer(format 'dd/mm/yyyy'): " );
                birthDayCustomer = scanner.nextLine();
                if (ValidateCheckCustomer.regexBirthDay( birthDayCustomer )) {
                    break;
                }
                throw new BirthDayException( "The birth year must be > 1900 and 18 years" +
                        " younger than the current year correct format dd / mm / yyyy.." );
            } catch (BirthDayException e) {
                System.err.println( e.getMessage() );
            }
        } while (true);
        do {

            try {
                System.out.println( "Enter Gender Customer(Male/Female/Unknown): " );
                genderCustomer = scanner.nextLine();
                if (ValidateCheckCustomer.regexGenderCustomer( genderCustomer )) {
                    break;
                }
                throw new GenderException( "Gender must be Male, Female or Unknown" );
            } catch (GenderException e) {
                System.err.println( e.getMessage() );
            }


        } while (true);
        do {
            try {
                System.out.println( "Enter card id customer(format XXX XXX XXX): " );
                cardIdCustomer = scanner.nextLine();
                if (ValidateCheckCustomer.regexCardIdCustomer( cardIdCustomer )) {
                    break;
                }
                throw new CardIdException( "Id Card must be 9 digits and in the format XXX XXX XXX ." );
            } catch (CardIdException e) {
                System.err.println( e.getMessage() );
            }

        } while (true);
        do {
            System.out.println( "Enter phone number must be '0' and 9 number): " );
            phoneNumber = scanner.nextLine();
            if (ValidateCheckCustomer.regexPhoneNumber( phoneNumber )) {
                break;
            }
            System.err.println( "Phone number invalid" );
        } while (true);
        do {
            try {
                System.out.println( "Enter email customer (abc@abc.abc): " );
                email = scanner.nextLine();
                if (ValidateCheckCustomer.regexEmailCustomer( email )) {
                    break;
                }
                throw new EmailException( "Email must be in abc@abc.abc format" );
            } catch (EmailException e) {
                System.err.println( e.getMessage() );
            }
        } while (true);
        do {
            System.out.println("Customer type (Diamond|Platinum|Gold|Silver|Member): ");
            typeCustomer = scanner.nextLine();
            if (ValidateCheckCustomer.regexTypeOfCustomer( typeCustomer )) {
                break;
            }
            System.err.println( "Type of customer invalid" );

        } while (true);
        do {
            System.out.println( "Enter address customer (capitalize first letter):" );
            address = scanner.nextLine();
            if (ValidateCheckCustomer.regexAddress( address )) {
                break;
            }
            System.err.println( "Address customer invalid" );
        } while (true);

        System.out.println( "Added Successfully!" );
        Customer customer = new Customer( nameCustomer, birthDayCustomer, genderCustomer, cardIdCustomer, phoneNumber, email,
                typeCustomer, address );
        customerList.add( customer );
        WriteAndReadCustomer.customerWrite(customerList, true);
    }
    public static void showInformationCustomer() {
        List<Customer> customerList = WriteAndReadCustomer.customerRead();
        if (customerList.isEmpty()) {
            System.err.println("There is no data to display");
        } else {
            int count = 1;
            customerList.sort(new CustomerSort());
            for (Customer customer : customerList) {
                System.out.println(count++ + ". " + customer.showInfor());

            }
        }
    }
}
