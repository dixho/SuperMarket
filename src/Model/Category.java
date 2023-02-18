package Model;

import java.util.ArrayList;

public class Category {

    private int id;
    private String name;
    private ArrayList<Product> products;

    public Category(int id,String name){
        this.id = id;
        this.name = name;
        products = new ArrayList<>();

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public Product getProducts(int index) {
        return products.get(index);
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
}
