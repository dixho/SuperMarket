package Controller.Sesion;

import Controller.DB.DBConnection;
import Model.*;
import View.Sesion.CategoryPanel;
import View.Sesion.ViTPV;

import javax.swing.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class TPVController {


    public TPVController(Employee employee){

        ArrayList<Category> categories = new ArrayList();

        ViTPV viTPV = new ViTPV();
        
        catchCategories(categories);
        cathProducts(categories);
        for (int i = 0; i < categories.size() ; i++) {
            System.out.println(categories.get(i).getName());
        }
        setCategories(viTPV,categories);

    }

    private void setCategories(ViTPV w, ArrayList<Category> categories) {


        for (int i = 0; i < categories.size() ; i++) {
            JButton add = new JButton(categories.get(i).getName());
            add.addActionListener(new categoryKeyEvent(w));
            w.getCategoryPanel().add(add);
        }

        w.refresh();
    }

    private void cathProducts(ArrayList<Category> categories) {

        try {
            for (int i = 0; i < categories.size() ; i++) {

                ResultSet rs = new DBConnection().doQuery("Select * from products where category = "+categories.get(i).getId());
                while (rs.next()){
                    categories.get(i).getProducts().add(new Product(rs.getInt("ID"),rs.getString("name"),rs.getFloat("price"),rs.getInt("units")));
                }
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }

    private void catchCategories(ArrayList<Category> categories) {

        try {
            ResultSet rs = new DBConnection().doQuery("Select * from category");
            while (rs.next()){
                categories.add(new Category(rs.getInt("ID"),rs.getString("name")));
            }

        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

}
