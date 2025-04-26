package at.fhj.msd;
 
import java.util.ArrayList;
import java.util.List; 
 
public class DrinkQueue {
    private List<Drink> elements = new ArrayList<>();
    private final int maxSize;
 
    public DrinkQueue(int maxSize) {
        if (maxSize <= 0) {
            throw new IllegalArgumentException("Maximum size must be > 0");
        }
        this.maxSize = maxSize;
    }
 
    public int size() {
        return elements.size();
    }
 
    public boolean isEmpty() {
        return elements.isEmpty();
    }
 
    public boolean isFull() {
        return elements.size() >= maxSize;
    }
}