package Main;

import java.sql.Date;
import java.util.List;

import employees.*;
import employees.admin;
import stores.store;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		admin employee01 = new admin("Luis", "Cuevas");
		manager employee02 = new manager("Luis ", "Kaves");
		staff employee03 = new staff(null, null);

		System.out.println(employee01.getName());
		System.out.println(employee02.getName());
		employee03.setName("KAVES", "LUIS");
		System.out.println(employee03.getName());

		// STORE VARIABLES
		// String location;
		// String contactInfromation;
		// String storeType;
		// Date openingDate;

		employee01.createStore2("Deer Park Tx", "713", "Online", new Date(2023, 12, 31));

		store store01 = employee01.createStore2("Houston, Tx", "713", "Online", new Date(2023 - 1900, 12, 31));

		System.out.println(store01.location);

	}

}
