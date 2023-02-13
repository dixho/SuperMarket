package Model;

import java.util.ArrayList;

public class Employees {

    private ArrayList<Employee> employees = new ArrayList<>();

    public Employees(){
        int id = 1;
        employees.add(new Employee(id++,"flopez","Contrasena","Fran","López Fenández",50F));
        employees.add(new Employee(id++,"janiebla","Password","José Alberto", "Niebla Fernández", 33f));

    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public Employee getEmployees(int index) {
        return employees.get(index);
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
