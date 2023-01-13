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
        BMIrechner();
    }

    public static void BMIrechner(double weight, double height, int age, char gender, double BMI){

        BMI = weight / height^2;

        if (age >= 18 & age <= 24){
            if (BMI <= 18){
                System.out.println("Untergewicht.");
            } else if ( BMI >= 19 & BMI <= 24) {
                System.out.println("Normalgewicht.");
            } else if (BMI >= 25 & BMI <= 28) {
                System.out.println("Leichtes Übergewicht.");
            } else if (BMI >= 29) {
                System.out.println("Übergewicht.");
            }
        }   else if (age >= 25& age <= 34){
            if (BMI <= 19){
                System.out.println("Untergewicht.");
            } else if ( BMI >= 20 & BMI <= 25) {
                System.out.println("Normalgewicht.");
            } else if (BMI >= 26 & BMI <= 29) {
                System.out.println("Leichtes Übergewicht.");
            } else if (BMI >= 30) {
                System.out.println("Übergewicht.");
            }
        }  else if (age >= 35 & age <= 44){
            if (BMI <= 20){
                System.out.println("Untergewicht.");
            } else if ( BMI >= 21 & BMI <= 26) {
                System.out.println("Normalgewicht.");
            } else if (BMI >= 27 & BMI <= 30) {
                System.out.println("Leichtes Übergewicht.");
            } else if (BMI >= 31) {
                System.out.println("Übergewicht.");
            }
        }  else if (age >= 45 & age <= 54) {
            if (BMI <= 21) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Untergewicht.");
            } else if (BMI >= 22 & BMI <= 27) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Normalgewicht.");
            } else if (BMI >= 28 & BMI <= 31) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im leichten Übergewicht.");
            } else if (BMI >= 32) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Übergewicht.");
            }
        }  else if (age >= 55 & age <= 64) {
            if (BMI <= 22) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Untergewicht.");
            } else if (BMI >= 23 & BMI <= 28) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Normalgewicht.");
            } else if (BMI >= 29 & BMI <= 32) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im leichten Übergewicht.");
            } else if (BMI >= 33) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Übergewicht.");
            }
        }  else if (age >= 65) {
            if (BMI <= 23) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Untergewicht.");
            } else if (BMI >= 24 & BMI <= 29) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im UntergewichtNormalgewicht.");
            } else if (BMI >= 30 & BMI <= 33) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im leichten Übergewicht.");
            } else if (BMI >= 34) {
                System.out.println("Dein BMI beträgt:  " + BMI + "\n" + "Du liegst somit im Übergewicht.");
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