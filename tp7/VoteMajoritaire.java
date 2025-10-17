class VoteMajoritaire extends Program {

    void test_estAdopte(){
        assertFalse(estAdopte(new boolean[]{true,false}));
        assertTrue(estAdopte(new boolean[]{true,true,false}));
    }

    boolean estAdopte(boolean[] tableau) {
        int nbTrue = 0;
        int nbFalse = 0;

        for (int idx = 0; idx < length(tableau); idx++) {
            if (tableau[idx] == true) {
                nbTrue++;
            } else if (tableau[idx] == false) {
                nbFalse++;
            }
        }
        
        return nbTrue > nbFalse;
    }

    void algorithm() {
    }

}
