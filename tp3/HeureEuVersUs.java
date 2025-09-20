class HeureEuVersUs extends Program {

    void algorithm() {
     // TODO: implement the algorithm
     print("Saisir heures: ");
     int heure = readInt();

     print("Saisir minutes: ");
     int minute = readInt();

     String conca = "";

     if (heure == 0 || heure == 12) {
        if (heure == 0) {
            heure = 12;
            conca = "AM";
        } else {
            conca = "PM";
        }
     } else if (heure > 12 && heure <= 23) {
        heure = heure - 12;
        conca = "PM";
     } else {
        conca = "AM";
     }

     println(heure + ":" + minute + conca);
    }

}
