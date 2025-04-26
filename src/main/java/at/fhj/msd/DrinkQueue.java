package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * A queue to store Drink objects with a maximum size limit.
 */
public class DrinkQueue {
  private List<Drink> elements = new ArrayList<>();
  private final int maxSize;

  /**
   * Creates a new DrinkQueue with a specified maximum size.
   *
   * @param maxSize the maximum number of drinks the queue can hold
   * @throws IllegalArgumentException if maxSize is less than or equal to 0
   */
  public DrinkQueue(int maxSize) {
    if (maxSize <= 0) {
      throw new IllegalArgumentException("Maximum size must be > 0");
    }
    this.maxSize = maxSize;
  }

  /**
   * Returns the number of drinks currently in the queue.
   *
   * @return the current size of the queue
   */
  public int size() {
    return elements.size();
  }

  /**
   * Checks if the queue is empty.
   *
   * @return true if the queue is empty, otherwise false
   */
  public boolean isEmpty() {
    return elements.isEmpty();
  }

  /**
   * Checks if the queue has reached its maximum capacity.
   *
   * @return true if the queue is full, otherwise false
   */
  public boolean isFull() {
    return elements.size() >= maxSize;
  }

  /**
   * Adds a drink to the queue if it is not full.
   *
   * @param drink the drink to add
   * @return true if the drink was added, false if the queue is full
   * @throws IllegalArgumentException if the drink is null
   */
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

  /**
   * Removes and returns the first drink in the queue.
   *
   * @return the first drink in the queue
   * @throws NoSuchElementException if the queue is empty
   */
  public Drink poll() {
    if (elements.isEmpty()) {
      throw new NoSuchElementException("Queue is empty");
    }
    return elements.remove(0);
  }

  /**
   * Returns the first drink in the queue without removing it.
   *
   * @return the first drink in the queue
   * @throws NoSuchElementException if the queue is empty
   */
  public Drink peek() {
    if (elements.isEmpty()) {
      throw new NoSuchElementException("Queue is empty");
    }
    return elements.get(0);
  }
}