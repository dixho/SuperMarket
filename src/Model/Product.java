package Model;

public class Product {

    private int id;
    private String name;
    private int barcode;
    private float price;
    private int units;

    public Product(int id, String name, float price, int units){
        this.id = id;
        this.name = name;
        this.price = price;
        this.units = units;
    }

}
