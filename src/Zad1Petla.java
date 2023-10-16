import java.util.Scanner;
public class Zad1Petla {

    public static void main(String[] args) {
        Scanner klawiatura = new Scanner(System.in);

        System.out.print("Podaj ilość liczb do zsumowania: ");
        int iloscLiczb = klawiatura.nextInt();

        if (iloscLiczb <= 0) {
            System.out.println("Ilość liczb musi być większa od zera.");
        } else {
            int[] liczby = new int[iloscLiczb];

            for (int i = 0; i < iloscLiczb; i++) {
                liczby[i] = i + 1;
            }
            int suma = 0;
            for (int i = 0; i < iloscLiczb; i++) {
                suma += liczby[i];
            }
            System.out.println("Suma liczb od 1 do " + iloscLiczb + " wynosi: " + suma);
        }
        }
    }





