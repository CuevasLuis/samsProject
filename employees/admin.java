package employees;

public class admin extends employee {
	

    public admin(String fname, String lname) {
        super(fname,lname);
       
    }
	
	
	
	
	public String getName() {
		return this.firstName + " " +  this.lastName;
	}

}
