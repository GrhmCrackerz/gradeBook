/* This is part of the starter code! 
 * You need to complete this class yourself!*/
package util;

public class Student {
    private String firstName;
    private String lastName;
    private int pid;
    private Grade grade;

    public Student(String firstName, String lastName, int pid, int score) { //student constructor
        this.firstName = firstName;
        this.lastName = lastName;
        this.pid = pid;
        this.grade = new Grade(score); //we use score to have an int to create a new Grade
    }//end of constructor

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getPid() {
        return pid;
    }
    public Grade getGrade() {
        return grade;
    }

    public void setGrade(int score){ //use this tochange the grades when needed
        grade = new Grade(score);
    }



}
