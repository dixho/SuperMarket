package Controller.Sesion;

import Controller.DB.CoDBConnection;
import Model.*;
import View.Sesion.ViTPV;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class CoTPV {


    public CoTPV(SesionData sesionData){

        ArrayList<Category> categories = new ArrayList();


        
        catchCategories(categories);
        cathProducts(categories);
        for (int i = 0; i < categories.size() ; i++) {
            System.out.println(categories.get(i).getName());
        }
        ViTPV viTPV = new ViTPV(categories,sesionData);
        viTPV.setCategories(categories);

    }

    private void cathProducts(ArrayList<Category> categories) {

        try {
            for (Category category : categories) {

                ResultSet rs = new CoDBConnection().doQuery("Select * from products where category = " + category.getId());
                while (rs.next()) {
                    category.getProducts().add(new Product(rs.getInt("ID"), rs.getString("name"), rs.getFloat("price"), rs.getInt("units")));
                }
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private void catchCategories(ArrayList<Category> categories) {

        try {
            ResultSet rs = new CoDBConnection().doQuery("Select * from category");
            while (rs.next()){
                categories.add(new Category(rs.getInt("ID"),rs.getString("name")));
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
