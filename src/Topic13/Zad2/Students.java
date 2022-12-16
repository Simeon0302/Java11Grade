/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic13.Zad2;

/**
 *
 * @author Moni
 */
public class Students extends Person{
    private int grade;
    private String specialty;

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public Students(int grade, String specialty, int birthYear, String birthCity, String name) {
        super(birthYear, birthCity, name);
        this.grade = grade;
        this.specialty = specialty;
    }
    
    public void finishSchoolYear() {
        System.out.printf("The student %s has finished grade %d", getName(), grade);
        grade++;
    }
    
    @Override
    public String toString() {
        return String.format(
                "The student %s is at the age of %d",
                getName(),
                calculateAge()
        );
    }
}
