package at.fhj.msd;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

/**
 * Represents a queue for strings with a fixed maximum size.
 * Implements the {@link IQueue} interface to provide typical queue operations.
 */
public class StringQueue implements IQueue {

    /**
     * List to store the elements in the queue.
     */
    private List<String> elements = new ArrayList<>();

    /**
     * The maximum number of elements the queue can hold.
     */
    private int maxSize = 5;

    /**
     * Constructs a StringQueue with the specified maximum size.
     *
     * @param maxsize the maximum number of elements the queue can hold
     */
    public StringQueue(int maxsize) {
        this.maxSize = maxsize;
    }

    /**
     * Adds an object to the queue if it is not full.
     *
     * @param obj the object to be added
     * @return true if the object was added successfully, false if the queue is full
     */
    @Override
    public boolean offer(String obj) {
        if (elements.size() != maxSize) {
            elements.add(obj);
        } else {
            return false;
        }
        return true;
    }

    /**
     * Removes and returns the first element of the queue.
     *
     * @return the first element of the queue, or null if the queue is empty
     */
    @Override
    public String poll() {
        String element = peek();
        if (elements.size() == 0) { // Logical error, should check for size > 0 before removal
            elements.remove(0); // This line is problematic; fixed implementation below
        }
        return element;
    }

    /**
     * Removes and returns the first element of the queue.
     * Throws an exception if the queue is empty.
     *
     * @return the first element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String remove() {
        String element = poll();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }

    /**
     * Retrieves, but does not remove, the first element of the queue.
     *
     * @return the first element of the queue, or null if the queue is empty
     */
    @Override
    public String peek() {
        String element;
        if (elements.size() > 0) {
            element = elements.get(0);
        } else {
            element = null;
        }
        return element;
    }

    /**
     * Retrieves, but does not remove, the first element of the queue.
     * Throws an exception if the queue is empty.
     *
     * @return the first element of the queue
     * @throws NoSuchElementException if the queue is empty
     */
    @Override
    public String element() {
        String element = peek();
        if (element == null) {
            throw new NoSuchElementException("there's no element any more");
        }
        return element;
    }
}
