class JeuDuPendu extends Program {

    String dessinPendu(int erreurs){
        String[] tab={
            """
            +-------+
            |
            |
            |
            |
            |
            ==============\n
            """,
            """
            +-------+
            |       |
            |       O
            |
            |
            |
            ==============\n
            """
                ,
            """
            +-------+
            |       |
            |       O
            |       |
            |
            |
            ==============\n
            """,
            """
            +-------+
            |       |
            |       O
            |      -|
            |
            |
            ==============\n
            """,
            """
            +-------+
            |       |
            |       O
            |      -|-
            |
            |
            ==============\n
            """,
            """
            +-------+
            |       |
            |       O
            |      -|-
            |      |
            |
            ==============\n
            """,
            """
            +-------+
            |       |
            |       O
            |      -|-
            |      | |
            |
            ==============\n
            """
        };
        return tab[erreurs];
    }

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
        int nbErreurs = 0;
        boolean trouverMot;
        
        boolean[] tableauResultat = creerTableau(mot);

        do {
            print("Votre proposition : ");
            
            affichage(mot, tableauResultat);

            println("");
            print("Entrez un caractère: ");
            char caractere = readChar();
            println("");

            boolean trouve = false;
            for (int idx = 0; idx < length(mot); idx++) {
                if (charAt(mot, idx) == caractere) {
                    tableauResultat[idx] = true;
                    trouve = true;
                }
            }


            if (!trouve) {
                println(dessinPendu(nbErreurs));
                nbErreurs++;
            }

            trouverMot = true;

            for (int idx = 0; idx < length(tableauResultat); idx++) {
                if (tableauResultat[idx] == false) {
                    trouverMot = false;
                }
            }
        } while(nbErreurs != 7 && !trouverMot);

        if (nbErreurs == 0) {
            print("Vous avez perdu ! ");
        } else {
            print("Vous avez gagné ! ");
        }
        println("Il fallait trouver: " + mot);
    }
    
    void algorithm () {
        String mot = "propagande";

        mot(mot);
    }

}