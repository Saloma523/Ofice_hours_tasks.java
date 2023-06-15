package week11;

public class useCountry {
    public static void main(String[] args) {

        System.out.println(Country.planet);
        System.out.println(Country.worldPopulation);
        System.out.println(Country.cp2Level);


        Country.countryInfo();

       // Country.name; // name is instance, so we can not access through the class only through object

        Country country1 = new Country("US", 350,"north america");

        System.out.println(country1);
    }


}
