package excepciones;

public class YearException {
public YearException() {
		
	}
	
	public void getMensaje() {
		System.out.println("Esta fecha no es valida");
		
	}
	
	@Override
	public String toString() {
		String mensaje = "Esta fecha no es valida";
		return mensaje;
		
	}
}
