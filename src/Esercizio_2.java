import java.util.Scanner;

public class Esercizio_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome");
        String firstWord = scan.nextLine();
        System.out.println("Inserisci il tuo cognome");
        String secondWord = scan.nextLine();
        System.out.println("Inserisci il tuo codice fiscale");
        String thirdWord = scan.nextLine();

        System.out.println(firstWord+" "+secondWord+" "+thirdWord);
        System.out.println(thirdWord+" "+secondWord+" "+firstWord);
    }

}
