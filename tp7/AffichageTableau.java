class AffichageTableau extends Program {

    void test_toString_tab_int () {
        assertEquals("1 2 3 ", toString(new int[]{1,2,3}));
        assertEquals("", toString(new int[0]));
    }

    void test_toString_tab_string () {
        assertEquals("un deux trois ", toString(new String[]{"un", "deux", "trois"}));
        assertEquals("", toString(new String[0]));
    }

    String toString (int[] tabInt) {
        String resultat = "";

        for (int idx = 0; idx < length(tabInt); idx++) {
            resultat += tabInt[idx] + " ";
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

    void algorithm() {
        int[] tabInt = new int[]{1,2,3};
        String[] tabString = new String[]{"un", "deux", "trois"};
        println(toString(tabInt));  
        println(toString(tabString));
    }

}
