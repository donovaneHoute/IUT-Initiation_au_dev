class SommeMultiples extends Program {

    void algorithm(){
     // TODO: implement the algorithm
     int min = readInt();
     int max = readInt();
     int multiple = readInt();
     int somme = 0;

     for (int i = min; i <= max; i = i + 1) {
        if (i % multiple == 0) {
            somme = somme + i;
        }
     }
     println(somme);
    }

}
