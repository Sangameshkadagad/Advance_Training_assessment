package Medicins;

public class Medicin {
	public void displayLabel(){
	System.out.println("Company :  Pharma");
	System.out.println("Address : Bangalore");
	}
	}
class Tablet extends Medicin{
	 
public void displayLabel(){
	System.out.println("store in a cool dry place");
	}
}
class Syrup extends Medicin{
	public void displayLabel(){
	System.out.println("Consumption as directed by thephysician");
	}
	}
class Ointment extends Medicin{
	public void displayLabel(){
	System.out.println("for external use only");
}
}