package entities.es1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;

public class Esercizio1 {
    private static final Logger logger = LoggerFactory.getLogger(Esercizio1.class);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[]{1, 2, 3, 4, 5};

        logger.info("Array iniziale: {}", array);

        while (true) {
            logger.info("Inserisci un numero (0 per uscire):");
            int numero = scanner.nextInt();

            if (numero == 0) {
                logger.info("FINE!");
                break;
            }

            logger.info("Inserire la posizione:");
            int indice = scanner.nextInt() - 1;

            if (indice < 0 || indice >= array.length) {
                logger.error("Errore: indice non valido, riprova.");
                continue;
            }

            array[indice] = numero;

            logger.info("Nuovo stato dell'array: {}", array);
        }

        scanner.close();
    }
}

