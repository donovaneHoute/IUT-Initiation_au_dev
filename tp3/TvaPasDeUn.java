
class TvaPasDeUn extends Program {

    void algorithm() {
     // TODO: implement the algorithm
     print("Combien de lignes ? ");
     int ligne = readInt();
     double tva = 0.196;

     for (int i = 1; i <= ligne; i = i + 1) {
        println(i + " euros HT = " + (i + tva*i) + " euros TTC.");
     }
    }

}
