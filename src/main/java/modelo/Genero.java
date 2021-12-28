package modelo;


/**
 * @author Grupo1 Natalia buscar generos y Jaume crear métodos
 */
import lombok.Data;

public  enum Genero {
	
	Action(1),
	Adventure(2),
	Fighting(3),
	Misc(4),
	Platform(5),
	Puzzle(6),
	Racing(7),
	RolePlaying(8),
	Shooter(9),
	Simulation(10),
	Sports(11),
	Strategy(12);
	
	private final int id;
	private final int size = Genero.values().length;
	
	private Genero(int id) {
		this.id=id;
	}
	
	public int getInt() {
		return id;
	}
	
	public int getSize() {
		return size;
	}
	/**
	 * Este método dice los géneros que existen
	 */
	public static void generosDisponibles() {
		StringBuilder sb;
		for(Genero gen:Genero.values()) {
			sb= new StringBuilder();
			sb.append("(").
						append(gen.id).append(")").append(gen).append("|");
			System.out.println(sb);
		}
		
	}
	/**
	 * 
	 * @param id
	 * @return genero de la id
	 */
		public static Genero dimeGenero(int id) {
			System.out.println("Para el id: " + id);
			switch (id) {
			case 1:
				return Genero.Action;
			case 2:
				return Genero.Adventure;
			case 3: 
				return Genero.Fighting;
			case 4: 
				return Genero.Misc;	
			case 5:
				return Genero.Platform;
			case 6:
				return Genero.Puzzle;
			case 7:
				return Genero.Racing;
			case 8:
				return Genero.RolePlaying;
			case 9: 
				return Genero.Shooter;
			case 10: 
				return Genero.Simulation;	
			case 11:
				return Genero.Sports;
			case 12:
				return Genero.Strategy;
			}
			return null;
		
	}
	
}

