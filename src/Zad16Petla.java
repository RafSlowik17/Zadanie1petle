import java.util.Scanner;
public class Zad16Petla {
    public static void main(String[] args) {
                Scanner klawiatura = new Scanner(System.in);

                System.out.print("Podaj miesięczny budżet: ");
                double budzet = klawiatura.nextDouble();

                double sumaWydatkow = 0;

                boolean kontynuuj = true;

                while (kontynuuj) {
                    System.out.print("Podaj wydatek (lub 0, aby zakończyć): ");
                    double wydatek = klawiatura.nextDouble();

                    if (wydatek == 0) {
                        kontynuuj = false;
                    } else {
                        sumaWydatkow += wydatek;
                    }
                }
                double roznica = budzet - sumaWydatkow;

                if (roznica < 0) {
                    System.out.println("Przekroczono budżet o " + (roznica) + " zł.");
                } else {
                    System.out.println("Zostało " + roznica + " zł z budżetu.");
                }
            }
        }
