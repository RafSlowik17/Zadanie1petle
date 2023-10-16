public class Zad11Petla {
    public static void main(String[] args) {
                System.out.println("Stopnie Celsjusza   Stopnie Fahrenheita");
                for (int celsjusz = 0; celsjusz <= 20; celsjusz++) {
                    double fahrenheit = (celsjusz * 9.0 / 5.0) + 32;
                    System.out.println(celsjusz + "°C               " + fahrenheit + "°F");
                }
            }
        }