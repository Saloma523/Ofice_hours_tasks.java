package week09;

import java.util.ArrayList;
import java.util.Arrays;

public class starWarsFactions {
    public static void main(String[] args) {

        ArrayList<String> data = new ArrayList<>(Arrays.asList( "Jedi Yoda", "officer Versio", "officer Brunson", "Trooper Needa", "Jedi Windu", "Jedi Skywalker", "Princess Leia Rebel", "Rebel Sabine", "Rey Jedi", "Rook Alliance", "imperial Terex"));
        ArrayList<String> jediOrder = new ArrayList<>();
        ArrayList<String> galacticEmpire = new ArrayList<>();
        ArrayList<String> rebelAlliance = new ArrayList<>();


        for(String name : data){

            name = name.toLowerCase();

            if(name.contains("jedi")){
                jediOrder.add(name);
            } else if(name.contains("imperial") || name.contains("trooper") || name.contains("officer")){
                galacticEmpire.add(name);
            } else if(name.contains("rebel") || name.contains("alliance")){
                rebelAlliance.add(name);
            }

        }

        System.out.println("Data: " + data);
        System.out.println("Jedi: " + jediOrder);
        System.out.println("Galactic Empire: " + galacticEmpire);
        System.out.println("Rebel Alliance: " + rebelAlliance);


    }
}





