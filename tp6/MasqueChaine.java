class MasqueChaine extends Program {

    void testMasque() {
        assertEquals("a...a...a....",    masque("au bal masqué",    'a'));
        assertEquals("................", masque("Tonari no Totoro", 'u'));
        assertEquals(".o......o..o.o.o", masque("Tonari no Totoro", 'o'));
        assertEquals("",                 masque("",                 'z'));
    }

    String masque(String phrase, char lettre) {
        String resultat = "";

        for (int idx = 0; idx < length(phrase); idx++) {
            char caractere = charAt(phrase, idx);
            if (caractere == lettre) {
                resultat += lettre;
            } else {
                resultat += ".";
            }
        }

        return resultat;
    }

    void algorithm() {
        
    }

}
