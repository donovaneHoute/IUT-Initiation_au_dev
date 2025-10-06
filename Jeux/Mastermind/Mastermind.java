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
            int chiffre = (int) (random()*10);
            nombre = nombre + chiffre;
        }

        println(nombre);

    
        while (essaies < maxEssaies) {
            println("Premier choix (exemple : 1234) : ");
            String choix = readString();

            // Faire en sorte que ça dise trouvé si le chiffre est à la bonne place et pas au bonne endroit si le chiffre est dedans mais pas à la bonne place
            if (charAt(choix, j) == charAt(nombre, j)) {
                println("Trouvé !");
            }

            essaies = essaies + 1;
        }
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
