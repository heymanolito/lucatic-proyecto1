package modelo;

/**
 * Nombre del enumerado: Plataforma. Descripcion: Enumerado que contiene las plataformas
 * de los juegos y metodos para trabajar con ellos. Fecha: 29/12/21.
 * 
 * @version LucaSteam1.0.0
 * @author Grupo1 Natalia Borrego Lopez
 */

public enum Plataforma {

	_2600(1), _3DO(2), _3DS(3), DC(4), DS(5), GB(6), GBA(7), GC(8), GEN(9), GG(10), N64(11), NES(12), NG(13), PC(14),
	PCFX(15), PS(16), PS2(17), PS3(18), PS4(19), PSP(20), PSV(21), SAT(22), SCD(23), SNES(24), TG16(25), Wii(26),
	WiiU(27), WS(28), X360(29), XB(30), XOne(31);

	private final int id;
	private static final int size = Plataforma.values().length;

	/**
	 * Constructor vacio del enumerado Plataforma.
	 * 
	 * @param id
	 */
	
	Plataforma(int id) {
		this.id = id;
	}

	/**
	 * Getters
	 */
	
	public int getId() {
		return id;
	}

	public static int getSize() {
		return size;
	}

	/**
	 * Metodo que devuelve la Plataforma escrito como String.
	 * 
	 * @param plataforma String de la plataforma que se quiere obtener
	 * @return Plataforma obtenido de convertir el String a Plataforma
	 */
	
	public static Plataforma escogePlataforma(String str) {
		return switch (str) {
		case "3DS" -> _3DS;
		case "3DO" -> _3DO;
		case "2600" -> _2600;
		default -> Plataforma.valueOf(str);
		};
	}

	/**
	 * Metodo que devuelve una plataforma en funcion de su ID.
	 * 
	 * @return Plataforma
	 */

	public static Plataforma dimePlataforma(int id) {
		// System.out.println("Para el id: " + id);
		switch (id) {
		case 1:
			return Plataforma._2600;
		case 2:
			return Plataforma._3DO;
		case 3:
			return Plataforma._3DS;
		case 4:
			return Plataforma.DC;
		case 5:
			return Plataforma.DS;
		case 6:
			return Plataforma.GB;
		case 7:
			return Plataforma.GBA;
		case 8:
			return Plataforma.GC;
		case 9:
			return Plataforma.GEN;
		case 10:
			return Plataforma.GG;
		case 11:
			return Plataforma.N64;
		case 12:
			return Plataforma.NES;
		case 13:
			return Plataforma.NG;
		case 14:
			return Plataforma.PC;
		case 15:
			return Plataforma.PCFX;
		case 16:
			return Plataforma.PS;
		case 17:
			return Plataforma.PS2;
		case 18:
			return Plataforma.PS3;
		case 19:
			return Plataforma.PS4;
		case 20:
			return Plataforma.PSP;
		case 21:
			return Plataforma.PSV;
		case 22:
			return Plataforma.SAT;
		case 23:
			return Plataforma.SCD;
		case 24:
			return Plataforma.SNES;
		case 25:
			return Plataforma.TG16;
		case 26:
			return Plataforma.Wii;
		case 27:
			return Plataforma.WiiU;
		case 28:
			return Plataforma.WS;
		case 29:
			return Plataforma.X360;
		case 30:
			return Plataforma.XB;
		case 31:
			return Plataforma.XOne;
		}
		return null;
	}

	/**
	 * Metodo que devuelve una lista de de todos las plataformas disponibles.
	 * 
	 * @return contad Contador para testear.
	 */

	public static int plataformasDisponibles() {
		StringBuilder sb;
		int contad = 0;
		for (Plataforma plat : Plataforma.values()) {
			sb = new StringBuilder();
			sb.append("(").append(plat.id).append(")").append(plat).append("|");
			contad++;
			System.out.println(sb);
		}
		return contad;
	}

}
