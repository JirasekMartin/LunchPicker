
public class Place {    //třída Place
    private String name; // Jméno místa atributu
    private String type; // Typ místa atributu (např. Restaurace, Pivnice, Fastfood)

    public Place(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return name + " (" + type + ")";
    }
}