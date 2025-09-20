class HeureUsVersEu extends Program {

    void algorithm() {
     // TODO: implement the algorithm
     print("Saisir heures: ");
     int heure = readInt();

     print("Saisir minutes: ");
     int minute = readInt();

     print("Saisir AM/PM: ");
     String ampm = readString();

     String conca = "AM";

     if (heure == 12) {
        if (equals(ampm, "PM")) {
            heure = 12;
        } else {
            heure = 0;
        }
     } else if (equals(ampm, "PM")) {
        heure = heure + 12;
     }

     println(heure + ":" + minute);
    }
}
