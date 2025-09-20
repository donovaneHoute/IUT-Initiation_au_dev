public class MomentJournee extends Program {

    void algorithm() {
        print("Saisir une heure: ");
        int heure = readInt();
        // à compléter /* TODO: Complete this */
        if (heure < 0 || heure > 23) {
            println("erreur");
        } else if (heure >= 6 && heure < 12) {
            println("matinée");
        } else if (heure >= 12 && heure < 18) {
            println("après-midi");
        } else if (heure >= 18 && heure < 22) {
            println("soirée");
        } else {
            println("nuit");
        }
    }
}