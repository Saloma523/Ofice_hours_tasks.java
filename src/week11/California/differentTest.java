package week11.California;

import week11.Virginia.House;

public class differentTest {
    public static void main(String[] args) {

        House obj = new House();

        obj.address = ""; // in different package only public is accessible
        //obj.price = 100_000;
       // obj.neighborhoodName = "";
       // obj.ownerName = "";
    }
}
