package at.fhj.msd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SimpleDrinkTest {

  @Test
  public void testConstructorAndAttributes() {
    Liquid liquid = new Liquid("Juice", 1.0, 0.0);
    SimpleDrink drink = new SimpleDrink("Orange Juice", liquid);

    assertEquals("Orange Juice", drink.getName());
    assertEquals(1.0, drink.getVolume());
    assertEquals(0.0, drink.getAlcoholPercent());
  }

  @Test
  public void testIsAlcoholicTrue() {
    Liquid whiskey = new Liquid("Whiskey", 0.7, 40.0);
    SimpleDrink drink = new SimpleDrink("Whiskey", whiskey);

    assertTrue(drink.isAlcoholic());
  }

  @Test
  public void testIsAlcoholicFalse() {
    Liquid water = new Liquid("Water", 2.0, 0.0);
    SimpleDrink drink = new SimpleDrink("Water", water);

    assertFalse(drink.isAlcoholic());
  }

  @Test
  public void testGetVolume() {
    Liquid milk = new Liquid("Milk", 1.5, 0.0);
    SimpleDrink drink = new SimpleDrink("Milk", milk);

    assertEquals(1.5, drink.getVolume());
  }

  @Test
  public void testGetAlcoholPercent() {
    Liquid cocktailLiquid = new Liquid("Cocktail Mix", 1.0, 15.0);
    SimpleDrink drink = new SimpleDrink("Cocktail", cocktailLiquid);

    assertEquals(15.0, drink.getAlcoholPercent());
  }
}
