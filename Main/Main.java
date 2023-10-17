package Main;
import employees.*;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		admin employee01 =new admin("Luis" ,"Cuevas");
		admin employee02 =new admin("Cuevas", "Luis");
		
		System.out.println(employee01.getName());
		System.out.println(employee02.getName());

	}

}
