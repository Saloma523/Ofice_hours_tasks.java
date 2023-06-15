package week10;

import java.util.ArrayList;
import java.util.Arrays;

public class testSow {
    public static void main(String[] args) {


        Show lastOfUs = new Show("the last of us", 1, false);

        System.out.println(lastOfUs);

        lastOfUs.audioLanguage.add("English");

        System.out.println(lastOfUs);

        ArrayList<String> getLang = new ArrayList<>(Arrays.asList("English", " Arabic", "Spanish"));

        Show got = new Show("game of throne", 8,true,getLang);

        System.out.println(got);


    }
}
