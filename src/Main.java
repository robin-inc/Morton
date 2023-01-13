import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean wiederholen = true;

        while (wiederholen) {

            Eingabe();

            System.out.print("Sind diese Informationen korrekt?(Ja/Nein): ");
            String antwort = sc.nextLine();
            System.out.println();

            if (antwort.equals("Ja")) {
                wiederholen = false;
            }
        }
    }

    private static void Eingabe() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Gewicht eingeben (in kg): ");
        double weight = sc.nextDouble();
        System.out.print("Größe eingeben (in cm): ");
        double height = sc.nextDouble();
        System.out.print("Alter eingeben: ");
        int age = sc.nextInt();
        System.out.print("Geschlecht eingeben (m/w): ");
        char gender = sc.next().charAt(0);

        System.out.println();
        System.out.println("Gewicht: " + weight + "kg");
        System.out.println("Größe: " + height + "cm");
        System.out.println("Alter: " + age);
        System.out.println("Geschlecht: " + gender);
        System.out.println();
    }
}
