class Creux extends Program {
    String creux(int taille, char caractere) {
        String resultat = "";

        resultat += dessineLigne(1, caractere);
        resultat += dessineExtre(taille, caractere);
        resultat += dessineLigne(taille, caractere);

        return resultat;
    }

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

    void testCreux() {
        assertEquals("a\naa\na a\naaaa\n", creux(4, 'a'));
        assertEquals("a\naa\n", creux(2, 'a'));
        assertEquals("a\na\n", creux(1, 'a'));
    }

    void algorithm() {
        print("Taille : ");
        int taille = readInt();
        print("Caractere : ");
        char caractere = readChar();

        print(creux(taille, caractere));
    }

}
