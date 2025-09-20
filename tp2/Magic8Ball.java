class Magic8Ball extends Program {
    void algorithm() {
        println("Bienvenue dans le Magic8Ball");
        println("");
        print("Votre question : ");
        String question = readString();

        int choixType = (int) (random()*2);
        int evasive = (int) (random()*6);
        int affirmative = (int) (random()*7);
        int neagtive = (int) (random()*5);

        String typeQuestion, evasiveQuestion, affirmativeQuestion, negativeQuestion;

        if (choixType == 0) {
            typeQuestion = "Réponses évasives";
        } else if (choixType == 1) {
            typeQuestion = "Réponses affirmatives";
        } else {
            typeQuestion = "Réponses négatives";
        }

        if (equals(typeQuestion, "Réponses évasives")) {
            if (evasive == 0) {
                println("Essaye plus tard");
            } else if (evasive == 1) {
                println("Essaye encore");
            } else if (evasive == 2) {
                println("Pas d'avis");
            } else if (evasive == 3) {
                println("C'est ton destin");
            } else if (evasive == 4) {
                println("Le sort est jeté");
            } else if (evasive == 5) {
                println("Une chance sur deux");
            } else {
                println("Repose ta question");
            }
        }
        
        if (equals(typeQuestion, "Réponses affirmatives")) {
            if (affirmative == 0) {
                println("D'après moi oui");
            } else if (affirmative == 1) {
                println("C'est certain");
            } else if (affirmative == 2) {
                println("Oui absolument");
            } else if (affirmative == 3) {
                println("Tu peux compter dessus");
            } else if (affirmative == 4) {
                println("Sans aucun doute");
            } else if (affirmative == 5) {
                println("Très probable");
            } else if (affirmative == 6) {
                println("Oui");
            } else {
                println("C'est bien parti");
            }
        }

        if (equals(typeQuestion, "Réponses négatives")) {
            if (neagtive == 0) {
                println("C'est non");
            } else if (neagtive == 1) {
                println("Peu probable");
            } else if (neagtive == 2) {
                println("Faut pas rêver");
            } else if (neagtive == 3) {
                println("N'y compte pas");
            } else if (neagtive == 4) {
                println("Impossible");
            }
        }

    }
}