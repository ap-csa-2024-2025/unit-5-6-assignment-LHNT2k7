public class Dog
{
  private String breed;
  private double weight;
  private String name;
  private String color;

  public Dog(String iBreed, String iName, String iColor, double iWeight)
  {
    breed = iBreed;
    name = iname;
    color = iColor;
    if iWeight < 0
    {
      weight = 0;
    }
    else 
    {
      weight = iWeight;
    }
  }

  // Make setters
  public void setBreed(String iBreed)
  {
    breed = iBreed;
  }

  // Make getters
  public String getBreed()
  {
    return breed;
  }

  public void setWeight(double iBWeight)
  {
    weight = iWeight;
  }

  // Make getters
  public String getWeight()
  {
    return weight;
  }

  public void setname(String iName)
  {
    breed = iName;
  }

  // Make getters
  public String getName()
  {
    return name;
  }

  public void setColor(String iColor)
  {
    color = iColor;
  }

  // Make getters
  public String getColor()
  {
    return color;
  }

}