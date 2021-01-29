package case_study.Models;

public abstract class Services {
    protected String id;
    protected String serviceName;
    protected double acreage;
    protected double cost;
    protected int numberPeople;
    protected String rentalType;

    public Services() {
    }

    public Services(String id, String serviceName, double acreage, double cost, int numberPeople, String rentalType) {
        this.id = id;
        this.serviceName = serviceName;
        this.acreage = acreage;
        this.cost = cost;
        this.numberPeople = numberPeople;
        this.rentalType = rentalType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAcreage() {
        return acreage;
    }

    public void setAcreage(double acreage) {
        this.acreage = acreage;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getNumberPeople() {
        return numberPeople;
    }

    public void setNumberPeople(int numberPeople) {
        this.numberPeople = numberPeople;
    }

    public String getRentalType() {
        return rentalType;
    }

    public void setRentalType(String rentalType) {
        this.rentalType = rentalType;
    }

    @Override
    public String toString() {
        return "Information of Services{" +
                "id: " + id  +
                ", serviceName: " + serviceName + '\'' +
                ", acreage: " + acreage +
                ", cost: " + cost +
                ", numberPeople: " + numberPeople +
                ", rentalType: " + rentalType ;
    }

    public abstract String showInfor();
}
