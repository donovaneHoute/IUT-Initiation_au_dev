class Croix extends Program {
    
    String dessineDiagonale(int taille, char caractere) {
        String resultat = "";
        for (int k = 1; k < taille; k++) {
            for (int j = 1; j < k; j++) {
                resultat += " ";
            }
            resultat += " \n";
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
