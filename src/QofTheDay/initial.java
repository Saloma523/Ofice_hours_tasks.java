package QofTheDay;

public class initial {
    public static void main(String[] args) {
        String name = "  chuck norries ";
        String n = name.trim().substring(0,1).toUpperCase()+"."+ name.substring(name.indexOf("n"),name.indexOf("n")+1).toUpperCase() + ".";
        System.out.println(n);

    }
}
