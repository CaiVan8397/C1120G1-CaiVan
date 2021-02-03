package case_study.Commons.ReadAndWrite;

import case_study.Models.House;
import case_study.Models.Room;
import case_study.Models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndReadService {
    static final String VILLA_PATH = "src/case_study/Data/Villa.csv";
    static final String HOUSE_PATH = "src/case_study/Data/House.csv";
    static final String ROOM_PATH = "src/case_study/Data/Room.csv";

    public static void serviceWriteFile(Object service) {
        if (service instanceof Villa) {
            checkFile( VILLA_PATH, service );
        } else if (service instanceof House) {
            checkFile( HOUSE_PATH, service );
        } else if (service instanceof Room) {
            checkFile( ROOM_PATH, service );
        }
    }

    public static void checkFile(String file, Object service) {
        try {
            FileWriter fileWriter = new FileWriter( file, true );
            BufferedWriter bufferedWriter = new BufferedWriter( fileWriter );
            bufferedWriter.newLine();
            bufferedWriter.write(service.toString());
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static List<Villa> readVilla(){
        List<Villa> villaList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader( "src/case_study/Data/Villa.csv" );
            BufferedReader bufferedReader = new BufferedReader( fileReader );
            String line;
            String[] arrayFile;
            while ((line = bufferedReader.readLine()) != null) {
                arrayFile = line.split( "," );
                Villa villa = new Villa( arrayFile[0], arrayFile[1], Double.parseDouble(arrayFile[2]),
                        Double.parseDouble(arrayFile[3]), Integer.parseInt(arrayFile[4]), arrayFile[5],
                        arrayFile[6], arrayFile[7], arrayFile[8], Integer.parseInt(arrayFile[9]));
                villaList.add(villa);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }

    public static List<House> readHouse() {
        List<House> houseList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader( "src/case_study/Data/House.csv" );
            BufferedReader bufferedReader = new BufferedReader( fileReader );
            String line;
            String[] arrayFile;
            while ((line = bufferedReader.readLine()) != null) {
                arrayFile = line.split( "," );
                House house = new House( arrayFile[0], arrayFile[1], Double.parseDouble(arrayFile[2]),
                        Double.parseDouble(arrayFile[3]), Integer.parseInt(arrayFile[4]), arrayFile[5],
                        arrayFile[6], arrayFile[7], Integer.parseInt(arrayFile[8]));
                houseList.add(house);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }

    public static List<Room> readRoom() {
        List<Room> roomList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader( "src/case_study/Data/Room.csv" );
            BufferedReader bufferedReader = new BufferedReader( fileReader );
            String line;
            String[] arrayFile;
            while ((line = bufferedReader.readLine()) != null) {
                arrayFile = line.split( "," );
                Room room = new Room(arrayFile[0], arrayFile[1], Double.parseDouble(arrayFile[2]),
                        Double.parseDouble(arrayFile[3]), Integer.parseInt(arrayFile[4]), arrayFile[5], arrayFile[6]);
                roomList.add(room);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }

}
