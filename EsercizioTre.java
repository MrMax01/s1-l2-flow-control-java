import java.util.Scanner;

public class EsercizioTre {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word="";
        while(!word.equals(":q")){
            System.out.println("digita una parola!");
            word = in.nextLine();
            for (int i = 0; i < word.length(); i++) {
                System.out.printf(word.charAt(i)+",");

            }
            System.out.println("");

        }
        in.close();

    }

}
