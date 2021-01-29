package case_study.Controllers;

import case_study.Commons.WriteAndRead;
import case_study.Models.House;
import case_study.Models.Room;
import case_study.Models.Villa;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainController {
    static Scanner scanner = new Scanner(System.in);
    public static void displayMainMenu(){
        boolean flag = true;
        while (flag){
            System.out.println("Select option:\n"+
                    "1.\tAdd New Services\n" +
                    "2.\tShow Services\n" +
                    "3.\tAdd New Customer\n" +
                    "4.\tShow Information of Customer\n" +
                    "5.\tAdd New Booking\n" +
                    "6.\tShow Information of Employee\n" +
                    "7.\tExit\n ");
            int chooseMenu = Integer.parseInt(scanner.nextLine());
            switch (chooseMenu){
                case 1:
                    addNewService();
                    break;
                case 2:
                    showServices();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
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
           System.out.println("Select service:\n" +
                   "1.\tAdd New Villa\n" +
                   "2.\tAdd New House\n" +
                   "3.\tAdd New Room\n" +
                   "4.\tBack to menu\n" +
                   "5.\tExit\n");
           int chooseService = Integer.parseInt(scanner.nextLine());
           switch (chooseService){
               case 1:
                   addNewVilla();
                   break;
               case 2:
                   addNewHouse();
                   break;
               case 3:
                   addNewRoom();
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

    public static void showServices(){
        boolean flag = true;
        while (flag) {
            System.out.println("Select option: \n" +
                    "1.\tShow all Villa\n" +
                    "2.\tShow all House\n" +
                    "3.\tShow all Room\n" +
                    "4.\tShow All Name Villa Not Duplicate\n" +
                    "5.\tShow All Name House Not Duplicate\n" +
                    "6.\tShow All Name Name Not Duplicate\n" +
                    "7.\tBack to menu\n" +
                    "8.\tExit\n");
            int chooseShow = Integer.parseInt(scanner.nextLine());
            switch (chooseShow) {
                case 1:
                    showVilla();
                    break;
                case 2:
                    showHouse();
                    break;
                case 3:
                    showRoom();
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
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

    public static void addNewVilla(){
        List<Villa> list = new ArrayList<>();
        System.out.println("Typing id of villa");
        String id = scanner.nextLine();
        System.out.println("Typing name service: ");
        String nameService = scanner.nextLine();
        System.out.println("Typing acreage of villa: ");
        double acreage = Double.parseDouble(scanner.nextLine());
        System.out.println("Cost of villa per day: ");
        double cost = Double.parseDouble(scanner.nextLine());
        System.out.println("Typing number people");
        int numberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Typing type of rent: ");
        String rentalType = scanner.nextLine();
        System.out.println("Typing type of house: ");
        String  typeRoom = scanner.nextLine();
        System.out.println("Typing equipment of villa: ");
        String equipment = scanner.nextLine();
        System.out.println("Typing acreage of swing pool: ");
        String acreagePool = scanner.nextLine();
        System.out.println("Typing floor: ");
        int floor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(id, nameService, acreage, cost, numberPeople, rentalType, typeRoom, equipment, acreagePool, floor);
        list.add(villa);
        WriteAndRead.serviceWriteFile(villa);
    }

    public static void addNewHouse(){
        List<House> list = new ArrayList<>();
        System.out.println("Typing id of villa");
        String id = scanner.nextLine();
        System.out.println("Typing name house: ");
        String nameService = scanner.nextLine();
        System.out.println("Typing acreage of house: ");
        double acreage = Double.parseDouble(scanner.nextLine());
        System.out.println("Cost of villa per day: ");
        double cost = Double.parseDouble(scanner.nextLine());
        System.out.println("Typing number people");
        int numberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Typing type of rent: ");
        String rentalType = scanner.nextLine();
        System.out.println("Typing type of house: ");
        String  typeRoom = scanner.nextLine();
        System.out.println("Typing equipment of house ");
        String equipment = scanner.nextLine();
        System.out.println("Typing floor: ");
        int floor = Integer.parseInt(scanner.nextLine());
        House house = new House(id, nameService, acreage, cost, numberPeople, rentalType, typeRoom, equipment, floor);
        list.add(house);
        WriteAndRead.serviceWriteFile(house);
    }

    public static void addNewRoom(){
        List<Room> list = new ArrayList<>();
        System.out.println("Typing id of villa");
        String id = scanner.nextLine();
        System.out.println("Typing name house: ");
        String nameService = scanner.nextLine();
        System.out.println("Typing acreage of house: ");
        double acreage = Double.parseDouble(scanner.nextLine());
        System.out.println("Cost of villa per day: ");
        double cost = Double.parseDouble(scanner.nextLine());
        System.out.println("Typing number people");
        int numberPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Typing type of rent: ");
        String rentalType = scanner.nextLine();
        System.out.println("Typing free service");
        String freeService = scanner.nextLine();
        int floor = Integer.parseInt(scanner.nextLine());
        Room room = new Room(id, nameService, acreage, cost, numberPeople, rentalType, freeService);
        list.add(room);
        WriteAndRead.serviceWriteFile(room);
    }

    public static void showVilla(){
        List <Villa> villaList = WriteAndRead.readVilla();
        for (int i=0; i<villaList.size(); i++) {
            System.out.println((1+i)+ ". "+ villaList.get(i).showInfor());
        }
    }

    public static void showHouse(){
        List <House> list = WriteAndRead.readHouse();
        for (int i=0; i<list.size(); i++) {
            System.out.println((1+i)+ ". "+ list.get(i).showInfor());
        }
    }

    public static void showRoom(){
        List <Room> list = WriteAndRead.readRoom();
        for (int i=0; i<list.size(); i++) {
            System.out.println((1+i)+ ". "+ list.get(i).showInfor());
        }
    }
}
