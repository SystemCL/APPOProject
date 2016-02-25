
public class Process {

	public Process() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String args[]){
		Elefant e1=new Elefant();
		Mamifer m1=new Mamifer();
		Carnivor c1=new Carnivor();
		Pasare p1 = new Pasare();
		
		Printer  p2 =new Printer();
		p2.printToConsole(e1);
		p2.printToConsole(m1);
		p2.printToConsole(c1);
		p1.Viteza();
		

	}
	
	


}
