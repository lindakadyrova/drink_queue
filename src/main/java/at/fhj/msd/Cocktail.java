package at.fhj.msd;

import java.util.List;

public class Cocktail extends Drink {

  private List<Liquid> ingredients;

  public Cocktail(String name, List<Liquid> ingredients) {
    super(name);
    this.ingredients = ingredients;
  }

  @Override
  public double getVolume() {
    return ingredients.stream()
        .mapToDouble(Liquid::getVolume)
        .sum();
  }

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

  @Override
  public boolean isAlcoholic() {
    return ingredients.stream()
        .anyMatch(liquid -> liquid.getAlcoholPercent() > 0.0);
  }

  public List<Liquid> getIngredients() {
    return ingredients;
  }

  public void setIngredients(List<Liquid> ingredients) {
    this.ingredients = ingredients;
  }
}
