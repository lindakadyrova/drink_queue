package at.fhj.msd;

import java.util.List;

/**
 * Represents a Cocktail which is a mix of multiple Liquids.
 */
public class Cocktail extends Drink {

  private List<Liquid> ingredients;

  /**
   * Creates a new Cocktail with a given name and a list of ingredients.
   *
   * @param name the name of the cocktail
   * @param ingredients the list of liquids used in the cocktail
   */
  public Cocktail(String name, List<Liquid> ingredients) {
    super(name);
    this.ingredients = ingredients;
  }

  /**
   * Calculates the total volume of the cocktail by summing the volumes of all ingredients.
   *
   * @return the total volume of the cocktail
   */
  @Override
  public double getVolume() {
    return ingredients.stream()
        .mapToDouble(Liquid::getVolume)
        .sum();
  }

  /**
   * Calculates the alcohol percentage of the cocktail based on its ingredients.
   * If the total volume is zero, returns 0.0.
   *
   * @return the alcohol percentage of the cocktail
   */
  @Override
  public double getAlcoholPercent() {
    double totalVolume = getVolume();
    if (totalVolume == 0)
      return 0.0;

    double alcoholAmount = ingredients.stream()
        .mapToDouble(liquid -> liquid.getVolume() * (liquid.getAlcoholPercent() / 100.0))
        .sum();

    return (alcoholAmount / totalVolume) * 100.0;
  }

  /**
   * Checks if the cocktail contains any alcoholic ingredients.
   *
   * @return true if the cocktail is alcoholic, false otherwise
   */
  @Override
  public boolean isAlcoholic() {
    return ingredients.stream()
        .anyMatch(liquid -> liquid.getAlcoholPercent() > 0.0);
  }

  /**
   * Returns the list of ingredients used in the cocktail.
   *
   * @return the list of ingredients
   */
  public List<Liquid> getIngredients() {
    return ingredients;
  }

  /**
   * Sets the list of ingredients for the cocktail.
   *
   * @param ingredients the new list of liquids
   */
  public void setIngredients(List<Liquid> ingredients) {
    this.ingredients = ingredients;
  }
}
