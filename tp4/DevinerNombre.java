class DevinerNombre extends Program {

    void algorithm() {
        int intervalleMin = 0;
        int intervalleMax = 100;
        int nombre = (intervalleMax + intervalleMin) / 2;
        char plusouMoins;

        do {
            println("Est-ce que le nombre est "+nombre+" ?");
            plusouMoins = readChar();
            if (plusouMoins == '-') {
                intervalleMax = nombre;
            } else if (plusouMoins == '+') {
                intervalleMin = nombre;
            }
            nombre = (intervalleMax + intervalleMin) / 2;
        } while (plusouMoins != '=');

        println("Il fallait trouver "+nombre+ " !");
    }
    
}
