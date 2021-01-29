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

    public House(String id, String serviceName, double acreage, double cost, int numberPeople, String rentalType, String typeRoom, String equipment, int floor) {
        super(id, serviceName, acreage, cost, numberPeople, rentalType);
        this.typeRoom = typeRoom;
        this.equipment = equipment;
        this.floor = floor;
    }

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
        return "House{" +
                "typeRoom='" + typeRoom + '\'' +
                ", equipment='" + equipment + '\'' +
                ", floor=" + floor +
                ", id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", acreage=" + acreage +
                ", cost=" + cost +
                ", numberPeople=" + numberPeople +
                ", rentalType='" + rentalType + '\'' +
                '}';
    }

    @Override
    public String showInfor() {
        return  super.toString() + ", " + typeRoom + ", " + equipment + ", " + floor;
    }
}
