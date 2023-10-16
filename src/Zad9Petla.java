import java.util.Scanner;
public class Zad9Petla {
        public static void main(String[] args) {
            Scanner klawiatura = new Scanner(System.in);

            System.out.print("Podaj początkową liczbę organizmów (co najmniej 2): ");
            int poczatkowaLiczbaOrganizmow = klawiatura.nextInt();

            if (poczatkowaLiczbaOrganizmow < 2) {
                System.out.println("Początkowa liczba organizmów musi wynosić co najmniej 2.");
                return;
            }

            System.out.print("Podaj średni dzienny przyrost populacji (%) (nieujemny): ");
            double sredniDziennyPrzyrost = klawiatura.nextDouble();

            if (sredniDziennyPrzyrost < 0) {
                System.out.println("Średni dzienny przyrost musi być nieujemny.");
                return;
            }

            System.out.print("Podaj liczbę dni rozmnażania (co najmniej 1): ");
            int liczbaDniRozmazania = klawiatura.nextInt();

            if (liczbaDniRozmazania < 1) {
                System.out.println("Liczba dni rozmnażania musi być co najmniej 1.");
                return;
            }

            System.out.println("Dzień  Liczba organizmów");

            for (int dzien = 1; dzien <= liczbaDniRozmazania; dzien++) {
                System.out.println(dzien + "      " + poczatkowaLiczbaOrganizmow);
                poczatkowaLiczbaOrganizmow += (int) (poczatkowaLiczbaOrganizmow * (sredniDziennyPrzyrost / 100));
            }

        }
    }


