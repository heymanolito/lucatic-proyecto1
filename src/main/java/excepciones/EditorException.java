package excepciones;

public class EditorException {
	
	public EditorException() {

	}

	public void getMensaje() {
		System.out.println("El editor no esta disponible");

	}

	@Override
	public String toString() {
		String mensaje = "El editor no esta disponible";
		return mensaje;

	}
}
