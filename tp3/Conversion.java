public class Conversion extends Program {

    void algorithm() {
        // À compléte
        print("Combien de lignes souhaitez-vous ? ");
        int ligne = readInt();
        double yens = 135.90;
        String conca = "";

        for (int i = 1; i <= ligne; i = i + 1) {
            conca = conca + i + " euros = " + yens*i + " yens.\n";
            println(conca);
        }
        
    }
}
