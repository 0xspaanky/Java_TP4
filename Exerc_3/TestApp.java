package ma.projet.test;

import ma.projet.bean.Categorie;
import ma.projet.bean.Article;

public class TestApp {
    public static void main(String[] args) {

        // === 1) Create categories ===
        Categorie[] categories = new Categorie[2];
        categories[0] = new Categorie("Ordinateur Portable", "O PR");
        categories[1] = new Categorie("Ordinateur Poste", "O PO");

        // === 2) Create articles ===
        Article[] articles = new Article[4];
        articles[0] = new Article(14, "DELL INSPIRON", categories[0]);
        articles[1] = new Article(4, "SONY VAIO", categories[0]);
        articles[2] = new Article(74, "TERRA", categories[1]);
        articles[3] = new Article(785, "HP Compaq", categories[1]);

        // === 3) Display articles grouped by category ===
        for(Categorie cat : categories) {
            System.out.println(cat.getLibelle() + " :");
            for(Article art : articles) {
                if(art.getCategorie().getId() == cat.getId()) {
                    System.out.println("  - " + art);  // toString: id code designation
                }
            }
            System.out.println();
        }
    }
}
