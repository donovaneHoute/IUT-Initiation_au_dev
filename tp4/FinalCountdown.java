class FinalCountdown extends Program {
    void algorithm() {
        long temps = getTime();
        int compteur = 0;
        
        while (getTime() - temps < 3) {
            compteur = compteur + 3;
            println(compteur);
        }
    }
}