package employees;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import stores.store;

public class admin extends employee {

    // a list array to hold all the created stores.

    public admin(String fname, String lname) {
        super(fname, lname);

    }// end of constructor
  
    public store createStore2(String location, String contact, String storeType, Date date) {
        store store = new store();
        store.location = location;
        store.contactInfromation = contact;
        store.storeType = storeType;
        store.openingDate = date;


        return store;
    }// end of createStore


}// end of admin class
