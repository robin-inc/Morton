import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Eingabe();
    }

    public static void Eingabe() {

        double weight = 0;
        double height = 0;
        int age = 0;
        char gender;

        boolean wiederholen = true;

        while (wiederholen) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Gewicht eingeben (in kg): ");
            weight = sc.nextDouble();
            System.out.print("Größe eingeben (in m): ");
            height = sc.nextDouble();
            System.out.print("Alter eingeben: ");
            age = sc.nextInt();
            System.out.print("Geschlecht eingeben (m/w): ");
            gender = sc.next().charAt(0);

            System.out.println("________________________");
            System.out.println("Gewicht: " + weight + "kg");
            System.out.println("Größe: " + height + "m");
            System.out.println("Alter: " + age);
            System.out.println("Geschlecht: " + gender);
            System.out.println("________________________");

            System.out.println("Sind diese Informationen korrekt?(Ja/Nein): ");
            String antwort = sc.next();


            if (antwort.equals("Ja")) {wiederholen = false;}

        }

        BMIrechner(weight, height, age);
    }

    public static void BMIrechner(double weight, double height, int age) {

        double BMI = weight / (height * height);

        if (age >= 18 & age <= 24) {
            if (BMI <= 18) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Untergewicht.");
            } else if (BMI > 18 & BMI <= 24) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Normalgewicht.");
            } else if (BMI > 24 & BMI <= 28) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im leichten Übergewicht.");
            } else if (BMI > 28) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Übergewicht.");
            }
        } else if (age > 24 & age <= 34) {
            if (BMI <= 19) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Untergewicht.");
            } else if (BMI > 19 & BMI <= 25) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Normalgewicht.");
            } else if (BMI > 25 & BMI <= 29) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im leichten Übergewicht.");
            } else if (BMI > 29) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Übergewicht.");
            }
        } else if (age > 34 & age <= 44) {
            if (BMI <= 20) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Untergewicht.");
            } else if (BMI > 20 & BMI <= 26) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Normalgewicht.");
            } else if (BMI > 26 & BMI <= 30) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im leichten Übergewicht.");
            } else if (BMI > 30) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Übergewicht.");
            }
        } else if (age > 44 & age <= 54) {
            if (BMI <= 21) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Untergewicht.");
            } else if (BMI > 21 & BMI <= 27) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Normalgewicht.");
            } else if (BMI > 27 & BMI <= 31) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im leichten Übergewicht.");
            } else if (BMI > 31) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Übergewicht.");
            }
        } else if (age > 54 & age <= 64) {
            if (BMI <= 22) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Untergewicht.");
            } else if (BMI > 22 & BMI <= 28) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Normalgewicht.");
            } else if (BMI > 28 & BMI <= 32) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im leichten Übergewicht.");
            } else if (BMI > 32) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Übergewicht.");
            }
        } else if (age > 64) {
            if (BMI <= 23) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Untergewicht.");
            } else if (BMI > 23 & BMI <= 29) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im UntergewichtNormalgewicht.");
            } else if (BMI > 29 & BMI <= 33) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im leichten Übergewicht.");
            } else if (BMI > 33) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Übergewicht.");
            }
        }
    }
}