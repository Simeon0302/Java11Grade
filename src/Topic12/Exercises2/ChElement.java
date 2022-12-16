/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic12.Exercises2;

/**
 *
 * @author simeonyav
 */
public class ChElement {
    private String symbol;
    private int elementNumber;
    private int period;
    private int group;
    private float mass;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public int getElementNumber() {
        return elementNumber;
    }

    public void setElementNumber(int elementNumber) {
        this.elementNumber = elementNumber;
    }

    public int getPeriod() {
        return period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public float getMass() {
        return mass;
    }

    public void setMass(float mass) {
        this.mass = mass;
    }
    
    public ChElement() {
        this("", 1, 0, 0);
        findGroup();
    }
    
    public ChElement(String symbol, int elementNumber, int period, float mass) {
        this.symbol = symbol;
        this.elementNumber = elementNumber;
        this.period = period;
        findGroup();
        this.mass = mass;
    }
    
    public ChElement(ChElement element){
        this(element.getSymbol(), element.getElementNumber(), element.getPeriod(), element.getMass());
        findGroup();
    }
    
    public void findGroup() {
        if(elementNumber == 1 || elementNumber == 3 || elementNumber == 11) {
            group = 1;
        }
        else if(elementNumber == 5 || elementNumber == 13) {
            group = 13;
        }
        else if(elementNumber == 8 || elementNumber == 16) {
            group = 16;
        }
    }
    
    public void printGroup() {
        System.out.println("The group is " + group);
    }
    

    @Override
    public String toString() {
        return String.format(
                "Name: %s%n"
                + "Element Number: %d%n"
                + "Period: %s%n"
                + "Group: %d%n"
                + "Mass: %f%n",
                symbol,
                elementNumber,
                period,
                group,
                mass
        );
    }
}
