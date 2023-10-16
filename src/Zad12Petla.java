import java.util.Scanner;
public class Zad12Petla {
    public static void main(String[] args) {
                Scanner klawiatura = new Scanner(System.in);

                System.out.println("Podaj dzisiejszą wartość sprzedaży dla pięciu sklepów.");

                for (int sklep = 1; sklep <= 5; sklep++) {
                    System.out.print("Sklep nr " + sklep + ": ");
                    int sprzedaz = klawiatura.nextInt();
                    int liczbaGwiazdek = sprzedaz / 100;

                    System.out.print("Sklep nr " + sklep + ": ");
                    for (int i = 0; i < liczbaGwiazdek; i++) {
                        System.out.print("*");
                    }

                }
            }
        }



