package Model;

public class SesionData {

    private Employee employee;
    private Category actualCategory;

    public SesionData(Employee employee){
        this.employee = employee;
        actualCategory = new Category(-1,"");
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Category getActualCategory() {
        return actualCategory;
    }

    public void setActualCategory(Category actualCategory) {
        this.actualCategory = actualCategory;
    }
}
