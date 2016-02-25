
public class Elefant implements Animal {
     
	String tip="Ierbivor";
	
	public Elefant() {

	}

	@Override
	public void maninca() {
		System.out.println("> Elefant");
		System.out.println("El maninca iarba");
		
	}

	@Override
	public void deplasare() {
		System.out.println("Se deplaseaza pe jos");
		System.out.println("Tipul animalului: "+ tip);
		System.out.println("--------------------------");
		
	}
	
	
	
	
	

}
