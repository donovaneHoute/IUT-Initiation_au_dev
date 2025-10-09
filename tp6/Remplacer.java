class Remplacer extends Program {

    String copieEnRemplacant(String phrase, String avant, String après) {
        String resultat = "";

        for (int idx = 0; idx < length(phrase); idx++) {
            if (idx < length(phrase) - length(avant)) {
                if (equals(substring(phrase, idx, idx + length(avant)), avant)) {
                    resultat += après;
                }
            }
        }

        return resultat;
    }

    void testCopieEnRemplacant () {
        assertEquals("15x35"  , copieEnRemplacant("15*35"     , "*"   , "x"));
        assertEquals("15 + 35", copieEnRemplacant("15 plus 35", "plus", "+"));
        assertEquals("abcd"   , copieEnRemplacant("abcd"      , "cb"  , "xy"));
        assertEquals("abcd"   , copieEnRemplacant("abcd"      , ""    , "x"));
        assertEquals("abcd"   , copieEnRemplacant("-ab-cd-"   , "-"   , ""));
        assertEquals("xx"     , copieEnRemplacant("aaaa"      , "aa"  , "x"));
        assertEquals("xxa"    , copieEnRemplacant("aaaaa"     , "aa"  , "x"));
        assertEquals("9 plus 3 plus 3", copieEnRemplacant("9 moins 3 moins 3", "moins", "plus"));
    }

    void algorithm() {
            print("Phrase : ");
            String texte = readString();
            print("Avant : ");
            String chercher = readString();
            print("Après : ");
            String remplacer = readString();
            println(copieEnRemplacant(texte, chercher, remplacer));
        }

}
