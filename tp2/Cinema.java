class Cinema extends Program {
    
    void algorithm() {
     print("Age du spectateur : ");
     int age = readInt();

     print("Option 3D ? (1 si oui, autre chiffre si non) : ");
     int option = readInt();

     print("Abonné ? (1 si oui, autre chiffre si non) : ");
     int abonne = readInt();

     double cout = 12;
     if (age < 10) {
        cout = cout / 2;
     } else if ((age < 16) || (age > 60)) {
        cout = cout - 3;
     }

     if (option == 1) {
        cout = cout + 2;
     }

     if (abonne == 1) {
        cout = cout * 0.8;
     }
     println("Coût du billet : " + cout + " euros");
      
    }

}
