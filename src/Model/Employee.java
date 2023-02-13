package Model;

public class Employee {

    private int id;

    private String user;

    private String pass;

    private String name;

    private String surname;

    private float discount;

    public Employee(int id, String user, String pass){

        this.id = id;
        this.user = user;
        this.pass = pass;


    }

    public Employee(int id, String user, String pass, String name, String surname, float discount) {
        this.id = id;
        this.user = user;
        this.pass = pass;
        this.name = name;
        this.surname = surname;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }
}
