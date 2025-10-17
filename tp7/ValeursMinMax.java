class ValeursMinMax extends Program {

    void test_minMax() {
        assertArrayEquals(new int[]{1,3}, minMax(new int[]{2,1,3}));
        assertArrayEquals(new int[]{2,2}, minMax(new int[]{2,2,2}));
        assertArrayEquals(new int[]{-1,3}, minMax(new int[]{3,-1,2}));
    }

    void test_indicesMinMax() {
        assertArrayEquals(new int[]{1,2}, indicesMinMax(new double[]{2.1, 1.5, 3.0}));
        assertArrayEquals(new int[]{0,0}, indicesMinMax(new double[]{2.1, 2.1, 2.1}));
        assertArrayEquals(new int[]{1,0}, indicesMinMax(new double[]{3.0, -1.9, 2.5}));
    }

    int[] minMax(int[] tableau){
        int[] tableauRetour = new int[2];
        
        int min = tableau[0];
        int max = tableau[0];

        for (int idx = 0; idx < length(tableau); idx++) {
            if (tableau[idx] <= min) {
                min = tableau[idx];
                tableauRetour[0] = min;
            }
            if (tableau[idx] >= max) {
                max = tableau[idx];
                tableauRetour[1] = max;
            }
        }

        return tableauRetour;
    }

    int[] indicesMinMax(double[] tableau){
        int[] tableauRetour = new int[2];
        
        double min = tableau[0];
        double max = tableau[0];

        for (int idx = 0; idx < length(tableau); idx++) {
            if (tableau[idx] < min) {
                min = tableau[idx];
                tableauRetour[0] = idx;
            }
            if (tableau[idx] > max) {
                max = tableau[idx];
                tableauRetour[1] = idx;
            }
        }

        return tableauRetour;
    }

    void algorithm() {
    }

}
