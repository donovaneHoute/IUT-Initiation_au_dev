class NombreMajuscules extends Program {

    void algorithm() {
        print("Votre texte : ");
        String texte = readString();
        // à compléter /* TODO: Complete this */
        int majuscule = 0;
        for (int i = 0; i < length(texte); i = i + 1) {
            if (charAt(texte, i) >= 'A' && charAt(texte, i) <= 'Z') {
                majuscule = majuscule + 1;
            }
        }

        println("Il y a " + majuscule + " majuscule(s) dans votre texte.");
    }
    
}
