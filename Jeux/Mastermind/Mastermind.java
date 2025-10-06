class Mastermind extends Program {
    String nouvellePartie() {
        String stockage;

        println("\n====================================");
        println("🧩  CHOIX DE LA DIFFICULTÉ");
        println("====================================");
        println("🔹 Facile    ➤ 4 chiffres, 8 essais");
        println("🔸 Moyen     ➤ 6 chiffres, 10 essais");
        println("🔺 Difficile ➤ 8 chiffres, 12 essais");
        println("====================================\n");

        print("👉 Entrez la difficulté (Facile / Moyen / Difficile) : ");
        stockage = readString();

        while (!equals(stockage, "Facile") && !equals(stockage, "Moyen") && !equals(stockage, "Difficile")) {
            print("❌ Entrée invalide. Recommencez : ");
            stockage = readString();
        }

        println("\n✅ Difficulté sélectionnée : " + stockage);
        return stockage;
    }

    void partie() {
        String difficulte = nouvellePartie();

        int essaies = 0;
        int maxEssaies = 8;
        int longueur = 4;
        String nombre = "";

        if (equals(difficulte, "Moyen")) {
            maxEssaies = 10;
            longueur = 6;
        } else if (equals(difficulte, "Difficile")) {
            maxEssaies = 12;
            longueur = 8;
        }

        for (int i = 0; i < longueur; i = i + 1) {
            int chiffre = (int) (random() * 10);
            nombre = nombre + chiffre;
        }

        println("\n💡 (Debug) Code secret : " + nombre + "\n");

        while (essaies < maxEssaies) {
            println("────────────────────────────────────");
            print("🔢 Entrez votre proposition (" + longueur + " chiffres) : ");
            String choix = readString();
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

            println("\n📊 Résultat de l’essai #" + (essaies + 1) + " :");
            println("✔️  Bien placés  : " + bienPlaces);
            println("⚪  Mal placés   : " + malPlaces);

            if (bienPlaces == longueur) {
                println("\n🎉 Bravo ! Vous avez trouvé la combinaison secrète !");
                essaies = maxEssaies;
            } else {
                println("🔁 Essais restants : " + (maxEssaies - essaies - 1));
            }

            essaies = essaies + 1;
        }

        println("\n💀 Fin de la partie !");
    }
    
    void regles() {
        println("\n📜 RÈGLES DU JEU MASTERMIND 📜");
        println("------------------------------------");
        println("🔹 Le but est de deviner une combinaison secrète de chiffres.");
        println("🔹 À chaque essai, vous recevez des indices :");
        println("   ✔️  Bon chiffre et bonne position");
        println("   ⚪  Bon chiffre mais mauvaise position");
        println("🔹 Vous avez un nombre limité d'essais selon la difficulté.");
        println("🔹 Utilisez votre logique pour trouver la combinaison !");
        println("------------------------------------\n");
    }

    void start() {
        println("====================================");
        println("🎮  BIENVENUE DANS LE MASTERMIND  🎮");
        println("====================================\n");

        println("Que souhaitez-vous faire ?");
        println("------------------------------------");
        println("1️⃣  ▶️  Lancer une nouvelle partie");
        println("2️⃣  📜  Lire les règles du jeu");
        println("3️⃣  ❌  Quitter le jeu");
        println("------------------------------------\n");

        print("👉 Veuillez entrer le numéro de votre choix : ");
        int choix = readInt();

        while (choix < 1 || choix > 3) {
            println("\n❌ Erreur : choix invalide !");
            print("🔁 Veuillez entrer un numéro entre 1 et 3 : ");
            choix = readInt();
        }

        if (choix == 1) {
            nouvellePartie();
        } else if (choix == 2) {
            regles();
        } else {
            println("\n👋 Merci d’avoir joué. À bientôt !");
            System.exit(0);
        }
    }

    void algorithm() {
        start();
        partie();
    }
}
