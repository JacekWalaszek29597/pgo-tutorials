import java.util.ArrayList;
import java.util.List;

public class Category {
    private String nazwaKategorii;

    private List<Product> products;

    public Category(String nazwaKategorii) {
        this(nazwaKategorii, new ArrayList<>());
    }

    public Category(String nazwaKategorii, List<Product> products) {
        this.nazwaKategorii = nazwaKategorii;
        this.products = products;
    }

    public String getNazwaKategorii() {
        return nazwaKategorii;
    }

    public void setNazwaKategorii(String nazwaKategorii) {
        this.nazwaKategorii = nazwaKategorii;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void dodajProdukt(Product product) {
        products.add(product);
    }

    public void usunProdukt(Product product) {
        products.remove(product);
    }

}
