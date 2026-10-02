package lab4;

public class Testt {

    public static void main(String[] args) {


        
        // ETAPE 3 : Constructeur par defaut
        
        // Voiture voiture = new Voiture();


        
        // ETAPE 4 : Constructeur parametre
        
        // Voiture voiture = new Voiture(
        //     "Toyota",
        //     "Corolla",
        //     0.0,
        //     2023
        // );


        
        // ETAPE 5 : Constructeur de copie
        
        // Voiture voiture1 = new Voiture(
        //     "Toyota",
        //     "Corolla",
        //     100,
        //     2023
        // );
        //
        // Voiture voiture2 = new Voiture(voiture1);


        
        // ETAPE 6 : Getters et setters
        
        // voiture.setMarque("Toyota");
        // System.out.println(voiture.getMarque());
        //
        // voiture.setVitesse(100);
        // System.out.println(voiture.getVitesse());
        //
        // voiture.setAnnee(2020);
        // System.out.println(voiture.getAnnee());


        
        // ETAPE 7 : Validation des setters
        
        // voiture.setVitesse(-50);
        // voiture.setMarque("");
        // voiture.setAnnee(2030);


        // ETAPE 8 : Methodes metier
        

        // Creation d une voiture
        Voiture voiture = new Voiture(
            "Toyota",
            "Corolla",
            100,
            2023
        );

        // Afficher les informations initiales
        voiture.afficherInformations();

        // Accelerer de 50 km/h
        voiture.accelerer(50);

        // Freiner de 20 km/h
        voiture.freiner(20);

        // Afficher les informations finales
        voiture.afficherInformations();
    }
}