class Bissextilite extends Program {

    String saisonMeteorologique (int mois) {
        String stockage = "";
        if (mois == 0) {
            stockage = "erreur";
        } else if (mois == 12 || mois == 1 || mois == 2) {
            stockage = "hiver";
        } else if (mois == 3 || mois == 4 || mois == 5) {
            stockage = "printemps";
        } else if (mois == 6 || mois == 7 || mois == 8) {
            stockage = "été";
        } else if (mois == 9 || mois == 10 || mois == 11) {
            stockage = "automne";
        }
        return stockage;
    }

    int nombreJoursMois(int numeroMois, int annee) {
        int stockage;
        
        if (numeroMois == 0 || numeroMois == 13) {
            stockage = 0;
        } else if (numeroMois == 2) {
            if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
                stockage = 29;
            } else {
                stockage = 28;
            }
        } else if (numeroMois == 1 || numeroMois == 3 || numeroMois == 5 || numeroMois == 7 || numeroMois == 8 || numeroMois == 10 || numeroMois == 12) {
            stockage = 31;
        } else {
            stockage = 30;
        }
        return stockage;
    }

    String jourSemaine(int jour) {
        String stockage = "Dimanche";
        if (jour == 1) {
            stockage = "Lundi";
        } else if (jour == 2) {
            stockage = "Mardi";
        } else if (jour == 3) {
            stockage = "Mercredi";
        } else if (jour == 4) {
            stockage = "Jeudi";
        } else if (jour == 5) {
            stockage = "Vendredi";
        } else if (jour == 6) {
            stockage = "Samedi";
        }
        return stockage;
    }

    String saisonAstronomique(int jour, int mois) {
        String stockage = saisonMeteorologique(mois);
        if ((mois >= 3 && mois <=6 ) || (mois >= 6 && mois <=9) || (mois >= 9 && mois <= 12) || (mois == 12)) {
            if (jour < 21) {
                stockage = saisonMeteorologique(mois-1);
            }
        }
        return stockage;
    }

    String moisAnnee(int mois) {
        String stockage = "Mois invalide";
        if (mois == 1) {
            stockage = "Janvier";
        } else if (mois == 2) {
            stockage = "Février";
        } else if (mois == 3) {
            stockage = "Mars";
        } else if (mois == 4) {
            stockage = "Avril";
        } else if (mois == 5) {
            stockage = "Mai";
        } else if (mois == 6) {
            stockage = "Juin";
        } else if (mois == 7) {
            stockage = "Juillet";
        } else if (mois == 8) {
            stockage = "Août";
        } else if (mois == 9) {
            stockage = "Septembre";
        } else if (mois == 10) {
            stockage = "Octobre";
        } else if (mois == 11) {
            stockage = "Novembre";
        } else if (mois == 12) {
            stockage = "Décembre";
        }
        return stockage;
    }

    void algorithm () {
        print("Année souhaitée : ");
        int annee = readInt();

        print("1er jour de l'année L(1), M(2), M(3), J(4), V(5), S(6) ou D(7) ? ");
        int premierJour = readInt();

        for (int mois = 0; mois <= 12; mois = mois + 1){
            println("");
            println(moisAnnee(mois) + " :");
            
            for (int jour = 1; jour <= nombreJoursMois(mois, annee); jour = jour + 1) {
                println("- "+ jourSemaine(premierJour) + " " + jour + " : " + saisonAstronomique(jour, mois));
                    
                premierJour++;
                if (premierJour > 7) {
                    premierJour = 1;
                }
            }
            
        }
        
        println("");
        print("Nombres de jours dans l'année " + annee + " : ");
        
        if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
            println("366 jours");
        } else {
            println("365 jours");
        }
    }

}