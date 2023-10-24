package stores;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

  
public class store {

  private  ArrayList<store> stores = new ArrayList<store>();
    
 

    // TOOUCH UP : TAKE OFF PUBLIC AND CREATE SETTERS AND GETTERS
    public String location;
    public String contactInfromation;
    public String storeType;
    public Date openingDate;

    // constructor method
    public void createStore(String location, String contact, String storetype, Date date) {
        this.location = location;
        this.contactInfromation = contact;
        this.storeType = storetype;
        this.openingDate = date;

    }

}// end of store class
