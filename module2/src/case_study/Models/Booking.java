package case_study.Models;

public class Booking {
    protected String  nameCustomer;
    protected String customerIdNumber;
    protected String idService;

    public Booking() {
    }

    public Booking(String nameCustomer, String customerIdNumber, String idService) {
        this.nameCustomer = nameCustomer;
        this.customerIdNumber = customerIdNumber;
        this.idService = idService;
    }

//    public Booking (String[] bookingInfo) {
//        this.nameCustomer = bookingInfo[0];
//        this.customerIdNumber = bookingInfo[1];
//        this.idService = bookingInfo[2];
//    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getCustomerIdNumber() {
        return customerIdNumber;
    }

    public void setCustomerIdNumber(String customerIdNumber) {
        this.customerIdNumber = customerIdNumber;
    }

    public String getIdService() {
        return idService;
    }

    public void setIdService(String idService) {
        this.idService = idService;
    }

    @Override
    public String toString() {
        return getNameCustomer() + "," + getCustomerIdNumber() + "," + getIdService();
    }

    public String showInfor(){
        return "Booking{" +
                "nameCustomer: " + this.nameCustomer +
                ", customerIdNumber: " + this.customerIdNumber +
                ", idService: " + this.idService + '}';
    }
}
