public class Main {
    public static void main(String[] args) {
        Doctor vet = new Vet();
        vet.treat();

        Doctor psy = new Psychotherapist();
        psy.treat();

        Doctor dentist = new Dentist();
        dentist.treat();

        Doctor thera = new Therapist();
        thera.treat();
    }
}