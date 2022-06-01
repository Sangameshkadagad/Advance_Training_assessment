package LinkedinEmployee;

import java.util.Vector;

public class employeeTest {
	
	
	private static final Employeelist[] v = null;
	public static void main(String[] args) {
		Vector<Employeelist> v= addInput();
		display(v);
	}
	private static Vector<Employeelist> addInput() {
		
		return null;
	}
	private static void display(Vector<Employeelist> v) {
		
	}
	
	public static Vector<Employeelist> main1() {
		
		Employeelist e1=new Employeelist(101, "nagesh", "ganesh");
		Employeelist e2=new Employeelist(102, "nichitha", "gopal");
		Employeelist e3=new Employeelist(103, "mallesh", "mahesh");
		Vector<Employeelist> v=new Vector<Employeelist>();
		v.add(e1);
		v.add(e2);
		v.add(e3);
		return v;
		
	}
	public static void main2(String[] args) {
		
		for (Employeelist e :v) {
			System.out.println(e.getEmpid()+"\t"+e.getEname()+"\t"+e.getAddress());
			
		}
	}
}
