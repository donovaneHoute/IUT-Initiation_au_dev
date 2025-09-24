class SyracuseComplet extends Program {
    
    void algorithm() {
        print("Entrez un nombre: ");
        int n = readInt();
        print("Trajectoire: ");
        String conca = "";
        int init = n;
        int altitudeMax = 0;
        int dureeVol = 0;
        int dureeVolAlt = 1;
        int facteur = 0;
        boolean inf = false;

        while (n != 1) {
            conca = conca + n + ", ";
            dureeVol++;
            if (n > altitudeMax) {
                altitudeMax = n;
            }
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
            if (n > init && inf == false) {
                dureeVolAlt++;
            } else {
                inf = true;
            }
        }
        facteur = altitudeMax / init;

        println(conca + "1.");
        println("Altitude max: " + altitudeMax);
        println("Durée de vol: " + dureeVol);
        println("Durée de vol en altitude: " + dureeVolAlt);
        println("Facteur d'expansion: " + facteur);
    }

}
