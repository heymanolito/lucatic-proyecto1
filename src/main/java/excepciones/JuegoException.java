package excepciones;

public class JuegoException {

	
public JuegoException() {
		
	}
	
	public void getMensaje() {
		System.out.println("El juego no esta en la lista");
		
	}
	
	@Override
	public String toString() {
		String mensaje = "El juego no esta en la lista";
		return mensaje;
		
	}
}
