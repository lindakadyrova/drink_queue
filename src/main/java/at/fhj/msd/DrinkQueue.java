package at.fhj.msd;
 
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
 
 
public class DrinkQueue {
    private List<Drink> elements = new ArrayList<>();
    private final int maxSize;
 
    public DrinkQueue(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Maximalgröße muss > 0 sein");
        }
        this.maxSize = maxSize;
    }
 
    public boolean offer(Drink drink) {
        if (drink == null) {
            throw new IllegalArgumentException("Drink darf nicht null sein");
        }
        if (elements.size() >= maxSize) {
            return false;
        }
        elements.add(drink);
        return true;
    }
 
    public Drink poll() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("Warteschlange ist leer");
        }
        return elements.remove(0);
    }
 
    public Drink peek() {
        if (elements.isEmpty()) {
            throw new NoSuchElementException("Warteschlange ist leer");
        }
        return elements.get(0);
    }
}