package excepciones;

public class GeneroException extends Exception {
	
	public GeneroException() {
		
	}
	
	public void getMensaje() {
		System.out.println("El genero no esta disponible");
		
	}
	
	@Override
	public String toString() {
		String mensaje = "El genero no esta disponible";
		return mensaje;
		
	}
	
}
