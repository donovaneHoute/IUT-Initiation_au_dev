class DoublerCaracteres extends Program {
    void algorithm() {
     // TODO: implement the algorithm
     String c = readString();

     for (int i = 0; i < length(c); i = i + 1) {
        print(charAt(c, i) + "" + charAt(c, i));
     }
    }
}
