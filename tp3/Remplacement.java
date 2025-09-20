class Remplacement extends Program {
    
    void algorithm(){
        String txt;
        char ancien, nouveau;
        print("Veuillez saisir votre texte : ");
        txt = readString();
        print("Caractère à remplacer : ");
        ancien = readChar();
        print("Caractère de remplacement : ");
        nouveau = readChar();

        String conca = "";

        for (int i = 0; i < length(txt); i = i + 1) {
            if (charAt(txt, i) == ancien) {
                conca = conca + nouveau;
            } else {
                conca = conca + charAt(txt, i);
            }
        }

        print(conca);
    }

}
