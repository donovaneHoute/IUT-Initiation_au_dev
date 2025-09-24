class PGCD extends Program {

    void algorithm() {
        int a = readInt();
        int b = readInt();
        int reste ;
        
        while (a % b != 0) {
            reste = a%b;
            a = b;
            b = reste;
        }
        
        println("Le pgcd est "+b);
    }

}
