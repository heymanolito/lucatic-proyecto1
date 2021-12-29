package excepciones;

public class PlataformaException {
	
public PlataformaException() {
		
	}
	
	public void getMensaje() {
		System.out.println("La plataforma no esta disponible");
		
	}
	
	@Override
	public String toString() {
		String mensaje = "La plataforma no esta disponible";
		return mensaje;
		
	}
}
