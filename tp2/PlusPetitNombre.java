class PlusPetitNombre extends Program {

    void algorithm() {
     println("Entrez deux nombres :");
     int nb1 = readInt();
     int nb2 = readInt();
     if (nb1 < nb2) {
        println("Le plus petit est " + nb1);
     } else {
        println("Le plus petit est " + nb2);
     }
    }
    
}
