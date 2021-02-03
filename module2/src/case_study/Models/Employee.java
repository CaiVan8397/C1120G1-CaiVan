package case_study.Models;

public class Employee {
    protected String idEmployee;
    protected String nameEmployee;
    protected int ageEmployee;
    protected String addressEmployee;

    public Employee() {
    }

    public Employee(String idEmployee, String nameEmployee, int ageEmployee, String addressEmployee) {
        this.idEmployee = idEmployee;
        this.nameEmployee = nameEmployee;
        this.ageEmployee = ageEmployee;
        this.addressEmployee = addressEmployee;
    }

    public String getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(String idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public int getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(int ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    @Override
    public String toString() {
        return idEmployee + "," + nameEmployee  + "," + ageEmployee + "," + addressEmployee ;
    }
    public String showInfo(){
        return "Name: " + this.nameEmployee + " ," + "Age: " + this.ageEmployee + ", " + "Address: " + this.addressEmployee;
    }
}
