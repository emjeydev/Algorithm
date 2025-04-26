import Models.Drug;
import Models.Employee;
import Models.Pharmacy;

public class Main {
    public static void main(String[] args) {
        Pharmacy p = new Pharmacy("drug store");
        Drug d1 = new Drug("d1",2,1000);
        Drug d2 = new Drug("d2",3,2000);
        p.addDrug(d1);
        p.addDrug(d2);
        Employee e1 = new Employee("Mohammad", "Mohammadi", 19);
        Employee e2 = new Employee("Mohammad", "Azimi", 20);
        p.addEmployee(e1);
        p.addEmployee(e2);
        System.out.println(p.totalPrice());
        System.out.println(p.employeeSummary());
    }
}