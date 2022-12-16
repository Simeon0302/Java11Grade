/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic13.Zad2;

/**
 *
 * @author Moni
 */
public class Teacher extends Person {
    private String subject;
    private double salary;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        if(subject != null) this.subject = subject;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if(salary > 0) this.salary = salary;
    }

    public Teacher(String subject, double salary, int birthYear, String birthCity, String name) {
        super(birthYear, birthCity, name);
        setSubject(subject);
        setSalary(salary);
    }
    
    public void getPromotion(double promotionMoney) {
        salary += promotionMoney;
        System.out.println("The teacher " + getName() + " got a promotion");
    }
    
    @Override
    public String toString() {
        return String.format(
                "The teacher called %s is at the age of %d",
                getName(),
                calculateAge()
        );
    }
}
