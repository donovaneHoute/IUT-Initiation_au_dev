class TicketDeCaisse extends Program {
    
    void algorithm() {
        int somme = 0;
        int saisie;

        do {
            saisie = readInt();
            somme = somme + saisie;
        } while (saisie != 0);
        println("Total="+somme);
    }
}
