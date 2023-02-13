package Model;

import java.util.ArrayList;
import java.sql.*;

public class Employees {


    private ArrayList<Employee> employees = new ArrayList<>();

    public Employees(){
        /*int id = 1;
        employees.add(new Employee(id++,"flopez","Contrasena","Fran","López Fenández",50F));
        employees.add(new Employee(id++,"janiebla","Password","José Alberto", "Niebla Fernández", 33f));
        */

        String url = "jdbc:mysql://localhost:3306/dixho_market";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");

            Connection connection = DriverManager.getConnection(url, username, password);

            Statement statement = connection.createStatement();

            String query = "SELECT * FROM employees";
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                employees.add(new Employee(
                        resultSet.getInt("ID"),
                        resultSet.getString("user"),
                        resultSet.getString("password"),
                        resultSet.getString("name"),
                        resultSet.getString("surname"),
                        resultSet.getFloat("discount")
                ));
            }

            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al realizar la consulta: " + e.getMessage());
        }


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
