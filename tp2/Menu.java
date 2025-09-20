class Menu extends Program {

    void algorithm() {
     println("Bienvenue dans le SuperLogicielDeLanTroisMille");
     println("");
     println("1. Ouvrir un document existant.");
     println("2. Créer un nouveau document.");
     println("3. Enregistrer le document courant.");
     println("4. Quitter ce magnifique logiciel.");
     println("");
     print("Veuillez entrer votre choix:");
     int choix = readInt();
     if (choix == 1) {
        println("Vous avez choisi: \"Ouvrir un document existant.\"");
     } else if (choix == 2) {
        println("Vous avez choisi: \"Créer un nouveau document.\"");
     } else if (choix == 3) {
        println("Vous avez choisi: \"Enregistrer le document courant.\"");
     } else {
        println("Vous avez choisi: \"Quitter ce magnifique logiciel.\"");
     }
    }
}
