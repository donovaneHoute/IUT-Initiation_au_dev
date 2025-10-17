class JeuDuPendu extends Program {

    boolean[] creerTableau(String mot) {
        boolean[] tableauResultat = new boolean[length(mot)];

        return tableauResultat;
    }

    void affichage(String mot, boolean[] tableauResultat) {
        for (int idx = 0; idx < length(tableauResultat); idx++) {
            if (tableauResultat[idx] == true) {
                print(charAt(mot, idx) + " ");
            } else {
                print("* ");
            }
        }
    }

    void mot(String mot) {
        String resultat = "";
        int nbErreurs = 5;
        boolean trouverMot;
        
        boolean[] tableauResultat = creerTableau(mot);

        do {
            print("Il vous reste " + nbErreurs + " erreurs: ");
            
            affichage(mot, tableauResultat);

            println("");
            print("Entrez un caractère: ");
            char caractere = readChar();

            boolean trouve = false;
            for (int idx = 0; idx < length(mot); idx++) {
                if (charAt(mot, idx) == caractere) {
                    tableauResultat[idx] = true;
                    trouve = true;
                }
            }


            if (!trouve) {
                nbErreurs--;
            }

            trouverMot = true;

            for (int idx = 0; idx < length(tableauResultat); idx++) {
                if (tableauResultat[idx] == false) {
                    trouverMot = false;
                }
            }
        } while(nbErreurs != 0 && !trouverMot);

        if (nbErreurs == 0) {
            print("Vous avez perdu ! ");
        } else {
            print("Vous avez gagné ! ");
        }
        println("Il fallait trouver: " + mot);
    }
    
    void algorithm () {
        String mot = "unix";

        mot(mot);
    }

}