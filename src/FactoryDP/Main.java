package FactoryDP;

public class Main {
    public static void main(String[] args) {
//        Employee employee =new AndroidDeveloper(); // but we dont want tight coupling

            Employee employee = EmployeeFactory.getEmployee("android developer");
            employee.getSalary();
            System.out.println(employee.getSalary());



    }
}
