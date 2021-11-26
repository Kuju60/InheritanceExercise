package workingWithObject.Lesson3;

public class Student extends Person {
    //creating a variable
    private String studentId;
    //creating a constructor that sets the variables and the super class variables
    public Student( String firstName, String lastName, String studentId ){
        super( firstName, lastName);
        this.studentId = studentId;
    }
    //create getter functions for the variables
    public String getStudentId(){
        return studentId;
    }
    //create getter functions for the variables
    public void setStudentId( String studentId ){
        this.studentId = studentId;
    }
    @Override
    public String toString(){
        return super.toString() + " student ID: " + studentId;
    }
}
