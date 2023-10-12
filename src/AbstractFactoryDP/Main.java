package AbstractFactoryDP;

public class Main {
    public static void main(String[] args) {

        Employee e1=EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        System.out.println(e1.name());
    }

}
