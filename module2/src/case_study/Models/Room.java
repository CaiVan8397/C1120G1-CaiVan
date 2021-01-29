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

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id='" + id + '\'' +
                ", serviceName='" + serviceName + '\'' +
                ", acreage=" + acreage +
                ", cost=" + cost +
                ", numberPeople=" + numberPeople +
                ", rentalType='" + rentalType + '\'' +
                ", freeService='" + freeService + '\'' +
                '}';
    }

    @Override
    public String showInfor() {
        return super.toString() + ", " + freeService;
    }
}
