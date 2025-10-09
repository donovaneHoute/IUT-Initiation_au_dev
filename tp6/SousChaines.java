class SousChaines extends Program {

    String chaines(String texte) {
        String resultat = "";
        for (int idx = 0; idx < length(texte) ; idx++) {
            for (int j = length(texte); j > idx; j--) {
                resultat += substring(texte, idx, j) + "\n";
            }
        }
        resultat = substring(resultat, 0, length(resultat)-1);

        return resultat;
    }

    void algorithm() {
            print("Mot : ");
            String mot = readString();
            
            println(chaines(mot));
        }

}
