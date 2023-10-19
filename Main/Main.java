package Main;

import employees.*;

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

	}

}
