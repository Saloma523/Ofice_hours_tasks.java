package week06;

public class syllables {
    public static void main(String[] args) {
        System.out.println(Syllables("de_liv_ery_y"));
    }

    public static int Syllables(String str){
        int syllablesCount = str.isEmpty()? 0 : 1;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '_'){
               syllablesCount++;
            }

        }
        return syllablesCount;
    }
}
/*
T3Syllables [methods, String, loops]

    Create a method that has a String parameter and returns how many syllables the given word has
        > the String given will have a "-" to separate the different syllables

    Ex:
        ja-va -> 2
        apple -> 1
        ham-bur-ger -> 3
        de-liv-ery-y -> 4

 */
