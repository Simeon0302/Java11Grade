/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic12.Exercises1;

import java.util.Scanner;

/**
 *
 * @author simeonyav
 */
public class Vacation {
    private int day;
    private String destination;
    private float budget;
    private float costPerDay;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day > 0) this.day = day;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
    
    public float getBudget() {
        return budget;
    }

    public void setBudget(float budget) {
        if(budget > 0) this.budget = budget;
    }

    public float getCostPerDay() {
        return costPerDay;
    }

    public void setCostPerDay(float costPerDay) {
        this.costPerDay = costPerDay;
    }
    
    public void calculateCostPerDay() {
        costPerDay = budget / day;
    }
    
    public Vacation() {
        day = 1;
        destination = "Sofia";
        budget = 10;
        calculateCostPerDay();
    }
    
    public Vacation(int day, String destination, float budget) {
        this.day = day;
        this.destination = destination;
        this.budget = budget;
        calculateCostPerDay();
    }
    
    public Vacation(Vacation vacation) {
        this(vacation.getDay(), vacation.getDestination(), vacation.getBudget());
    }
    
    public Vacation[] enterVacations(int numberOfVacations) {
        Vacation[] vacations = new Vacation[numberOfVacations];
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < numberOfVacations; i++) {
            vacations[i] = new Vacation(sc.nextInt(), sc.next(), sc.nextFloat());
        }
        
        return vacations;
    }
    
    public void findVacationWithMaxDays(Vacation[] vacations) {
        Vacation vacMax = vacations[0];
        
        for(int i = 1; i < vacations.length; i++) {
            if(vacMax.getDay() < vacations[i].getDay()) {
                vacMax = vacations[i];
            }
        }
        
        System.out.println(vacMax.toString());
    }
    
    @Override
    public String toString() {
        return String.format(
                "The vacation to %s will take %d"
                + "The budget is %f and the cost per day is %f",
                destination,
                day,
                budget,
                costPerDay
        );
    }
}
