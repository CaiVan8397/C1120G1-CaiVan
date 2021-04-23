package case_study.Models;

public class Room extends Services{
    protected String freeService;

    public Room(String freeService) {
        this.freeService = freeService;
    }

    public Room(String id, String serviceName, double acreage, double cost, int numberPeople, String rentalType, String freeService) {
        super(id, serviceName, acreage, cost, numberPeople, rentalType);
        this.freeService = freeService;
    }
//    public Room(String[] roomInfo) {
//        super(roomInfo[0], roomInfo[1], Double.parseDouble(roomInfo[2]),
//                Double.parseDouble(roomInfo[3]), Integer.parseInt(roomInfo[4]), roomInfo[5]);
//        this.freeService = roomInfo[6];
//    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return super.toString() + "," + this.freeService;
    }

    @Override
    public String showInfor() {
        return "Room { " + super.showInfor() +
                ", FreeService: " + getFreeService() + "}";
    }

}
