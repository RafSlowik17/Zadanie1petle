import java.util.Scanner;
public class Zad7Petla {
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.print("Podaj liczbę pięter w hotelu: ");
                int liczbaPieter = input.nextInt();

                if (liczbaPieter < 1) {
                    System.out.println("Liczba pięter musi być większa lub równa 1.");
                    return;
                }
                int lacznaLiczbaPokoi = 0;
                int liczbaZajetychPokoi = 0;

                for (int pietro = 1; pietro <= liczbaPieter; pietro++) {
                    System.out.print("Liczba wszystkich pokoi na piętrze " + pietro + ": ");
                    int wszystkiePokoje = input.nextInt();

                    if (wszystkiePokoje < 10) {
                        System.out.println("Liczba pokoi na piętrze musi wynosić co najmniej 10.");
                        return;
                    }

                    System.out.print("Liczba zajętych pokoi na piętrze " + pietro + ": ");
                    int zajetePokoje = input.nextInt();

                    if (zajetePokoje < 0 || zajetePokoje > wszystkiePokoje) {
                        System.out.println("Niepoprawna liczba zajętych pokoi na piętrze.");
                        return;
                    }

                    lacznaLiczbaPokoi += wszystkiePokoje;
                    liczbaZajetychPokoi += zajetePokoje;
                }

                double poziomOblozenia = (double) liczbaZajetychPokoi / lacznaLiczbaPokoi * 100;

                System.out.println("Liczba pokoi w hotelu: " + lacznaLiczbaPokoi);
                System.out.println("Liczba zajętych pokoi: " + liczbaZajetychPokoi);
                System.out.println("Poziom obłożenia: " + poziomOblozenia + "%");

            }
        }

