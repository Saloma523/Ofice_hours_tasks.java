package week11;

public class Country {
    public static String planet;
    public static double worldPopulation;// represents in billions
    public static double cp2Level;// represent in ppm

    String name;
    double population;
    String continent;

    static {// we also can initialize the variables when we declare them

        planet = "Earth";
        worldPopulation = 7.88;
        cp2Level = 417.83;

    }

    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    public static void countryInfo(){

        System.out.println(Country.planet);
        System.out.println(Country.worldPopulation);
        System.out.println(Country.cp2Level);
    }

    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                '}';
    }
}
/*

Country [static, instance, class, object]

    Create a class Country
    define these static variables:
        planet - Earth
        world population - 7.88 billion - represent as a double 7.88 -
        world co2 level - 417.83 - represent as a double - the unit is ppm (parts per million)

    define these instance variables:
         name, population, continent

    create a static block to initialize the static variables

    create a constructor to initialize the instance variables

    create a different class to test the Country objects and static variables

 */
