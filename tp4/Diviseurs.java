class Diviseurs extends Program {

    void algorithm() {
        int n = readInt();
        print("Diviseurs :");
        String conca = "";

        for (int i = n; i >= 1; i--) {
            if (n % i == 0) {
                conca = conca + " " + i;
            }
        }
        println(conca + ".");
    }
    
}
