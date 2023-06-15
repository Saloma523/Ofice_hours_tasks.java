public class T2ParkingContest {
    public static void main(String[] args) {
        double score = 9.5, score2 = 9.4, score3 = 9.5;
        double averageScore = (score + score2 + score3)/3;
        double otherScore1 = 8.5;
        double otherScore2 = 7.5;
        String result = "";
        Boolean r1 =  averageScore > otherScore1 && averageScore  > otherScore2;
        boolean r2 = averageScore < otherScore1 || averageScore > otherScore2;
        boolean r3= !r1 && !r2;

        if(r1){
            result = "congratulation you earned first place with a score of:" + averageScore;
        }else if(r2){
            result = "congratulation you earned second place with a score of:" + averageScore;
        }else{
            result = "congratulation you earned third place with a score of:" + averageScore;
        }
        System.out.println(result);

        System.out.println("----------------------------");
        double judge1 = 9.5 , judge2 = 8.5, judge3 = 7.5;
        double myScore = (judge1 + judge2 + judge3 )/3;
        double person1= 8.5, person2 = 7.5 ;
        if(myScore > person1 && myScore > person2 ){

        }else if(myScore < person1 && myScore < person2){
            System.out.println("congratulation you earned first place with a score of:" + myScore);

        }else if(myScore < person1 && myScore < person2){
            System.out.println("congratulation you earned third place with a score of:" + myScore);

        }else{
            System.out.println("congratulation you earned second place with a score of:" + myScore);
        }



    }
   /*
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
    */
}
