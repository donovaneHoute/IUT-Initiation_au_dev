class ExtraireMots extends Program {

    String[] extraireMots(String texte) {
        String[] tabTemp = new String[20];

        String mot = "";
        int nbMots = 0;

        for (int idx = 0; idx < length(texte); idx++) {
            if (estLettre(charAt(texte, idx))) {
                mot += charAt(texte, idx);
            } else {
                if (length(mot) > 0) {
                    tabTemp[nbMots] = mot;
                    nbMots++;
                    mot = "";
                }
            }
        }

        String[] tabFinal = new String[nbMots];
        
        for (int idx = 0; idx < nbMots; idx++) {
            tabFinal[idx] = tabTemp[idx];
        }

        return tabFinal;
    }

    boolean estLettre(char caractere) {
        return (caractere >= 'a' || caractere <= 'z' && caractere >= 'A' && caractere <= 'Z');
    }

    void test_extraireMots () {
            assertArrayEquals(new String[]{"je", "tu", "elle", "je", "tu"}, extraireMots("je tu elle je tu "));
            assertArrayEquals(new String[]{"je", "tu", "elle", "je", "tu"}, extraireMots(" je tu, elle . je tu ! "));
        }

        void algorithm() {
            println(extraireMots("je tu elle je tu "));
        }

}
