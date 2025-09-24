class NiOuiNiNon extends Program {

    void algorithm() {
        String phrase;

        do {
            phrase = readString();
        } while (!equals(phrase, "oui") && !equals(phrase, "non"));
        println("Perdu!");
    }

}
