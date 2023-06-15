package week04;

public class Parking {
    public static void main(String[] args) {
        int time = 7;
        String result = (time >= 0 && time <= 23)? (time >= 6 && time <= 12)? "fee: 7.50": "fee is 15" : " invalid time";
        System.out.println(result);

        System.out.println("-------------------------------");
        int time2 = 7;
        double fee;
        if(time >= 6 && time <= 12){
            fee = 7.50;
        }else{// (time >= 13 && time <= 23) || (time >=0 && time <= 5)
            fee = 15;
        }// I can do else because im assuming the time is between 0 - 23
        System.out.println(fee);

        System.out.println("-----------------------");
        int time3 = 7;

        double fee3 = time3 >= 6 && time3 >= 12 ? 7.50 : 15;
        System.out.println("Fee for parking is: " + fee3);
    }
    /*
    T1Parking [ternary, relational]
	create a program that will define a time variable. Use a 24-hour format. Based on the given time determine the cost of parking in the city
		If the time is between 6-12:
			fee: 7.50
		if the time is between 13 - 23 or 0 - 5
			fee is 15

     */
}
