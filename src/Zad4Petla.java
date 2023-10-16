import java.util.Scanner;
public class Zad4Petla {
        public static void main(String[] args) {
            Scanner klawiatura = new Scanner(System.in);

            System.out.print("Podaj liczbę dni przepracowanych: ");
            int liczbaDni = klawiatura.nextInt();

            if (liczbaDni < 1) {
                System.out.println("Liczba dni przepracowanych musi być większa lub równa 1.");
            } else {
                double wynagrodzenie = 0;
                double dzienneWynagrodzenie = 1;

                System.out.println("Dzień  Wynagrodzenie (zł)");
                for (int dzien = 1; dzien <= liczbaDni; dzien++) {
                    wynagrodzenie += dzienneWynagrodzenie;
                    System.out.println(dzien + "      " + dzienneWynagrodzenie / 100);
                    dzienneWynagrodzenie *= 2;
                }
                System.out.println("Sumaryczne wynagrodzenie za " + liczbaDni + " dni wynosi: " + wynagrodzenie / 100 + " zł");
            }
        }
    }


