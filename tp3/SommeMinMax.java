class SommeMinMax extends Program {
        
    void algorithm(){
     // TODO: implement the algorithm
     int min = readInt();
     int max = readInt();
     int somme = 0;

     for (int i = min; i <= max; i = i + 1) {
        somme = somme + i;
     }
     println(somme);
    }

}
