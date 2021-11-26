package workingWithObject.Lesson3;

public class StudentEmployee extends Student {
    //creating variables
    private String employeeId;
    private double rateOfPayPerHour;

    //creating a constructor that sets the variables and the super class variables
    public StudentEmployee( String firstName, String lastName, String studentId, String employeeId, double rateOfPayPerHour ){
        super( firstName, lastName, studentId );
        this.employeeId = employeeId;  //instance variable
        this.rateOfPayPerHour = rateOfPayPerHour;  //instance variable
    }
    //create getter functions for the variables
    public String getEmployeeId(){

        return employeeId;
    }
    //create setter functions for the variables
    public void setEmployeeId( String employeeId ){

        this.employeeId = employeeId;
    }
    //create getter functions for the variables
    public double getRateOfPayPerHour(){

        return rateOfPayPerHour;
    }
    //create setter functions for the variables
    public void setRateOfPayPerHour( double rateOfPayPerHour ){

        this.rateOfPayPerHour = rateOfPayPerHour;
    }
    @Override
    public String toString(){

        return super.toString() + " employee ID: " + employeeId + " pay " + rateOfPayPerHour;
    }
}
