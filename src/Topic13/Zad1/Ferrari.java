/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package topic13.Zad1;

/**
 *
 * @author simeonyav
 */
public class Ferrari extends Car{
    private String racingStatus;
    private double price;
    
    public String getRacingStatus() {
        return racingStatus;
    }

    public void setRacingStatus(String racingStatus) {
        if(racingStatus != null) this.racingStatus = racingStatus;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if(price > 0) this.price = price;
    }

    public Ferrari(String racingStatus, double price, float speed, int numberOfWheels, String color) {
        super(speed, numberOfWheels, color);
        this.racingStatus = racingStatus;
        this.price = price;
    }
    
    public void BrumBrum() {
        System.out.println("The ferrari does brum brum");
    }
    
    @Override
    public String toString() {
        return String.format(
                "Your ferrari costs %f,"
                + "The racing status is %s.",
                price,
                racingStatus
        );
    }
}
