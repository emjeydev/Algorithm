package Models;

import java.util.ArrayList;
import java.util.List;

public class Pharmacy {
    private String name;
    private List<Drug> drugs;
    private List<Employee> employees;

    public Pharmacy(String name) {
        this.name = name;
        drugs = new ArrayList<>();
        employees = new ArrayList<>();
    }

    public void addDrug(Drug drug) {
        drugs.add(drug);
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public int totalPrice() {
        int totalPrice = 0;
        for (Drug drug : drugs) {
            totalPrice += drug.getAmount() * drug.getPrice();
        }
        return totalPrice;
    }

    public String employeeSummary() {
        StringBuilder employeeSummary = new StringBuilder("Employees:\n");
        int counter = 1;
        for (Employee employee : employees) {
            employeeSummary.append("The employee number ").append(counter).append(" is ").append(employee.getFirstName()).append(" ").append(employee.getLastName()).append(" who is ").append(employee.getAge()).append(" years old.\n");
            counter++;
        }
        return employeeSummary.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
