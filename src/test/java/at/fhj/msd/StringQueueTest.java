package at.fhj.msd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.NoSuchElementException;

public class StringQueueTest {

  @Test
  public void testConstructor() {
    StringQueue queue = new StringQueue(10); // Constructor with maxSize = 10
    assertNotNull(queue); // Verify the queue is initialized
  }

  @Test
  public void testOffer() {
    StringQueue queue = new StringQueue(2); // Set maxSize to 2
    assertTrue(queue.offer("Element1")); // Adding first element
    assertTrue(queue.offer("Element2")); // Adding second element
    assertFalse(queue.offer("Element3")); // Queue should not accept a third element
  }

  @Test
  public void testPoll() {
    StringQueue queue = new StringQueue(5); // Set maxSize to 5
    queue.offer("First");
    queue.offer("Second");

    assertEquals("First", queue.poll()); // Poll removes and returns the first element
    assertEquals("Second", queue.poll()); // Poll removes and returns the second element
    assertNull(queue.poll()); // Poll returns null if queue is empty
  }

  @Test
  public void testRemove() {
    StringQueue queue = new StringQueue(5); // Set maxSize to 5
    queue.offer("First");

    assertEquals("First", queue.remove()); // Remove removes the first element

    Exception exception = assertThrows(NoSuchElementException.class, () -> {
      queue.remove(); // Remove throws exception when queue is empty
    });
    assertEquals("there's no element any more", exception.getMessage());
  }

  @Test
  public void testPeek() {
    StringQueue queue = new StringQueue(5); // Set maxSize to 5

    assertNull(queue.peek()); // Peek returns null for an empty queue

    queue.offer("PeekElement");
    assertEquals("PeekElement", queue.peek()); // Peek returns the first element without removing it
    assertEquals("PeekElement", queue.peek()); // Confirming element is not removed
  }

  @Test
  public void testElement() {
    StringQueue queue = new StringQueue(5); // Set maxSize to 5

    Exception exception = assertThrows(NoSuchElementException.class, () -> {
      queue.element(); // Element throws exception for empty queue
    });
    assertEquals("there's no element any more", exception.getMessage());

    queue.offer("Element1");
    assertEquals("Element1", queue.element()); // Element returns the first element without removing it
  }
}
