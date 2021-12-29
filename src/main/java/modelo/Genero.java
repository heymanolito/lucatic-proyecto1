package modelo;

import excepciones.GeneroException;
public enum Genero {

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
    private static final int size = Genero.values().length;

   

    private Genero (int id) {
    	
		this.id=id;

    }

    public int getId() {
        return id;
    }

    public static int getSize() {
        return size;
    }


    public static Genero escogeGenero(String str) {

        return switch (str) {
            case "Role-Playing" -> RolePlaying;
            default -> Genero.valueOf(str);
        };
    }

    public static void generosDisponibles() {
        StringBuilder sb;
        for ( Genero gen : Genero.values() ) {
            sb = new StringBuilder();
            sb.append("(").
                    append(gen.id).
                    append(")").
                    append(gen).
                    append("|");
            System.out.println(sb);
        }
    }

    public static Genero dimeGenero(int id) {

        return switch (id) {
            case 1 -> Genero.Action;
            case 2 -> Genero.Adventure;
            case 3 -> Genero.Fighting;
            case 4 -> Genero.Misc;
            case 5 -> Genero.Platform;
            case 6 -> Genero.Puzzle;
            case 7 -> Genero.Racing;
            case 8 -> Genero.RolePlaying;
            case 9 -> Genero.Shooter;
            case 10 -> Genero.Simulation;
            case 11 -> Genero.Sports;
            case 12 -> Genero.Strategy;
            default -> null;
        };
    }

}
