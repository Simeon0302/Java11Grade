/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic13.Zad3;

/**
 *
 * @author Moni
 */
public class GSM {
    private String brand;
    private String model;
    private double price;
    private int creationYear;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if(brand != null) this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if(brand != null) this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) this.price = price;
    }

    public int getCreationYear() {
        return creationYear;
    }

    public void setCreationYear(int creationYear) {
        if(creationYear > 0 && creationYear < 2023) this.creationYear = creationYear;
    }
}
