class InitTableau extends Program {

    void test_creerTableau_taille_fixe_10() {
        assertArrayEquals(new int[]{1,1,1,1,1,2,2,2,2,2}, creerTableau());
    }

    void test_creerTableau_taille_en_parametre () {
        assertArrayEquals(new int[]{1,1,1,1,1,2,2,2,2,2}, creerTableau(10));
        assertArrayEquals(new int[]{1,1,2,2,2}, creerTableau(5));
        assertArrayEquals(new int[]{}, creerTableau(0));
    }

    void test_creerTableauAleatoire() {
        boolean[] valeursVues = new boolean[21];
        int[] t = creerTableauAleatoire(600);
        for (int i=0; i<length(t); i++) {
            assertTrue( t[i] >=0 && t[i] <=20 );
            valeursVues[t[i]] = true;
        }
        for (int i = 0; i < length(valeursVues); i++) {
            assertTrue(valeursVues[i]);
        }
    }

    int[] creerTableau() {
        int[] tableau = new int[10];

        for (int idx = 0; idx < length(tableau); idx++) {
            if (idx < 5) {
                tableau[idx] = 1;
            } else {
                tableau[idx] = 2;
            }
        }

        return tableau;
    }

    int[] creerTableau(int tailleTableau) {
        int[] tableau = new int[tailleTableau];

        for (int idx = 0; idx < length(tableau); idx++) {
            if (idx < length(tableau) / 2) {
                tableau[idx] = 1;
            } else {
                tableau[idx] = 2;
            }
        }

        return tableau;
    }

    int[] creerTableauAleatoire(int tailleTableau) {
        int[] tableau = new int[tailleTableau];

        for (int idx = 0; idx < length(tableau); idx++) {
            int random = (int) (random()*21);
            tableau[idx] = random;            
        }

        return tableau;
    }

    void algorithm() {
    }

}
