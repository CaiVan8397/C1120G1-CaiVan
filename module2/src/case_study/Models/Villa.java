package case_study.Models;

public class Villa extends Services {
    protected String typeRoom;
    protected String equipment;
    protected String acreagePool;
    protected int floor;

    public Villa(String typeRoom, String equipment, String acreagePool, int floor) {
        this.typeRoom = typeRoom;
        this.equipment = equipment;
        this.acreagePool = acreagePool;
        this.floor = floor;
    }

    public Villa(String id, String serviceName, double acreage, double cost, int numberPeople, String rentalType,
                 String typeRoom, String equipment, String acreagePool, int floor) {
        super(id, serviceName, acreage, cost, numberPeople, rentalType);
        this.typeRoom = typeRoom;
        this.equipment = equipment;
        this.acreagePool = acreagePool;
        this.floor = floor;
    }
//    public Villa(String[] villaInfo) {
//        super(villaInfo[0], villaInfo[1], Double.parseDouble(villaInfo[2]),
//                Double.parseDouble(villaInfo[3]), Integer.parseInt(villaInfo[4]), villaInfo[5]);
//        this.typeRoom = villaInfo[6];
//        this.equipment = villaInfo[7];
//        this.acreagePool =villaInfo[8];
//        this.floor = Integer.parseInt(villaInfo[9]);
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

    public String getAcreagePool() {
        return acreagePool;
    }

    public void setAcreagePool(String acreagePool) {
        this.acreagePool = acreagePool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.typeRoom + "," + this.equipment + "," + this.acreagePool +
                "," + this.floor;
    }

    @Override
    public String showInfor() {
        return "Villa {  " +  super.showInfor() +
                ", Type room: " + this.typeRoom  +
                ", Other equipment: " + this.equipment +
                ", Acreage of pool: " + this.acreagePool +
                ", Number of floor: " + this.floor + "}";
    }
}
