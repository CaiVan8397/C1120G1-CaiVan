package case_study.Controllers.Manager;

import case_study.Commons.ReadAndWrite.WriteAndReadEmployee;
import case_study.Models.Employee;

import java.util.*;

public class ManageEmployee {

    public static void addEmploy(){
        List <Employee> employeeList = new ArrayList<>(10);
        employeeList.add(new Employee("001", "Nguyen Van A", 22, "108 Nguyen Huu Tho"));
        employeeList.add(new Employee("002", "Tran Van C", 23, "111 Nguyen Huu Tho"));
        employeeList.add(new Employee("003", "Nguyen Trung B", 25, "18 Nguyen Huu Tho"));
        employeeList.add(new Employee("004", "Truong Van H", 21, "08 Nguyen Huu Tho"));
        employeeList.add(new Employee("005", "Ho Van G", 20, "10 Nguyen Huu Tho"));
        employeeList.add(new Employee("006", "Le Thi Z", 22, "128 Nguyen Huu Tho"));
        employeeList.add(new Employee("007", "Bui Van D", 25, "28 Nguyen Huu Tho"));
        employeeList.add(new Employee("008", "Le Thi L", 28, "48 Nguyen Huu Tho"));
        employeeList.add(new Employee("009", "Nguyen Ho M", 27, "278 Nguyen Huu Tho"));
        employeeList.add(new Employee("010", "Ly Tieu Long", 26, "378 Nguyen Huu Tho"));
        WriteAndReadEmployee.writeEmployee(employeeList,true);
    }

    //Sử dụng Map
    public static void showEmployee(){
        addEmploy();
        List <Employee> list = WriteAndReadEmployee.readEmployee();
        Map<String, String> mapEmployee = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            mapEmployee.put(list.get(i).getIdEmployee(), list.get(i).showInfo());
        }
        for (Map.Entry<String,String> entry : mapEmployee.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    //Sử dụng stack
    public static Stack<Employee>  saveEmployeeInStack(){
        Stack<Employee> employeeStack = new Stack<>();
        List<Employee> listEmployee = WriteAndReadEmployee.readEmployee();
        for (Employee employee: listEmployee) {
            employeeStack.push(employee);
        }
        return employeeStack;
    }
    public static void findEmployee (String id){
        Stack <Employee> employeeStack = saveEmployeeInStack();
        for(Employee employee : employeeStack) {
            if (id.equals(employee.getIdEmployee())) {
                System.out.println(employee);
            }
        }
    }
}
