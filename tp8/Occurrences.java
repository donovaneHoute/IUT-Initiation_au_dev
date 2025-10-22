class Occurrences extends Program {

    int nbFois(String[] tab, String mot) {
        int nbFois = 0;
        for (int idx = 0; idx < length(tab); idx++) {
            if (equals(tab[idx], mot)) {
                nbFois++;
            }
        }
        return nbFois;
    }

    void test_nbFois () {
            String[] tab = new String[]{"je", "tu", "tu", "elle" , "je" , "je"};
            // "je" apparait 3 fois dans tab
            assertEquals(3, nbFois(tab, "je"));
            assertEquals(2, nbFois(tab, "tu"));
            assertEquals(0, nbFois(tab, "il"));
        }

        void algorithm() {
            // ne rien écrire ici !
        }

}
