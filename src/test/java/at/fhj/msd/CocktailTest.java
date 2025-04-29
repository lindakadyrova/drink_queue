package at.fhj.msd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;
import java.util.List;

class CocktailTest {

    @Test
    void testGetVolume() {
        // Arrange – Korrekte Reihenfolge: name, volume, alcohol
        Liquid water = new Liquid("Water", 150.0, 0.0);
        Liquid juice = new Liquid("Juice", 100.0, 0.0);

        List<Liquid> ingredients = Arrays.asList(water, juice);
        Cocktail cocktail = new Cocktail("CoolDrink", ingredients);

        // Act
        double result = cocktail.getVolume();

        // Assert
        assertEquals(250.0, result);
    }

    @Test
    void testGetAlcoholPercent(){
        Liquid rum = new Liquid("Rum", 50.0, 40.0);
        Liquid cola = new Liquid("Cola", 150.0, 0.0);

        List<Liquid> ingredients = Arrays.asList(rum, cola);
        Cocktail cocktail = new Cocktail("CoolDrink", ingredients);

        double result = cocktail.getAlcoholPercent();

        assertEquals(10, result);

    }

    @Test
    void testGetZeroAlcoholPercent(){
         Liquid water = new Liquid("Water", 150.0, 0.0);
         Liquid juice = new Liquid("Juice", 100.0, 0.0);
 
         List<Liquid> ingredients = Arrays.asList(water, juice);
         Cocktail cocktail = new Cocktail("CoolDrink", ingredients);
 
         double result = cocktail.getAlcoholPercent();
 
         assertEquals(0.0, result);
     }

     @Test
     void testIsAlcoholic_true(){
        Liquid rum = new Liquid("Rum", 50.0, 40.0);
        Liquid cola = new Liquid("Cola", 150.0, 0.0);

        List<Liquid> ingredients = Arrays.asList(rum, cola);
        Cocktail cocktail = new Cocktail("CoolDrink", ingredients);

        assertTrue(cocktail.isAlcoholic());

      
     }

     @Test
     void testIsAlcoholic_false(){
        Liquid water = new Liquid("Water", 150.0, 0.0);
        Liquid juice = new Liquid("Juice", 100.0, 0.0);

        List<Liquid> ingredients = Arrays.asList(water, juice);
        Cocktail cocktail = new Cocktail("CoolDrink", ingredients);

        assertFalse(cocktail.isAlcoholic());

    }

    @Test
    void testGetIngredients() {
    
        Liquid gin = new Liquid("Gin", 40.0, 37.5);
        Liquid tonic = new Liquid("Tonic", 100.0, 0.0);
        List<Liquid> ingredients = Arrays.asList(gin, tonic);
        Cocktail cocktail = new Cocktail("Gin Tonic", ingredients);

        List<Liquid> result = cocktail.getIngredients();

        assertEquals(2, result.size());
       
    }

    @Test
    void testSetIngredients() {
        Cocktail cocktail = new Cocktail("Mojito", Arrays.asList());

        Liquid rum = new Liquid("Rum", 50.0, 40.0);
        Liquid lime = new Liquid("Lime", 30.0, 0.0);
        
        cocktail.setIngredients(Arrays.asList(rum, lime));

        assertEquals(2, cocktail.getIngredients().size());
        assertTrue(cocktail.getIngredients().contains(rum));
        assertTrue(cocktail.getIngredients().contains(lime));
    }
}

