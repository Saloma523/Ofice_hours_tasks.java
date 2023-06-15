package week12.candyTask;

public class testCandy {

    public static void main(String[] args){

        Twix twix = new Twix(2, true);
        System.out.println(twix);
        System.out.println(Candy.largestConsumer);
        System.out.println(Twix.largestConsumer);
        System.out.println(twix.largestConsumer);

        Twix.largestConsumer = "Canada";

        System.out.println(Candy.largestConsumer);
        System.out.println(Twix.largestConsumer);
        System.out.println(HershyeBar.largestConsumer);
        System.out.println(HersheyKiss.largestConsumer);

        // hq is not accessible in Candy or Twix
//        Candy.hq;
//        Twix.hq;
        System.out.println(HershyeBar.hq);
        System.out.println(HersheyKiss.hq);

        System.out.println();
        HershyeBar.hq = "Virginia";
        System.out.println(HershyeBar.hq);
        System.out.println(HersheyKiss.hq);

       // HershyeBar hersheyBar = new HersheyKiss(20,);
       // System.out.println(hersheyBar);

        //HersheyKiss hersheyKiss = new HersheyKiss(30);
        //System.out.println(hersheyKiss);

    }


}
