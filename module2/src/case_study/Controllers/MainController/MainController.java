package case_study.Controllers.MainController;

import case_study.Controllers.Manager.*;

import java.util.Scanner;

public class MainController {
    static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu(){
        boolean flag = true;
        while (flag){
            System.out.println("**** WELCOME TO FURAMA RESORT ****");
            System.out.println("1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tFind an Employee by ID\n" +
                    "8.\tCinema 4D\n" +
                    "9.\tExit\n " +
                    "Select option:\n");
            int chooseMenu = scanner.nextInt();
            switch (chooseMenu){
                case 1:
                    addNewService();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    ManageCustomer.addNewCustomer();
                    break;
                case 4:
                    ManageCustomer.showInformationCustomer();
                    break;
                case 5:
                    ManageBooking.addBooking();
                    break;
                case 6:
                    ManageEmployee.showEmployee();
                    break;
                case 7:
                    System.out.println("Enter employee's id");
                    String chooseFind = scanner.next();
                    ManageEmployee.findEmployee(chooseFind);
                    break;
                case 8:
                    Cinema.cinema4D();
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    System.out.println("Please select one option !!!");
                    break;
            }
        }
    }
    public static void addNewService(){
       boolean flag = true;
       while (flag){
           System.out.println("---- ADD NEW SERVICE ----");
           System.out.println("1.\tAdd New Villa\n" +
                   "2.\tAdd New House\n" +
                   "3.\tAdd New Room\n" +
                   "4.\tBack to menu\n" +
                   "5.\tExit\n" +
                   "Select service:\n");
           int chooseService = scanner.nextInt();
           switch (chooseService){
               case 1:
                   ManageVilla.addNewVilla();
                   break;
               case 2:
                   ManageHouse.addNewHouse();
                   break;
               case 3:
                   ManageRoom.addNewRoom();
                   break;
               case 4:
                   displayMainMenu();
                   break;
               case 5:
                   flag = false;
                   break;
               default:
                   System.out.println("Please select one option !!!");
                   break;
           }
       }
    }

    public static void showServices() {
        boolean flag = true;
        while (flag) {
            System.out.println("---- SHOW SERVICE ----");
            System.out.println("1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n" +
                    "Select option: \n");
            int chooseShow = scanner.nextInt();
            switch (chooseShow) {
                case 1:
                    ManageVilla.showVilla();
                    break;
                case 2:
                    ManageHouse.showHouse();
                    break;
                case 3:
                    ManageRoom.showRoom();
                    break;
                case 4:
                    ManageVilla.showAllServiceNotDuplicateVilla();
                    break;
                case 5:
                    ManageHouse.showAllServiceNotDuplicateHouse();
                    break;
                case 6:
                    ManageRoom.showAllServiceNotDuplicateRoom();
                    break;
                case 7:
                    displayMainMenu();
                    break;
                case 8:
                    flag = false;
                    break;
                default:
                    System.out.println("Please select one option !!!");
                    break;
            }
        }
    }
}
