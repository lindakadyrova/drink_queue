package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

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

  public boolean offer(Drink drink) {
    if (drink == null) {
      throw new IllegalArgumentException("Drink must not be zero");
    }
    if (elements.size() >= maxSize) {
      return false;
    }
    elements.add(drink);
    return true;
  }

  public Drink poll() {
    if (elements.isEmpty()) {
      throw new NoSuchElementException("Queue is empty");
    }
    return elements.remove(0);
  }

  public Drink peek() {
    if (elements.isEmpty()) {
      throw new NoSuchElementException("Queue is empty");
    }
    return elements.get(0);
  }
}