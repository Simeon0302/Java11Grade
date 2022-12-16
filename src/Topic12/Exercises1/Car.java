/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic12.Exercises1;

/**
 *
 * @author simeonyav
 */
public class Car {
    private float weight;
    private String brand;
    private int years;
    
    public Car(float weight, String brand, int years) {
        this.weight = weight;
        this.brand = brand;
        this.years = years;
    }
    
    public Car() {
        weight = 1;
        brand = "Default Brand Name";
        years = 1;
    }
    
    public Car(Car car) {
        this(car.weight, car.brand, car.years);
    }
    
    public float getWeight() {
        return weight;
    }
    
    public void setWeight(float weight) {
        if(weight > 0) this.weight = weight;
    }

    public String getBrand() {
        return brand;
    }
    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        if(years > 0) this.years = years;
    }
    
    public boolean isWeightAbove() {
        return weight > 3.5f;
    }
    
    @Override
    public String toString() {
        return String.format(
                "The brand %s has weight %f and the years are %d%n"
                + (isWeightAbove() ? "The weight is above 3.5" : "The weight is not above 3.5"),
                getBrand(),
                getWeight(),
                getYears()
        );
    }
}
