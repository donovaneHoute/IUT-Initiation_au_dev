class SousTableau extends Program {

    String[] sousTableau(String[] tab, int idxD, int idxF) {
        String[] resultat;
        int idx = idxD;
        int cpt = 0;

        if (idxD < 0 || idxF < 0 || idxF > length(tab) || idxF < idxD) {
            resultat = new String[length(tab)];
            idx = 0;
        } else {
            resultat = new String[idxF-idxD];
        }

        while (cpt < length(resultat)) {
            resultat[cpt] = tab[cpt + idx];
            cpt++;
        }

        return resultat;
    }

    String toString (String[] tabString) {
        String resultat = "";

        for (int idx = 0; idx < length(tabString); idx++) {
            resultat += tabString[idx] + " ";
        }

        return resultat;
    }

    void testSousTableau () {
            assertArrayEquals(new String[]{"a", "b", "c"},
                sousTableau(new String[]{"a", "b", "c", "d", "e"}, 0, 3));
            assertArrayEquals(new String[]{"a", "b"},
                sousTableau(new String[]{"a", "b"}, 0, 5));
            assertArrayEquals(new String[]{},
                sousTableau(new String[]{"a", "b", "c"}, 0, 0));
            assertArrayEquals(new String[]{"a", "b"},
                sousTableau(new String[]{"a", "b"}, 0, -5));

            // L’assertion suivante sert à tester qu’on retourne bien une copie du tableau
            // et non le tableau lui-même
            String[] tab = new String[]{"a", "b"};
            assertNotEquals(tab, sousTableau(tab,  2, 1));
            assertNotEquals(tab, sousTableau(tab, -1, 2));
            assertNotEquals(tab, sousTableau(tab,  1, 7));
        }

        void algorithm() {
            toString(sousTableau(new String[]{"a", "b", "c", "d", "e"}, 0, 3));
        }

}
