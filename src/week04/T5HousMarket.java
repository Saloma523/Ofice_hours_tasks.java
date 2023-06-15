package week04;

public class T5HousMarket {
    public static void main(String[] args) {
        String neighborhoodName = "Hills";
        int averagePrice =0;
        double rating = 0;
        boolean  gated = true;
        boolean  allowPets = true;


        switch(neighborhoodName) {
            case "Hills":
                averagePrice = 89_000;
                rating = 4.0;
                gated = false;
                allowPets = true;
                break;
            case "Oaks":
                averagePrice = 75_000;
                rating = 3.0;
                gated = false;
                allowPets = true;
                break;
            case "Highland":
                averagePrice = 150_000;
                rating = 4.5;
                gated = true;
                allowPets = false;
                break;
            case "Canyon":
                averagePrice = 201_000;
                rating = 4.8;
                gated = true;
                allowPets = true;

        }
        if(averagePrice != 0){
        String report;
        report = "the houses in the" + neighborhoodName + " on average value at $" + averagePrice + ". This neighborhood is " + (gated? " is gated" : " not gated") + " and the rating of the school distracts near by is " + rating + " out of 5. For the pet owners  " +  (allowPets? "you are in luck because pets are allowed" : "sorry pets are not allowed");
        System.out.println(report);
        }else{
            System.out.println("no data for " + neighborhoodName);
        }




    }

}
/*
T5HouseMarket [switch, variables]

You are buying a new house and need to collect information about the houses in a specific neighborhoods.

	Create a program that will declare and define the neighborhood name and based on the name return a report of the houses in that area. The report should include this information: the average house price, rating of school districts nearby(out of 5), if it is a gated community or not, and if pets are allowed

	print the final report in this format:
		$the houses in the $neighborhood_name on average value at $average_price. This neighborhood $is_gated_or_not and the rating of the school distracts near by is $school_rating out of 5. For the pet owners you $are_or_not in luck because pets are $allowed_or_not_allowed

		Note: for simple use you can print true or false in the gated and pets parts, but for a challenge try to print the message with as many dynamic parts as possible

	Data to use:

		name - Hills
		average price - 89,000
		rating - 4.0
		gated - no
		allow pets - yes

		name - Oaks
		average price - 75,000
		rating - 3.5
		gated - no
		allow pets - yes

		name - Highland
		average price - 150,000
		rating - 4.5
		gated - yes
		allow pets - no

		name - Canyon
		average price - 201,000
		rating - 4.8
		gated - yes
		allow pets - yes

 */
