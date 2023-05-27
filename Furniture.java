public class Furniture{
    String nazwa;
    int cena;
    private static final double VAT = 0.23;

    public Furniture(String name, int price){
        this.nazwa = name;
        this.cena = price;
    }

    double getPriceWithoutVat() {
        return cena;
    }
    double getPriceWithVat() {
        return cena+(cena*VAT);
    }
}