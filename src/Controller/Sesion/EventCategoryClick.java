package Controller.Sesion;

import Model.Category;
import View.Sesion.ViTPV;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class EventCategoryClick implements ActionListener {

    ViTPV w;
    ArrayList<Category> categories;

    public EventCategoryClick(ViTPV w, ArrayList<Category> categories) {

        this.w = w;
        this.categories = categories;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clicked = (JButton) e.getSource();

        for (int i = 0; i < categories.size() ; i++) {
            if(categories.get(i).getName().equalsIgnoreCase(clicked.getText())){
                System.out.println(categories.get(i).getName()+"-");
                w.setProducts(categories.get(i));
                i = categories.size();
            }
        }

    }
}
