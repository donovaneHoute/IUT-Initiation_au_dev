class DoublerPonctuation extends Program {
    void algorithm() {
     // TODO: implement the algorithm7
     String c = readString();
     String conca = "";

     for (int i = 0; i < length(c); i = i + 1) {
        char v = charAt(c, i);
        if (v == '!' || v == '?') {
            conca = conca + v + "" + v;
        } else {
            conca = conca + v;
        }
     }
     println(conca);
    }
}
