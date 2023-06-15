package week06;

public class army {
    public static void main(String[] args) {
        eligibleToJoinTheArmy(16,false,false);
    }

    public static void eligibleToJoinTheArmy(int age, boolean hasDiploma, boolean isACitizen){

        if((age >= 18 && age <= 35) && hasDiploma== true && isACitizen == true ){
            System.out.println("You are qualified to join the Army");
        }else {
            System.out.println("You are NOT qualified to join the Army:");
        }
        if(age > 35){
            System.out.println( age + " is more than our maximum age");
        }else if(age < 18 ){

            System.out.println( age +" is less than our minimum age");
        }
        if(!hasDiploma){
            System.out.println("You must have a high school diploma");
        }
        if(!isACitizen){
            System.out.println("You must be a citizen");
        }
    }
}
/*
T1Army [methods, conditional]

    Create a method that will determine if you are eligible to join the army. It will be a void method that accepts 3 parameters: age, has a high school diploma, and is a citizen

    to be eligible to join you must be between the age of 18-35, have a diploma, and must be a citizen
        if you are eligible print: You are qualified to join the Army

        if you are not eligible print all the reasons why you cannot join
            (it can be any combination of conditions, even all of them could not be met)

    Ex:
        (25, true, true) -> You are qualified to join the Army

        (45, true, true) -> You are NOT qualified to join the Army:
                            45 is more than our maximum age

        (16, false, false) ->   You are NOT qualified to join the Army:
                                16 is less than our minimum age
                                You must have a high school diploma
                                You must be a citizen

 */
