
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class LunchPicker {
    private List<Place> places; // Seznam míst

    public LunchPicker() {
        places = new ArrayList<>();
        // Zde můžete inicializovat databázi míst
        // Přidání míst do seznamu
        places.add(new Place("Restaurace U Dvou Koček", "Restaurace"));
        places.add(new Place("Pivnice U Tří Švihlí", "Pivnice"));
        places.add(new Place("Fastfood BurgerTime", "Fastfood"));
        // Pokračovat přidáním dalších míst
    }

    public Place pickRandomPlace() {  
        Random random = new Random();
        int index = random.nextInt(places.size()); // Náhodný výběr indexu z databáze míst
        return places.get(index); // Návrat náhodně vybraného místa
    }

    public static void main(String[] args) {
        LunchPicker lunchPicker = new LunchPicker(); // Vytvoření instance LunchPicker
        Place chosenPlace = lunchPicker.pickRandomPlace(); // Výběr náhodného místa
        System.out.println("I recommend going to: " + chosenPlace); // Výpis doporučeného místa
    }
}