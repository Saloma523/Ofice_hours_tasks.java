package week04;

public class T4BMI {
    public static void main(String[] args) {
        int mass = 80;
        double height = 1.2;
        double heightFeet = height / 30.48;

        double BMI = mass / heightFeet * heightFeet;
        String result = "";

        if (mass >= 40 && mass <= 185 || height >= 120 && height <= 250 || heightFeet >= 1.2 && heightFeet <= 2.5) {
            if (BMI < 18.5) {
                result = "Underweight";
            } else if (BMI >= 18.5 && BMI <= 24.9) {
                result = "Normal weight";
            } else if (BMI >= 25 && BMI <= 29.9) {
                result = "Overweight";
            } else {
                result = "Obese";
            }

        } else {
            result = "Sorry we cannot calculate the BMI with these metrics";

        }
        System.out.println(result);

        System.out.println("----------------------------");

        int mass2 = 70;
        double height2 = 1.3;


        if ((mass2 >= 40 && mass2 <= 185) && (height2 >= 1.2 && height2 <= 2.5)) {
            double BMI2 = mass2 / (height * height);
            String report = "My mass: " + mass2 + "kg | height: " + height2 + "m\nBMI: " + BMI + " ";
            if (BMI2 < 18.5) {
                report += "underweight";
            } else if (BMI >= 18.5 && BMI <= 24.9) {
                report += "Normal weight";
            } else if (BMI >= 25 && BMI <= 29.9) {
                report += "Overweight";
            } else {
                report += "Obese";
            }
            System.out.println(report);
        } else {
            System.out.println("Sorry we cannot calculate the BMI with these metrics");

        }
    } }
/*
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
 */
