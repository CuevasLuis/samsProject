package employees;

public class employee {

    String firstName;
    String lastName;

    public employee(String fname, String lname) {
        this.firstName = fname;
        this.lastName = lname;

    }


     public String getName(){
        return this.firstName + " " +  this.lastName;
    };

    public void setName(String fName, String lName) {
        this.firstName = fName;
        this.lastName = lName;
    };

}
