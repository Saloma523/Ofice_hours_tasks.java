package week11.Virginia;

public class House {
    public String address;
    protected double price;
    String neighborhoodName;
    private String ownerName;

    public static void main(String[] args) {

        House obj = new House();

        obj.address = "";
        obj.price = 100_000;
        obj.neighborhoodName = "";
        obj.ownerName = "";
    }
}
/*
House [access modifiers, packages]

    Create a package virginia
    Create a class House
    define these instance variables with specific access modifiers:
        public - address
        protected - price
        default - neighborhood name
        private - owner name

    Create a class in the same package - virginia and test which access modifiers are accessible from the objects

    Create a different package california
    Create a class in the different package california and test which access modifiers are accessible from the objects


 */
