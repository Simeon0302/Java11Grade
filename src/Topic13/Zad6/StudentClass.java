/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Topic13.Zad6;
import Topic13.Zad5.Student;

/**
 *
 * @author Moni
 */
public class StudentClass {
    private Student[] students;
    private int numberOfStudents = 0;
    private int grade;
    private String specialty;

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if(grade > 0 && grade < 13) this.grade = grade;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        if(specialty != null) this.specialty = specialty;
    }

    public StudentClass() {
        setStudents(new Student[100]);
        numberOfStudents = 0;
        setGrade(1);
        setSpecialty("Math");
    }

    public StudentClass(Student[] students, int grade, String specialty) {
        setStudents(students);
        setGrade(grade);
        setSpecialty(specialty);
        numberOfStudents = students.length;
    }
    
    public void addStudent(Student student) {
        students[numberOfStudents + 1] = student;
    }
    
    public void removeStudent() {
        students[numberOfStudents] = null;
        numberOfStudents--;
    }
    
    public boolean isStudentInClass(Student student) {
        Student currentStudent;
        
        for(int i = 0; i < numberOfStudents; i++) {
            currentStudent = students[i];
            if(
                    currentStudent.getName() == student.getName() &&
                    currentStudent.getBirthDate().getDay() == student.getBirthDate().getDay() &&
                    currentStudent.getBirthDate().getMonth() == student.getBirthDate().getMonth() &&
                    currentStudent.getBirthDate().getYear() == student.getBirthDate().getYear() &&
                    currentStudent.getAverageScore() == student.getAverageScore()) 
            {
                return true;
            }
        }
        
        return false;
    }
}
