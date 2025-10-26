// Auteur : Donovane Houte
class Mastermind extends Program {

    // Démarre une nouvelle partie

    String nouvellePartie() {
        String stockage;

        println("\n=========================");
        println("  CHOIX DE LA DIFFICULTÉ");
        println("=========================\n");

        println("📍 Options disponibles :");
        println("  [1] Facile    ➤ 4 chiffres, 8 essais");
        println("  [2] Moyen     ➤ 6 chiffres, 10 essais");
        println("  [3] Difficile ➤ 8 chiffres, 12 essais\n");

        print("👉 Tapez Facile, Moyen ou Difficile pour commencer : ");
        stockage = readString();

        while (!equals(stockage, "Facile") && !equals(stockage, "Moyen") && !equals(stockage, "Difficile")) {
            print("❌ Entrée invalide. Veuillez réessayer : ");
            stockage = readString();
        }

        println("\n✅ Difficulté choisie : « " + stockage + " »");
        println("──────────────────────────────");
        
        return stockage;
    }

    // Génération du code pour la partie

    String generationCode(String difficulte, int maxEssaies, int essaies, int longueur) {
        String nombre = "";

        if (equals(difficulte, "Moyen")) {
            maxEssaies = 10;
            longueur = 6;
        } else if (equals(difficulte, "Difficile")) {
            maxEssaies = 12;
            longueur = 8;
        }

        while (length(nombre) < longueur) {
            int chiffre = (int) (random() * 10);
            boolean dejaPresent = false;

            for (int j = 0; j < length(nombre); j = j + 1) {
                if (charAt(nombre, j) == charAt("" + chiffre, 0)) {
                    dejaPresent = true;
                }
            }

            if (!dejaPresent) {
                nombre = nombre + chiffre;
            }
        }

        return nombre;
    }




    // Fonction pour pouvoir relancer une partie sans interruption

    void rejouer() {
        print("🔄 Voulez-vous rejouer ? (o/n) : ");
        char on = readChar();

        while (on != 'o' && on != 'n') {
            print("❌ Entrée invalide. Veuillez réessayer : ");
            on = readChar();
        }

        if (on == 'o') {
            println("──────────────────────────────────────────");
            start();
        } else if (on == 'n') {
            System.exit(0);
        }
    }

    // Gestion de la partie

    void partie() {
        String difficulte = nouvellePartie();

        int essaies = 0;
        int maxEssaies = 8;
        int longueur = 4;

        String nombre = generationCode(difficulte, maxEssaies, essaies, longueur);

        println("\n🔒 Code secret généré. Bonne chance !");
        println("──────────────────────────────");

        while (essaies < maxEssaies) {
            println("\n🚀 Essai #" + (essaies + 1) + " / " + maxEssaies);
            print("🔢 Entrez votre proposition (" + longueur + " chiffres) : ");
            String choix = readString();

            while (length(choix) != longueur) {
                print("❌ Entrée invalide. Veuillez réessayer : ");
                choix = readString();
            }

            int bienPlaces = 0;
            int malPlaces = 0;

            for (int j = 0; j < longueur; j = j + 1) {
                if (charAt(choix, j) == charAt(nombre, j)) {
                    bienPlaces = bienPlaces + 1;
                } else {
                    for (int k = 0; k < longueur; k = k + 1) {
                        if (charAt(choix, j) == charAt(nombre, k) && k != j) {
                            malPlaces = malPlaces + 1;
                        }
                    }
                }
            }

            println("\n📊 Résultat de votre proposition :");
            println("   ✅ Bien placés : " + bienPlaces);
            println("   ⚪ Mal placés  : " + malPlaces);

            if (bienPlaces == longueur) {
                println("\n🎉 Félicitations ! Vous avez découvert la combinaison secrète !");
                essaies = maxEssaies;
            } else {
                println("⏳ Essais restants : " + (maxEssaies - essaies - 1));
            }

            essaies = essaies + 1;
        }

        if (essaies == maxEssaies) {
            println("\n💥 Vous avez épuisé vos essais...");
            println("🔐 Le code secret était : " + nombre);
        }

        println("\n──────────── FIN DE LA PARTIE ────────────");

        rejouer();
    }

    // Gestion des règles

    void regles() {
        println("\n════════════════════════════════════════");
        println("    📜 RÈGLES DU JEU MASTERMIND 📜");
        println("════════════════════════════════════════\n");

        println("🔹 Votre objectif : deviner la combinaison secrète.");
        println("🔹 Pour chaque proposition, vous recevrez deux indices :");
        println("   - ✔️  Chiffres bien placés");
        println("   - ⚪  Chiffres présents mais mal placés");
        println("🔹 Le nombre d’essais dépend de la difficulté choisie.\n");

        println("Bonne chance et amusez-vous bien ! 🎯");
        print("Entrer 'q' pour pouvoir quitter le menu des règles : ");
        char q = readChar();

        while (q != 'q') {
            print("❌ Entrée invalide. Veuillez réessayer : ");
            q = readChar();
        }

        println("────────────────────────────────────────\n");
        start();
    }

    // Menu du début

    void start() {
        println("\n🎮 ===============================");
        println("       BIENVENUE DANS MASTERMIND");
        println("🎮 ===============================\n");

        println("Que voulez-vous faire ?");
        println("  [1] ▶️  Nouvelle partie");
        println("  [2] 📜  Lire les règles");
        println("  [3] ❌  Quitter\n");

        print("👉 Entrez le numéro correspondant : ");
        int choix = readInt();

        while (choix < 1 || choix > 3) {
            print("❌ Entrée invalide. Veuillez réessayer : ");
            choix = readInt();
        }

        if (choix == 1) {
            partie();
        } else if (choix == 2) {
            regles();
        } else {
            println("\n👋 Merci d’avoir joué ! À très vite !");
            System.exit(0);
        }
    }




    void algorithm() {
        start();
    }
}