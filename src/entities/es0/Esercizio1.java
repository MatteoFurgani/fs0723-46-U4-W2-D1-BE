package entities.es0;

public class Esercizio1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 7;
        int sum = a + b;
        b = 13;

        System.out.println("La somma è " + sum);

        int perimetro = 2 * a + 2 * b;

        System.out.println("Il perimetro è " + perimetro);

        if(a > b){
            System.out.println("a è maggiore di b");
        }
        else if (a < b) {
            System.out.println("a è minore di b");
        } else {
            System.out.println("a è uguale a b");
        }

    }
}
