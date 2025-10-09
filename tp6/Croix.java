class Croix extends Program {
    
    String dessineDiagonale(int taille, char caractere) {
        String resultat = "";
        for (int i = 1; i <= taille; i++) {
            String ligne = "";
            for (int j = 1; j <= taille; j++) {
                if (j == i || j == (taille - i + 1)) {
                    ligne += caractere;
                } else {
                    ligne += " ";
                }
            }
            
            int k = length(ligne) - 1;

            while (k >= 0 && charAt(ligne, k) == ' ') {
                k--;
            }
            
            resultat += substring(ligne, 0, k + 1) + "\n";
        }
        return resultat;
    }


    void algorithm() {
        print("Taille : ");
        int taille = readInt();
        print("Caractere : ");
        char caractere = readChar();

        print(dessineDiagonale(taille, caractere));
    }

}
