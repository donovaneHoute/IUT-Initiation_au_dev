class Bissextile extends Program {
    boolean bissextile(int annee) {
        boolean bissextile = false;
        if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
            bissextile = true;
        }
        return bissextile;
    }

    void algorithm() {
        print("Qu'elle année veux-tu ? : ");
        int annee = readInt();
        
        println(bissextile(annee));
        
    }
}
