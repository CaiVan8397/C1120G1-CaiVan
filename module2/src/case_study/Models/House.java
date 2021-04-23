package case_study.Models;

public class House extends Services {
    protected String typeRoom;
    protected String equipment;
    protected int floor;

    public House(String typeRoom, String equipment, int floor) {
        this.typeRoom = typeRoom;
        this.equipment = equipment;
        this.floor = floor;
    }

    public House(String id, String serviceName, double acreage, double cost, int numberPeople,
                 String rentalType, String typeRoom, String equipment, int floor) {
        super(id, serviceName, acreage, cost, numberPeople, rentalType);
        this.typeRoom = typeRoom;
        this.equipment = equipment;
        this.floor = floor;
    }
//    public House(String[] houseInfo) {
//        super(houseInfo[0], houseInfo[1], Double.parseDouble(houseInfo[2]),
//                Double.parseDouble(houseInfo[3]), Integer.parseInt(houseInfo[4]), houseInfo[5]);
//        this.typeRoom = houseInfo[6];
//        this.equipment = houseInfo[7];
//        this.floor = Integer.parseInt(houseInfo[8]);
//    }


    public String getTypeRoom() {
        return typeRoom;
    }

    public void setTypeRoom(String typeRoom) {
        this.typeRoom = typeRoom;
    }

    public String getEquipment() {
        return equipment;
    }

    public void setEquipment(String equipment) {
        this.equipment = equipment;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.typeRoom + "," + this.equipment + "," + this.floor;
    }

    @Override
    public String showInfor() {
        return "House { " + "\n" + super.showInfor() +
                ", TypeRoom: " + this.typeRoom +
                ", Equipment: " + this.equipment +
                ", Number of floor: " + this.floor;
    }
}
