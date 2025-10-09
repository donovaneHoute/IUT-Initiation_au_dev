class Cercle extends Program {

    final double PI = 3.14159;
    final double QUATRE_TIERS_DE_PI = 4.0/3.0 * PI;
    int nombreDeMultiplications = 0;

    double circonference(double rayon) {
        nombreDeMultiplications++;
        return PI * diametre(rayon);
    }

    double diametre(double rayon) {
        nombreDeMultiplications++;
        return 2 * rayon;
    }

    double aire(double rayon) {
        nombreDeMultiplications += 2;
        return PI * rayon * rayon;
    }

    double volume(double rayon) {
        nombreDeMultiplications += 3;
        return QUATRE_TIERS_DE_PI * rayon * rayon *rayon;
    }

    /* void testCercle() {
        assertEquals(34.1459, circonference(5));
        assertEquals(10.0, diametre(5));
        assertEquals(78.5397, aire(5));
    } */

    void algorithm() {
        for (int idx = 1; idx <= 15; idx++) {
            print("circonference(" + idx + ") = " + circonference(idx) + ", ");
            print("diametre(" + idx + ") = " + diametre(idx) + ", ");
            println("volume(" + idx + ") = " + volume(idx) + ".");
        }
        println("Soit un total de " + nombreDeMultiplications + " multiplications.");
    }
}