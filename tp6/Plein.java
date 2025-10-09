class Plein extends Program {

    String triangle(int taille, char caractere) {
        String resultat = "";
        for (int idx = 1; idx <= taille; idx++) {
            for (int k = 0; k < idx; k++) {
                resultat += caractere;
            }
            resultat += "\n";
        }

        return resultat;
    }

    void testTriangle() {
        assertEquals("+\n++\n+++\n", triangle(3, '+'));
        assertEquals("a\naa\naaa\naaaa\naaaaa\n", triangle(5, 'a'));
    }

    void algorithm() {
        print("Taille : ");
        int taille = readInt();
        print("Caractere : ");
        char caractere = readChar();

        print(triangle(taille, caractere));
    }

}
