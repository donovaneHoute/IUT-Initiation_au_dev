class Iut extends Program {
    void dessineLigne(int n, char c) {
        for (int i=0; i<n; i=i+1) {
            print(c);
        }
        println("");
    }
    void dessineMilieu(int n, char c) {
        for (int i=0; i<n/2; i=i+1) {
            print(" ");
        }
        print(c);
        println("");
    }
    void dessineExtre(int n, char c) {
        for (int i=0; i<n-1; i=i+1) {
            print(c);
            for (int j=0; j<n-2; j=j+1) {
                print(" ");
            }
            println(c);
        }
    }
    void dessinerI(int n, char c) {
        dessineLigne(n, c);
        for (int i=0; i<n-2; i=i+1) {
            dessineMilieu(n, c);
        }
        dessineLigne(n, c);
    }
    void dessinerU(int n, char c) {
        dessineExtre(n, c);
        dessineLigne(n, c);
    }
    void dessinerT(int n, char c) {
        dessineLigne(n, c);
        for (int i=0; i<n-1; i=i+1) {
            dessineMilieu(n, c);
        }
    }

    void algorithm(){
        print("Taille : ");
        int t = readInt();
        dessinerI(t, 'I');
        println("");
        dessinerU(t, 'U');
        println("");
        dessinerT(t, 'T');
    }
}
