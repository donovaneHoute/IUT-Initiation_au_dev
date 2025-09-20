class Suffixe extends Program {
    
    void algorithm() {
     print("Entrez une chaîne de caractère : ");
     String chaine = readString();

     print("Nombre de lettres de fin souhaitées : ");
     int nbLettres = readInt();

     print("Résultat : ");
     if (nbLettres > length(chaine)) {
        println("Erreur, pas assez de caractères !");
     } else {
        println(substring(chaine, length(chaine) - nbLettres, length(chaine)));
     }
    }

}
