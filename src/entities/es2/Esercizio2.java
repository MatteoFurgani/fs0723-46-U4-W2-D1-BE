package entities.es2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Inserisci i km percorsi: ");
            double km = Integer.parseInt(scanner.nextLine());
            System.out.println("Inserisci i litri di carburante consumati: ");
            double lt = Integer.parseInt(scanner.nextLine());
            double kmPerLt = km / lt;
            System.out.println("Km per litro: " + kmPerLt);
        } catch (ArithmeticException e) {
            System.out.println("Errore! Non è possibile dividere per 0!");
        } catch (Exception e) {
            System.out.println("Errore! Non è possibile convertire in numero!");
        } finally {
            System.out.println("Programma terminato!");
            scanner.close();
        }
    }
}