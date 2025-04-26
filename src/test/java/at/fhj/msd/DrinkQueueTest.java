package at.fhj.msd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DrinkQueueTest {

    @Test
    void testGetVolume() {
        // Arrange
        Liquid water = new Liquid("Water", 0.5, 0.0); // 0.5L Wasser, 0% Alkohol
        SimpleDrink drink = new SimpleDrink("Water Drink", water);

        // Act
        double result = drink.getVolume();

        // Assert
        assertEquals(0.5, result, 0.0001); // Erwartet 0.5L als Volumen
    }

    @Test
    void testGetAlcoholPercent() {
        // Arrange
        Liquid rum = new Liquid("Rum", 0.2, 40.0); // 0.2L Rum, 40% Alkohol
        SimpleDrink drink = new SimpleDrink("Rum Drink", rum);

        // Act
        double result = drink.getAlcoholPercent();

        // Assert
        assertEquals(40.0, result, 0.0001); // Erwartet 40% Alkohol
    }

    @Test
    void testIsAlcoholic() {
        // Arrange
        Liquid rum = new Liquid("Rum", 0.2, 40.0); // 0.2L Rum, 40% Alkohol
        Liquid water = new Liquid("Water", 0.5, 0.0); // 0.5L Wasser, 0% Alkohol

        SimpleDrink alcoholicDrink = new SimpleDrink("Rum Drink", rum);
        SimpleDrink nonAlcoholicDrink = new SimpleDrink("Water Drink", water);

        // Act & Assert
        assertTrue(alcoholicDrink.isAlcoholic()); // Rum sollte alkoholisch sein
        assertFalse(nonAlcoholicDrink.isAlcoholic()); // Wasser sollte nicht alkoholisch sein
    }
}
