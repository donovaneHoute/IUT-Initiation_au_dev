class Intervalle extends Program {
    void algorithm () {
        int borneInf, borneSup;

        print("Entrez la borne inférieure : ");
        borneInf = readInt();
        print("Entrez la borne supérieure : ");
        borneSup = readInt();

        if (borneInf > borneSup) {
            println("Cet intervalle est vide.");
        } else {
            println("Cet intervalle n'est pas vide.");
        }
    }
}