package case_study.Commons;

import case_study.Models.House;
import case_study.Models.Room;
import case_study.Models.Villa;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class test {
    final String VILLA_PATH = "src/data/Villa.csv";
    final String HOUSE_PATH = "src/data/House.csv";
    final String ROOM_PATH = "src/data/Room.csv";

    public List<Villa> dataVilla() {
        List<Villa> villaList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader( "src/data/Villa.csv" );
            BufferedReader bufferedReader = new BufferedReader( fileReader );
            String line;
            String[] arrayFile;
            while ((line = bufferedReader.readLine()) != null) {
                arrayFile = line.split( ", " );
//                Villa villa = new Villa( arrayFile[0], arrayFile[1], arrayFile[2], arrayFile[3], arrayFile[4], arrayFile[5],
//                        arrayFile[6], arrayFile[7], arrayFile[8], arrayFile[9] );
//                villaList.add( villa );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return villaList;
    }

    public List<Room> dataRoom() {
        List<Room> roomList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader( "src/data/Room.csv" );
            BufferedReader bufferedReader = new BufferedReader( fileReader );
            String line;
            String[] arrayFile;
            while ((line = bufferedReader.readLine()) != null) {
                arrayFile = line.split( ", " );
//                Room room = new Room( arrayFile[0], arrayFile[1], arrayFile[2], arrayFile[3], arrayFile[4], arrayFile[5],
//                        arrayFile[6] );
//                roomList.add( room );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return roomList;
    }

    public List<House> dataHouse() {
        List<House> houseList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader( "src/data/House.csv" );
            BufferedReader bufferedReader = new BufferedReader( fileReader );
            String line;
            String[] arrayFile;
            while ((line = bufferedReader.readLine()) != null) {
                arrayFile = line.split( ", " );
//                House house = new House( arrayFile[0], arrayFile[1], arrayFile[2], arrayFile[3], arrayFile[4], arrayFile[5],
//                        arrayFile[6], arrayFile[7], arrayFile[8] );
//                houseList.add( house );
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return houseList;
    }

    public void serviceFile(Object service) {
        if (service instanceof Villa) {
            checkFile( VILLA_PATH, service );
        } else if (service instanceof House) {
            checkFile( HOUSE_PATH, service );
        } else if (service instanceof Room) {
            checkFile( ROOM_PATH, service );
        }
    }

    public void checkFile(String file, Object service) {
        try {
            FileWriter fileWriter = new FileWriter( file, true );
            BufferedWriter bufferedWriter = new BufferedWriter( fileWriter );
            bufferedWriter.newLine();
            bufferedWriter.write( service.toString() );
            bufferedWriter.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
