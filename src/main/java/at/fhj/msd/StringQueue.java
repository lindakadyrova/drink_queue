package at.fhj.msd;
 
import static org.junit.jupiter.api.Assertions.*;
 
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
 
// there's some Bugs included, try to debug the code and fix the Bugs
// there are different Bugs, wrong implementation, typos, ...
// write Test-Cases (read Queue Interface for understanding methods) and use Debugging possibilies of your IDE
 
public class StringQueue implements IQueue {
 
  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;
 
  public StringQueue(int maxsize) {
    this.maxSize = maxsize;
  }
 
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize)
      elements.add(obj);
    else
      return false;
 
    return true;
  }
 
  @Override
  public String poll() {
    if (elements.size() > 0) {
      return elements.remove(0);
    }
    return null;
  }
 
  @Override
  public String remove() {
    String element = poll(); // Fetch the first element using poll()
    if (element == null) { // Check if the queue is empty
      throw new NoSuchElementException("there's no element any more");
    }
    return element; // Return the removed element
  }
 
  @Override
  public String peek() {
    String element;
    if (elements.size() > 0)
      element = elements.get(0);
    else
      element = null;
 
    return element;
  }
 
  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");
 
    return element;
  }
 
}
 