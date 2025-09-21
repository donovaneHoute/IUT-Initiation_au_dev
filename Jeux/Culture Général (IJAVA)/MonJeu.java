class MonJeu extends Program {
    
    void algorithm(){
        
        int pointsA = 0;
        int pointsB = 0;

        double randomQuestion = (random()*0);

        String question = "";
        String gagnant = "";
        String etatJeu = "Attente";
        String fin = "false";
        String A = "JoueurA";
        String B = "JoueurB";
        int touche = 0;

        while (!equals(etatJeu, "Jeu")) {
            println("Bienvenue dans le jeu de culture générale !");
            println("");
            println("Utilisation des touches suivantes :");
            println("1 : Règles");
            println("2 : Jouer");
            println("3 : Quitter");
            println("");

            print("Que souhaitez-vous faire ? : ");
            touche = readInt();

            while (touche < 1 || touche > 3) {
                println("La sasie est incorrect");
                println("");
                print("Que souhaitez-vous faire ? : ");
                touche = readInt();
            }

            if (touche == 1) {
                touche = 1;
                println("");
                println("REGLES DU JEU");
                println("");
                println("Pour quitter les règles du jeu appuyez sur 'q'");

                char choixQ = readChar();

                while (choixQ != 'q') {
                    println("La saisie est invalide, veuillez recommencer !");
                    choixQ = readChar();
                }
            } else if (touche == 2) {
                etatJeu = "Jeu";

                println("Veuillez choisir l'une des catégories suivants pour le quiz' : ");
                println("");
                println("1. Histoire");
                println("2. Géographie");
                println("3. Jeux");
                println("");
                
                int categorieQuestion = readInt();

                while (categorieQuestion < 1 || categorieQuestion > 3) {
                    println("Mauvaise saisie réassayez");
                    println("");
                    println("Veuillez choisir l'une des catégories suivants pour le quiz' : ");
                    println("");
                    println("1. Histoire");
                    println("2. Géographie");
                    println("3. Jeux");
                    println("");
                    categorieQuestion = readInt();
                }
                
                if (categorieQuestion == 1) {
                    question = "Histoire";
                } else if (categorieQuestion == 2) {
                    question = "Géographie";
                } else if (categorieQuestion == 3) {
                    question = "Jeux";
                }

                print("Veuillez entrer le nom du joueur A : ");
                A = readString();

                print("Veuillez entrer le nom du joueur B : ");
                B = readString();

                touche = 2;

                char reponse;

                if (equals(question, "Histoire")) {
                    if (randomQuestion == 0) {
                        println("");
                        println(A + " | Question 1 : ");
                        println("Réponse A | Réponse B");
                        println("Réponse C | Réponse D");
                        
                        reponse = readChar();

                        while (reponse < 'A' || reponse > 'C') {
                            print("Erreur dans la saisie de la réponse, recommencez : ");
                            reponse = readChar();
                        }
                        if (reponse == 'A') {
                            println("Bonne réponse !");
                            pointsA = pointsA + 1;
                        } else {
                            println("Mauvaise réponse !");
                        }
                    }
                }

            } else {
                System.exit(0);
            }
        }

        while (touche != 2 && equals(fin, "false") && equals(etatJeu, "Jeu")) {
            if (pointsA == 10 || pointsB == 10){
                if (pointsA == 10) {
                    gagnant = A;
                } else {
                    gagnant = B;
                }
                println("Félicitation ! Le joueur " + A + " viens de gagner la partie !");
                fin = "true";
            }
        }
    }
}
