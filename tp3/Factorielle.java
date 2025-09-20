public class Factorielle extends Program {


    void algorithm() {
     // TODO: implement the algorithm
     print("Nombre pour le calcul de la factorielle : ");
     int n = readInt();
     int somme = 1;

     for (int i = 1; i < n; i = i + 1) {
        somme += somme * i;
     }
     println(n + "! = " + somme);
    }

}
