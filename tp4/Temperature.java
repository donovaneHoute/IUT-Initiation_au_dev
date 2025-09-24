class Temperature extends Program {
    void algorithm() {
        println("Saisir une suite de valeurs entières terminée par -273.");
        int temperature = readInt();
        int maximum = -273;

        while (temperature != -273) {
            if (temperature > maximum) {
                maximum = temperature;
            }
            temperature = readInt();
        }
        println("Le maximum est "+maximum+".");
    }
}
