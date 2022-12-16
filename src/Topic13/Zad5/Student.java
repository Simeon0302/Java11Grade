/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic13.Zad5;

/**
 *
 * @author Moni
 */
public class Student {
    private String name;
    private int number;
    private Date birthDate;
    private double averageScore;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null) this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if(number > 0) this.number = number;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        if(birthDate != null) this.birthDate = birthDate;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public void setAverageScore(double averageScore) {
        if(averageScore >= 2 && averageScore <= 6) this.averageScore = averageScore;
    }
    
    public Student() {
        setName("Default");
        setNumber(1);
        setBirthDate(new Date());
        setAverageScore(6);
    }
    
    public Student(String name, int number, Date birthDate, double averageScore) {
        setName(name);
        setNumber(number);
        setBirthDate(birthDate);
        setAverageScore(averageScore);
    }
    
    public int calculateAge(Date date) {
        return date.getYear() - birthDate.getYear();
    }
    
    @Override
    public String toString() {
        return String.format(
                "The student called %s is number %d in the class. His/her birthDate is on %s. His/her averageScore is %f",
                    name,
                    number,
                    birthDate.toString(),
                    averageScore
                );
    }
}
