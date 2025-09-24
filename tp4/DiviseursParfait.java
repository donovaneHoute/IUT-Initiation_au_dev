class DiviseursParfait extends Program {

    void algorithm() {
        int n = readInt();
        print("Diviseurs :");
        String conca = "";
        int somme = 0;

        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                conca = conca + " " + i;
                somme = somme + i;
            }
        }
        println(conca + ".");
        if (somme == n*2) {
            println("Nombre parfait !");
        }
    }
    
}
