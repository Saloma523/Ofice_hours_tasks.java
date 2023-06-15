package week06;

public class characterSet {
    public static String characters(String str){
        String character = "";
        char start;
        char ends;
        switch (character){
            case " uppercase":
                start = 'A';
                ends = 'Z';
                break;
            case"lowercase ":
                start = 'a';
                ends = 'z';
                break;
            case"digits":
                start = '1';
                ends = '9';
                break;
            case"special":
                start = '!';
                ends = '.';
                break;
            default:
                return  "ivalid entry";
        }
        for (char letter = start; letter <= ends ; letter++) {
            //System.out.println((int)letter);
            character+=letter;
        }
        return character;

        }


    }

/*
CharacterSet [methods, loops]

    Create a method that has a String parameter and returns a String.
    Based on the given String a different set of characters will be returned
    use these to determine which set of characters is returned:

    based on the defined parameter return a String will all the characters in the range

    uppercase -> ABCDEFGHIJKLMNOPQRSTUVWXYZ
    lowercase -> abcdefghijklmnopqrstuvwxyz
    digit -> 123456789
    special -> !"#$%&'()*+,-.
 */
/*
CharacterOverloaded [methods, loops, overloading]

    Overload the previous Character Set method by having these parameters:
        char, char

    instead of a fixed set of characters this method will return a String of all the characters between the two defined char parameters

        the first char will determine the starting point and the second character will determine the ending point

    Note: Be careful, if you give characters that cannot be within a range based on the ascii table your method will not work

    Ex:
        ('7', 'P') -> 789:;<=>?@ABCDEFGHIJKLMNOP
        ('X', '}') -> XYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}
 */
