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
        // Faire la fonction
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
    }
}