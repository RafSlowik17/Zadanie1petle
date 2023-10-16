import java.util.Scanner;
public class Zad10Petla {
    public static void main(String[] args) {
                Scanner klawiatura = new Scanner(System.in);

                int liczba;
                boolean pierwszaLiczba = true;
                int najmniejsza = 0;
                int najdluzsza = 0;

                while (true) {
                    System.out.print("Wprowadź liczbę całkowitą (-99, aby zakończyć): ");
                    liczba = klawiatura.nextInt();

                    if (liczba == -99) {
                        break;
                    }
                    if (pierwszaLiczba) {
                        najmniejsza = liczba;
                        najdluzsza = liczba;
                        pierwszaLiczba = false;
                    } else {
                        if (liczba < najmniejsza) {
                            najmniejsza = liczba;
                        }
                        if (liczba > najdluzsza) {
                            najdluzsza = liczba;
                        }
                    }
                }

                if (pierwszaLiczba) {
                    System.out.println("Nie wprowadzono żadnych liczb.");
                } else {
                    System.out.println("Najmniejsza wartość: " + najmniejsza);
                    System.out.println("Największa wartość: " + najdluzsza);
                }

            }
        }

