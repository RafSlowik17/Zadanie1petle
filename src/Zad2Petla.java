import java.util.Scanner;
public class Zad2Petla {
        public static void main(String[] args) {
            Scanner klawiatura = new Scanner(System.in);

            System.out.print("Podaj prędkość pojazdu (w km/h): ");
            double predkosc = klawiatura.nextDouble();

            System.out.print("Podaj czas podróży (w godzinach): ");
            double czas_podrozy = klawiatura.nextDouble();

            if (predkosc < 0 || czas_podrozy < 1) {
                System.out.println("Nieprawidłowe dane wejściowe. Prędkość musi być nieujemna, a czas musi być większy lub równy 1.");
            } else {
                System.out.println("Godzina  Przebyta odległość");
                System.out.println("-----------------------------");

                for (int godzina = 1; godzina <= czas_podrozy; godzina++) {
                    double dystans = predkosc * godzina;
                    System.out.println(godzina + "h" +  "      " + dystans + " km/h");
                }
            }
        }
    }


