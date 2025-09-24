class Syracuse extends Program {
    
    void algorithm() {
        print("Entrez un nombre: ");
        int n = readInt();
        print("Trajectoire: ");
        String conca = "";
        
        while (n != 1) {
            conca = conca + n + ", ";
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = (n * 3) + 1;
            }
        }
        println(conca + "1.");
    }

}
