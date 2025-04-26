package at.fhj.msd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LiquidTest {

  @Test
  public void testConstructor() {
    Liquid water = new Liquid("Water", 1.0, 0.0);
    assertEquals("Water", water.getName());
    assertEquals(1.0, water.getVolume());
    assertEquals(0.0, water.getAlcoholPercent());
  }

  @Test
  public void testSettersAndGetters() {
    Liquid juice = new Liquid("Juice", 0.5, 0.0);
    juice.setName("Orange Juice");
    juice.setVolume(1.0);
    juice.setAlcoholPercent(0.0);

    assertEquals("Orange Juice", juice.getName());
    assertEquals(1.0, juice.getVolume());
    assertEquals(0.0, juice.getAlcoholPercent());
  }

  @Test
  public void testNegativeVolume() {
    Liquid milk = new Liquid("Milk", -1.0, 0.0); // Negative volume is allowed based on the current code
    assertEquals(-1.0, milk.getVolume());
  }

  @Test
  public void testInvalidAlcoholPercent() {
    Liquid whiskey = new Liquid("Whiskey", 0.7, 120.0); // Invalid alcohol percent is allowed
    assertEquals(120.0, whiskey.getAlcoholPercent());
  }
}
