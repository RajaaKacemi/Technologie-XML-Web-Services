package genericite;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        MetierProduitImpl metier = new MetierProduitImpl();


        Scanner sc = new Scanner(System.in);
        int choix;

        do{
            System.out.println("\nMenu :");
            System.out.println("1. Afficher la liste des produits.");
            System.out.println("2. Rechercher un produit par son id.");
            System.out.println("3. Ajouter un nouveau produit dans la liste.");
            System.out.println("4. Supprimer un produit par id.");
            System.out.println("5. Quitter le programme.");
            System.out.print("Votre choix : ");
            choix = sc.nextInt();

            switch (choix) {
                case 1:
                    System.out.println("Liste des produits :");
                    for (Produit produit : metier.getAll()) {
                        System.out.println(produit);
                    }
                    break;

                case 2:
                    System.out.print("Entrez l'id du produit : ");
                    long idRecherche = sc.nextLong();
                    Produit produitTrouve = metier.findById(idRecherche);
                    if (produitTrouve != null) {
                        System.out.println("Produit trouvé : " + produitTrouve);
                    } else {
                        System.out.println("Aucun produit trouvé avec cet id.");
                    }
                    break;

                case 3:
                    System.out.print("Entrez l'id : ");
                    long id = sc.nextLong();
                    sc.nextLine(); // Consommer le saut de ligne
                    System.out.print("Entrez le nom : ");
                    String nom = sc.nextLine();
                    System.out.print("Entrez la marque : ");
                    String marque = sc.nextLine();
                    System.out.print("Entrez le prix : ");
                    double prix = sc.nextDouble();
                    sc.nextLine(); // Consommer le saut de ligne
                    System.out.print("Entrez la description : ");
                    String description = sc.nextLine();
                    System.out.print("Entrez le nombre en stock : ");
                    int stock = sc.nextInt();

                    Produit produit = new Produit(id, nom, marque, description, stock, prix);
                    metier.add(produit);
                    System.out.println("Produit ajouté avec succès.");
                    break;

                case 4:
                    System.out.print("Entrez l'id du produit à supprimer : ");
                    long idSuppression = sc.nextLong();
                    metier.delete(idSuppression);
                    System.out.println("Produit supprimé (si existant).");
                    break;

                case 5:
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide. Réessayez.");
            }
        } while (choix != 5);

        sc.close();
    }
}
