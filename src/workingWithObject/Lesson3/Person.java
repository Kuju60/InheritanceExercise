package workingWithObject.Lesson3;

public class Person {
    //creating a variable
    private String firstName;
    private String lastName;
    //creating a constructor that sets the name variables
    public Person( String firstName, String lastName ){
        super( );
        this.firstName = firstName;
        this.lastName = lastName;
    }
    //to create the accessor and mutator for first name
    public String getFirstName(){

        return firstName;
    }
    public void setFirstName( String firstName ){

        this.firstName = firstName;
    }
    //to create the accessor and mutator for last name
    public String getLastName(){
        return lastName;
    }
    public void setLastName( String lastName ){
        this.lastName = lastName;
    }
    @Override
    public String toString() {
        return "Name: " + firstName + "  " + lastName;
    }
}
