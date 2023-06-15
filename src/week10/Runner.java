package week10;

public class Runner {

    public static void main(String[] args) {

        Encryption first = new Encryption("james bond");

        first.modifyNum = 20;
        first.factorNum =2;
        first.encrypt();
        System.out.println(first);

        Encryption secret = new Encryption("i make cookies with more suger", 32,3);

        String secretMessage = "252 234 258 242 270 104 236 262 260 240";

        System.out.println(Encryption.decrypt(secretMessage,32,3));



    }



}
