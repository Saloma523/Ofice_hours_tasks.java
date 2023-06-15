package week12.candyTask;

public class Candy {

    static int totalNumberInWorld = 500000;
    static String largestConsumer = "United States";

    String brand;
    int quantity;
    boolean containPeanut;

    public Candy(int quantity, boolean containPeanut) {
        this.brand = getClass().getSimpleName();
        this.quantity = quantity;
        this.containPeanut = containPeanut;
    }

    @Override
    public String toString() {
        return "I have " + quantity + " " + brand + " which " + (containPeanut ? "has " : " doesnt have") + "peanuts";
    }
}
/*
Candy [inheritance, constructor, static]

    Create a class Candy

        declare these instance variables:
            - brand (String), quantity (int), contains peanuts (boolean)
                make brand and contains peanuts

        declare a static variables:
            - number of total candy in the world: 500,000
            - country with largest candy consumption: United States

        create a constructor to set all instance variables

        override toString

    Create a class Take5
        inherits Candy class
        make Take5

        create a constructor that calls the parent constructor

    Create a class Twix
        inherits Candy class
        make Twix

        create a constructor that calls the parent constructor

    Create a class HersheyBar
        inherits Candy class

        create a constructor that calls the parent constructor

    Create a class HersheyKiss
        inherits HersheyBar

        create a constructor that calls the parent constructor

    Create a class CandyFactory
    create a main method
    create the Candy objects to test all the information

-----------------------------------------------------
 */