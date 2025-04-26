package at.fhj.msd;

/**
 * Interface for a basic queue structure.
 * Defines methods to add, remove, and inspect elements in the queue.
 */
public interface IQueue {

  /**
   * Attempts to add an object to the queue.
   *
   * @param obj the object to add
   * @return true if the object was added successfully, false otherwise
   */
  public abstract boolean offer(String obj);

  /**
   * Retrieves and removes the first element of the queue,
   * or returns null if the queue is empty.
   *
   * @return the first element, or null if the queue is empty
   */
  public abstract String poll();

  /**
   * Retrieves and removes the first element of the queue.
   *
   * @return the first element of the queue
   * @throws java.util.NoSuchElementException if the queue is empty
   */
  public abstract String remove();

  /**
   * Retrieves, but does not remove, the first element of the queue,
   * or returns null if the queue is empty.
   *
   * @return the first element, or null if the queue is empty
   */
  public abstract String peek();

  /**
   * Retrieves, but does not remove, the first element of the queue.
   *
   * @return the first element of the queue
   * @throws java.util.NoSuchElementException if the queue is empty
   */
  public abstract String element();
}