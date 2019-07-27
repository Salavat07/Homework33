package kg.salavat;

public class Main {

    public static void main(String[] args) {
        String name[] = new String[3];
        name[0] = "Salavat";
        name[1] = "Aleksey";
        name[2] = "Adilkhan";

        for (String s : name) {

            switch (s) {
                case "Salavat":
                    System.out.println("Good morning " + s + "!");
                    break;
                case "Aleksey":
                    System.out.println("Good day " + s + "!");
                    break;
                case "Adilkhan":
                    System.out.println("Good evening " + s + "!");
                    break;
            }

        }

    }
}
