class Frequences extends Program {

    int[] frequences (String[] motsCles, String[] mots) {
        int[] tabFreq = new int[length(motsCles)];
        int nbFois = 0;

        for (int idx = 0; idx < length(mots); idx++) {
            for (int j = 0; j < length(motsCles); j++) {
                if (mots[idx] == motsCles[j]) {
                    tabFreq[j]++;
                }
            }
        }

        return tabFreq;
    }

    void test_frequences_je_tu_elle() {
            String[] motsCles = new String[]{"je", "tu", "elle"};
            int[]    freq     = new int[]{3, 2, 1};
            String[] mots     = new String[]{"je", "tu", "tu", "elle", "je", "je"};
            assertArrayEquals(freq, frequences(motsCles, mots));
        }

        void algorithm() {
        }

}
