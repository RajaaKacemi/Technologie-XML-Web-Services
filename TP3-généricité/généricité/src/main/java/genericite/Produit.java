package genericite;

public class Produit {
    private long id;
    private String nom;
    private String marque;
    private String description;
    private double prix;
    private int stock;

    public Produit() {
        super();
    }

    public Produit(long id, String nom, String marque, String description, int stock, double prix) {
        this.id = id;
        this.nom = nom;
        this.marque = marque;
        this.description = description;
        this.stock = stock;
        this.prix = prix;
    }

    public String getNom() {
        return nom;
    }

    public String getMarque() {
        return marque;
    }

    public long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public double getPrix() {
        return prix;
    }

    public int getStock() {
        return stock;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setStock(int stock) {
        this.stock= stock;
    }
}
