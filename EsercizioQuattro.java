import java.util.Scanner;

public class EsercizioQuattro {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x =0;
        System.out.println("Immettere un numero intero:");
        x = Integer.parseInt(in.nextLine());
        for (int i = x; i>=0; i--) {
            System.out.println(i);
        }
        in.close();
    }
}
