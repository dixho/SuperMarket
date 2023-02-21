package Controller.DB;

import java.sql.*;

public class CoDBConnection {

    private String url;
    private String username;
    private String password;

    public CoDBConnection(){

        this.url = "jdbc:mysql://localhost:3306/dixho_market";
        this.username = "root";
        this.password = "";


        try {
            Connection connection = getConnection();


            connection.close();
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Error al realizar la consulta: " + e.getMessage());
        }



    }

    private Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(url, username, password);

        Statement statement = connection.createStatement();
        return connection;
    }

    public ResultSet doQuery(String query) throws SQLException, ClassNotFoundException {
        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        return statement.executeQuery(query);
    }

}
