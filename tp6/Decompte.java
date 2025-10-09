class Decompte extends Program {

    void test_genereNombresPairs1() {
        assertEquals("8642",     genereNombresPairs1(8));
        assertEquals("12108642", genereNombresPairs1(12));
        assertEquals("2",        genereNombresPairs1(2));
    }

    String genereNombresPairs1(int n) {
        String resultat = "";

        for (int idx = n; idx >= 2; idx--) {
            if (idx % 2 == 0) {
                resultat += idx;
            }
        }

        return resultat;
    }

    String genereNombresPairs2(int n) {
        String resultat = "*";

        for (int idx = n; idx >= 2; idx--) {
            if (idx % 2 == 0) {
                resultat += idx;
            }
        }
        resultat += "*";

        return resultat;
    }

    String genereNombresPairs3(int n) {
        String resultat = "";

        for (int idx = n; idx >= 2; idx--) {
            if (idx % 2 == 0) {
                resultat += idx + "*";
            }
        }
        resultat = substring(resultat, 0, length(resultat)-1);

        return resultat;
    }

    void test_genereNombresPairs2() {
        assertEquals("*8642*",     genereNombresPairs2(8));
        assertEquals("*12108642*", genereNombresPairs2(12));
        assertEquals("*2*",        genereNombresPairs2(2));
    }

    void test_genereNombresPairs3() {
        assertEquals("8*6*4*2",       genereNombresPairs3(8));
        assertEquals("12*10*8*6*4*2", genereNombresPairs3(12));
        assertEquals("2",             genereNombresPairs3(2));
    }
        void algorithm() {
        }

}
