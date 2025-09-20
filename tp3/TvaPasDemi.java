class TvaPasDemi extends Program {

    void algorithm() {
     // TODO: implement the algorithm
     print("Combien de lignes ? ");
     int ligne = readInt();
    
     print("A partir de ? ");
     double ht = readDouble();
     
     double tva = 0.196;

     for (int i = 1; i <= ligne; i = i + 1) {
        println(ht + " euros HT = " + (ht + tva*ht) + " euros TTC.");
        ht = ht + 0.5;
     }
     println(ht);
    }

}
