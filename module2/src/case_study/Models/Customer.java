package case_study.Models;

public class Customer {
    protected String customerName;
    protected String customerBirthday;
    protected String customerGender;
    protected String customerIdNumber;
    protected String customerPhone;
    protected String customerEmail;
    protected String customerType;
    protected String customerAddress;
    protected Services service;

    public Customer() {
    }

    public Customer(String customerName, String customerBirthday, String customerGender, String customerIdNumber,
                    String customerPhone, String customerEmail, String customerType, String customerAddress) {
        this.customerName = customerName;
        this.customerBirthday = customerBirthday;
        this.customerGender = customerGender;
        this.customerIdNumber = customerIdNumber;
        this.customerPhone = customerPhone;
        this.customerEmail = customerEmail;
        this.customerType = customerType;
        this.customerAddress = customerAddress;
    }

//    public Customer(String[] customerInfo) {
//        this.customerName = customerInfo[0];
//        this.customerBirthday = customerInfo[1];
//        this.customerGender = customerInfo[2];
//        this.customerIdNumber = customerInfo[3];
//        this.customerPhone = customerInfo[4];
//        this.customerEmail = customerInfo[5];
//        this.customerType = customerInfo[6];
//        this.customerAddress = customerInfo[7];
//    }


    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(String customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(String customerGender) {
        this.customerGender = customerGender;
    }

    public String getCustomerIdNumber() {
        return customerIdNumber;
    }

    public void setCustomerIdNumber(String customerIdNumber) {
        this.customerIdNumber = customerIdNumber;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    @Override
    public String toString() {
        String string = customerName + ',' +
                customerBirthday + ',' +
                customerGender + ',' +
                customerIdNumber + ',' +
                customerPhone + ',' +
                customerEmail + ',' +
                customerType + ',' +
                customerAddress;
        if (service != null) {
            string += ',' + service.getId();
        }
        return string;
    }

    public String showInfor() {
        return "Customer{" +
                "Name:" + this.customerName +
                ", Birthday: " + this.customerBirthday +
                ", Customer: " + this.customerGender  +
                ", IdNumber: " + this.customerIdNumber +
                ", Phone: "  + this.customerPhone +
                ", Customer Type: " + this.customerType +
                ", Address: " + this.customerAddress +
                '}';
    }
}
