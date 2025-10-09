class TestBissextile extends Program {

    boolean bissextile(int annee) {
        boolean bissextile = false;
        if (annee % 4 == 0 && annee % 100 != 0 || annee % 400 == 0) {
            bissextile = true;
        }
        return bissextile;
    }

    void test_bissextile_true() {
        assertEquals(true, bissextile(2000));
        assertEquals(true, bissextile(2012));
        assertEquals(true, bissextile(2024));
        assertEquals(true, bissextile(1600));
    }
    void test_bissextile_false() {
        assertEquals(false, bissextile(2013));
        assertEquals(false, bissextile(2006));
        assertEquals(false, bissextile(1999));
        assertEquals(false, bissextile(1000));
    }

    void algorithm() {
        print("Qu'elle année veux-tu ? : ");
        int annee = readInt();
        
        println(bissextile(annee));
        
    }

}
