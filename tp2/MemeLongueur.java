class MemeLongueur extends Program{  
    
    void algorithm(){
        String mot1 = readString();
        String mot2 = readString();
        int longueurMot1 = length(mot1);
        int longueurMot2 = length(mot2);
        boolean memeLongueur = length(mot1) == length(mot2);
        println("Les deux mots sont de même longueur : " + memeLongueur);
    }
    
}
