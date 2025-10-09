class Dessins extends Program {

    String dessineLigne(int taille, char caractere) {
        String resultat = "";
        for (int i=0; i<taille; i=i+1) {
            resultat += caractere;
        }
        resultat += "\n";

        return resultat;
    }

    String dessineExtre(int taille, char caractere) {
        String resultat = "";
        for (int idx = 1; idx < taille - 1; idx++) {
            resultat += caractere;
            for (int k = 1; k < idx; k++) {
                resultat += " ";
            }
            resultat += caractere + "\n";
        }

        return resultat;
    }

    String croix(int taille, char caractere) {
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

    String triangleCreux(int taille, char caractere) {
        String resultat = "";

        resultat += dessineLigne(1, caractere);
        resultat += dessineExtre(taille, caractere);
        resultat += dessineLigne(taille, caractere);

        return resultat;
    }

    String trianglePlein(int taille, char caractere) {
        String resultat = "";
        for (int idx = 1; idx <= taille; idx++) {
            for (int k = 0; k < idx; k++) {
                resultat += caractere;
            }
            resultat += "\n";
        }

        return resultat;
    }

    void algorithm() {
        print("Taille : ");
        int taille = readInt();
        print("Caractere : ");
        char caractere = readChar();

        println(trianglePlein(taille, caractere));
        println(triangleCreux(taille, caractere));
    }

}
