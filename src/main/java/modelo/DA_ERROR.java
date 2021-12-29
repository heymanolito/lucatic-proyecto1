package modelo;

public enum DA_ERROR {

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
    private final int size = DA_ERROR.values().length;

    DA_ERROR(int id) {
        this.id = id;
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
        for( DA_ERROR gen: DA_ERROR.values()) {
            sb= new StringBuilder();
            sb.append("(").
                    append(gen.id).append(")").append(gen).append("|");
            System.out.println(sb);
        }

    }

    /**
     *
     * @param id int
     * @return genero de la id
     */
    public static DA_ERROR dimeGenero(int id) {
        System.out.println("Para el id: " + id);
        return switch (id) {
            case 1 -> DA_ERROR.Action;
            case 2 -> DA_ERROR.Adventure;
            case 3 -> DA_ERROR.Fighting;
            case 4 -> DA_ERROR.Misc;
            case 5 -> DA_ERROR.Platform;
            case 6 -> DA_ERROR.Puzzle;
            case 7 -> DA_ERROR.Racing;
            case 8 -> DA_ERROR.RolePlaying;
            case 9 -> DA_ERROR.Shooter;
            case 10 -> DA_ERROR.Simulation;
            case 11 -> DA_ERROR.Sports;
            case 12 -> DA_ERROR.Strategy;
            default -> null;
        };

    }

}
