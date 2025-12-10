package ma.exerc_2;

public class Main {
    public static void main(String[] args) {
        // 1. Création des filières
        Filiere info   = new Filiere("Informatique");
        Filiere genie  = new Filiere("Génie Civil");

        // 2. Création des étudiants (noms marocains)
        Etudiant e1 = new Etudiant("El Idrissi", "Mohamed");
        Etudiant e2 = new Etudiant("Bentaleb", "Fatima");
        Etudiant e3 = new Etudiant("Chouaib",   "Youssef");
        Etudiant e4 = new Etudiant("Lahlou",    "Salma");
        Etudiant e5 = new Etudiant("Roussafi",  "Hassan");
        Etudiant e6 = new Etudiant("Amrani",    "Aïcha");

        // 3. Associations Étudiant ↔ Filière
        info.ajouterEtudiant(e1);
        info.ajouterEtudiant(e2);
        info.ajouterEtudiant(e3);
        info.ajouterEtudiant(e4);
        info.ajouterEtudiant(e5);
        info.ajouterEtudiant(e6);  // déclenche agrandissement

        genie.ajouterEtudiant(new Etudiant("Belkahia", "Khadija"));
        genie.ajouterEtudiant(new Etudiant("Laaroussi","Walid"));

        // 4. Affichage
        System.out.println(info);
        info.afficherEtudiants();
        System.out.println();

        System.out.println(genie);
        genie.afficherEtudiants();
        System.out.println();

        // 5. Affichage d’un étudiant
        System.out.println("Détail de e3 : " + e3);
    }
}
