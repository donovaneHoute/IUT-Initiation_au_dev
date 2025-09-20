class NettoyerChaine extends Program {

    void algorithm() {
        String chaine = readString();
        println("Avant nettoyage :");
        println(">"+chaine+"<");
        if (length(chaine) > 0) {
            if (equals(substring(chaine, 0, 1), " ")) {
                chaine = substring(chaine, 1, length(chaine));
            }
            if (equals(substring(chaine, length(chaine)-1, length(chaine)), " ")) {
                chaine = substring(chaine, 0, length(chaine)-1);
            }
        }
        println("Après nettoyage :");
        println(">"+chaine+"<");
    }
    
}
