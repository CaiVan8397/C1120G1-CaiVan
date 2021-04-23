package case_study.Controllers.Manager;

import case_study.Commons.CheckValidate.Service.ValidateCheckService;
import case_study.Commons.Comparator.CompareRoom;
import case_study.Commons.Comparator.CompareVilla;
import case_study.Commons.ReadAndWrite.WriteAndReadService;
import case_study.Models.Room;
import case_study.Models.Room;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class ManageRoom {
    static Scanner scanner = new Scanner(System.in);
    public static void addNewRoom(){
        List<Room> list = new ArrayList<>();
        String id;
        do {
            System.out.println("Enter id of room (format SVRO-XXXX): ");
            id = scanner.nextLine();
            if (ValidateCheckService.idRoomValid(id)){
                break;
            }
            System.err.println("Id room invalid");
        } while (true);
        String nameService;
        do {
            System.out.println("Enter name service (capitalize first letter): ");
            nameService = scanner.nextLine();
            if (ValidateCheckService.regexName(nameService)){
                break;
            }
            System.err.println("Name service invalid");
        }while (true);
        double acreage;
        do {
            System.out.println("Enter acreage of room (Double number bigger than 0)");
            acreage = Double.parseDouble(scanner.nextLine());
            if (acreage > 0){
                break;
            }
            System.err.println("Acreage invalid");
        }while (true);
        double cost;
        do {
            System.out.println("Enter cost of room(Bigger than 0): ");
            cost = Double.parseDouble(scanner.nextLine());
            if (ValidateCheckService.feeValid(Double.parseDouble(String.valueOf(cost)))){
                break;
            }
            System.err.println("Fee invalid");
        }while (true);
        int numberPeople;
        do {
            System.out.println("Enter number people (bigger than 0 anh smaller than 20): ");
            numberPeople = Integer.parseInt(scanner.nextLine());
            if (ValidateCheckService.regexPeopleValid(String.valueOf(numberPeople))){
                break;
            }
            System.err.println("Number people invalid");
        }while (true);
        String rentalType;
        do {
            System.out.println("Enter type of rent (capitalize first letter): ");
            rentalType = scanner.nextLine();
            if (ValidateCheckService.regexName(rentalType)){
                break;
            }
            System.err.println("Type of rent invalid");
        }while (true);

        String freeService;
        do {
            System.out.println("Typing equipment: (massage|karaoke|food|drink|car): ");
            freeService = scanner.nextLine();
            if (ValidateCheckService.regexEquipment(freeService)){
                break;
            }
            System.err.println("Equipment invalid");
        }while (true);

        Room room = new Room(id, nameService, acreage, cost, numberPeople, rentalType, freeService);
        list.add(room);
        WriteAndReadService.serviceWriteFile(room);
    }


    public static void showRoom(){
        List <Room> list = WriteAndReadService.readRoom();
        if (list.size() !=0) {
            for (int i = 0; i < list.size(); i++) {
                System.out.println((1 + i) + ". " + list.get(i).showInfor());
            }
        }else {
            System.err.println("List room is empty, please add new room service!!!");
        }
    }
    public static TreeSet<Room> findAllNotDuplicateNameRoom(){
        List <Room> roomList = WriteAndReadService.readRoom();
        TreeSet<Room> roomTreeSet = new TreeSet <>(new CompareRoom());
        roomTreeSet.addAll(roomList);
        return roomTreeSet;
    }
    public static void showAllServiceNotDuplicateRoom(){
        TreeSet<Room> roomTreeSet = findAllNotDuplicateNameRoom();
        for (Room room : roomTreeSet) {
            System.out.println(room.getServiceName());
        }
    }
}
