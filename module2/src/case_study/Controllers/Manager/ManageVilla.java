package case_study.Controllers.Manager;

import case_study.Commons.CheckValidate.Service.ValidateCheckService;
import case_study.Commons.ReadAndWrite.WriteAndReadService;
import case_study.Models.Villa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManageVilla {
    static Scanner  scanner = new Scanner(System.in);
    public static void addNewVilla(){
        List<Villa> list = new ArrayList<>();
        String id;
        do {
            System.out.println("Enter id of villa (format SVVL-XXXX): ");
            id = scanner.nextLine();
            if (ValidateCheckService.idVillaValid(id)){
                break;
            }
            System.err.println("Id villa invalid");
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
            System.out.println("Enter acreage of villa: ");
            acreage = Double.parseDouble(scanner.nextLine());
            if (acreage > 0){
                break;
            }
            System.err.println("Acreage invalid");
        }while (true);
        double cost;
        do {
            System.out.println("Enter cost of villa : ");
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
            System.out.println("Enter type of rent: ");
            rentalType = scanner.nextLine();
            if (ValidateCheckService.regexName(rentalType)){
                break;
            }
            System.err.println("Type of rent invalid");
        }while (true);
        String typeRoom;
        do {
            System.out.println("Enter type of villa: ");
            typeRoom = scanner.nextLine();
            if (ValidateCheckService.regexName(typeRoom)){
                break;
            }
            System.err.println("Type of villa invalid");
        }while (true);
        String equipment;
        do {
            System.out.println("Typing equipment of villa (massage|karaoke|food|drink|car): ");
            equipment = scanner.nextLine();
            if (ValidateCheckService.regexEquipment(equipment)){
                break;
            }
            System.err.println("Equipment invalid");
        }while (true);
        String acreagePool;
        do {
            System.out.println("Enter acreage of swing pool (bigger than 30m2): ");
            acreagePool = scanner.nextLine();
            if (ValidateCheckService.regexAcreage(acreagePool)){
                break;
            }
            System.err.println("acreage of swing pool invalid");
        }while (true);
        int floor;
        do {
            System.out.println("Enter floor (Integer and bigger than 0): ");
            floor = Integer.parseInt(scanner.nextLine());
            if (ValidateCheckService.regexFloor(floor)){
                break;
            }
            System.err.println("Floor invalid ");
        }while (true);
        Villa villa = new Villa(id, nameService, acreage, cost, numberPeople, rentalType, typeRoom, equipment, acreagePool, floor);
        list.add(villa);
        WriteAndReadService.serviceWriteFile(villa);
    }

    public static void showVilla(){
        List <Villa> villaList = WriteAndReadService.readVilla();
        for (int i=0; i<villaList.size(); i++) {
            System.out.println((1+i)+ ". "+ villaList.get(i).showInfor());
        }
    }
}
