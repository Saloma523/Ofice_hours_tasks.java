package week04;

public class Week04T {
    /*---------------------------------------------------------------------------------------

T1Parking [ternary, relational]
	create a program that will define a time variable. Use a 24 hour format. Based on the given time determine the cost of parking in the city
		If the time is between 6-12:
			fee: 7.50
		if the time is between 13 - 23 or 0 - 5
			fee is 15
----------------------------------------------------------------------------------------
T2BakingContest [multibranch, logical, arithmetic, relational]
You are in a baking contest and tour cookies will be rated by 3 judges.
	Create a program that will define 3 scores for your cookies. Calculate the average score you earned.
	Then also define two other people's final score and determine which place you earned int the baking contest
		you can earn either: First place, Second place, or Third place
		Ex:
			input:
				your score = 8.5, 7.9, 8.3
				other people score = 8.5 and 7.9
				output: Congratulations you earned Second place with a score of: 8.2
					-> don't worry about decimal formatting
----------------------------------------------------------------------------------------
T3Habitat [switch, variables]
	Create a program that will define a String variable of the habitat you want information on. We should get back information about the animals that can be found in those habitats
	use the following data and make creative messages for the outputs
		habitat - animals
		grasslands - goats, bison, badgers, coyotes
		jungle	- snakes, tigers, gorillas, rhinos, toucans
		city	- dogs, cats, gulls, squirrels
		safari - lion, hippo, giraffe, zebras, elephants
		Ex:
			input:
				jungle
			output:
				In the jungle you will be able to find: snakes, tigers, gorillas, rhinos, toucans
----------------------------------------------------------------------------------------
T4BMI [nested if, multibranch, relational, arithmetic]
	Create a program that will calculate your BMI. Declare and assign the values for a mass (in kilograms) and height (in meters)
	first check if the given values are valid
		- the kilograms needs to be more than 40 and less than 185

		- the height also needs to be more than 120 and less than 250
		- the height also needs to be more than 1.2 and less than 2.5

		-> if either of those is not met print: "Sorry we cannot calculate the BMI with these metrics"

	if the given values are valid then calculate and print the BMI using the following formula
		BMI = mass / height^2
	use these ranges for BMI for print the result
		Less than 18.5 — Underweight
		From 18.5 to 24.9 — Normal weight
		From 25 to 29.9 — Overweight
		More than or equal to 30 — Obese
	sample data to use:
		mass = 64
		height = 1.65
		-> Normal weight
		mass = 90
		height = 1.8
		-> Overweight
		mass = 50
		height = 1.7
		-> Underweight
----------------------------------------------------------------------------------------
T5HouseMarket [switch, variables]
You are buying a new house and need to collect information about the houses in a specific neighborhoods.
	Create a program that will declare and define the neighborhood name and based on the name return a report of the houses in that area. The report should include this information: the average house price, rating of school districts near by(out of 5), if it is a gated community or not, and if pets are allowed
	print the final report in this format:
		$the houses in the $neighborhood_name on average value at $average_price. This neighborhood $is_gated_or_not and the rating of the school distracts near by is $school_rating out of 5. For the pet owners you $are_or_not in luck because pets are $allowed_or_not_allowed
		Note: for simple use you can print true or false in the gated and pets parts, but for a challenge try to print the message with as many dynamic parts as possible
	Data to use:
		name - Hills
		average price - 89,000
		rating - 4.0
*/
}
