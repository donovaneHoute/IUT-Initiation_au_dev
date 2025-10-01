class SousChaine extends Program {

boolean contient(String chaine, String motif){
    boolean trouve = false;
    if (chaine == "" && motif == "") {
            trouve = true;
        }
    for (int i=0; i < length(chaine) - length(motif); i=i+1) {
        if (equals(substring(chaine, i, i + length(motif)), motif)) {
            trouve = true;
        }
    }
    return trouve;
}

void algorithm() {
    String chaine, motif;
    print("Veuillez entrer un texte : ");
    chaine = readString();
    print("Motif à chercher : ");
    motif = readString();
    if(contient(chaine,motif) == true) {
        println("trouvé");
    } else {
        println("pas trouvé");
    }
}

}
