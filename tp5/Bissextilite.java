class Bissextilite extends Program {

    String saisonMeteorologique (int mois) {
        String stockage = "";
        if (mois == 0 || mois == 13) {
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

    String saisonAstronomique(int jour, int mois) {
        String stockage = saisonMeteorologique(mois);
        if ((mois >= 3 && mois <=6 ) || (mois >= 6 && mois <=9) || (mois >= 9 && mois <=12) || (mois == 12)) {
            if (jour < 21) {
                stockage = saisonMeteorologique(mois-1);
            }
        }
        return stockage;
    }

    void algorithm () {
        print("Choisi l'année : ");
        int annee = readInt();

        for (int m=0;m<=13;m=m+1){
            for (int j=1; j<=nombreJoursMois(m, annee); j=j+1) {
                println(j + "/" + m + " : " + saisonAstronomique(j, m));
            }
            
        }
        print("Nombres de jours dans l'année " + annee + " : ");
        if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
            println("366 jours");
        } else {
            println("365 jours");
        }
    }

}