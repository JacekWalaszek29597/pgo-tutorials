public class Product {
    private String nazwa;
    private double cena;
    private int kodProduktu;
    private int liczbaSztuk;



    public Product(String nazwa, double cena, int kodProduktu, int liczbaSztuk) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.kodProduktu = kodProduktu;
        this.liczbaSztuk = liczbaSztuk;
    }

    public Product(String nazwa, double cena, int kodProduktu) {
        this(nazwa,cena,kodProduktu,0);
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getKodProduktu() {
        return kodProduktu;
    }

    public void setKodProduktu(int kodProduktu) {
        this.kodProduktu = kodProduktu;
    }

    public int getLiczbaSztuk() {
        return liczbaSztuk;
    }

    public void setLiczbaSztuk(int liczbaSztuk) {
        if(liczbaSztuk<0){
            this.liczbaSztuk =0;
        }
        this.liczbaSztuk = liczbaSztuk;
    }

    public void zmianaIloasc(int nowaIlosc) {
        if (nowaIlosc < 0) {
            nowaIlosc =0;
        }
        this.liczbaSztuk = nowaIlosc;
    }

    public void zmianaCeny(double nowaCena) {
        this.cena = nowaCena;
    }

    public String Wyswitl() {
        return "Nazwa: " + nazwa + ", Cena: " + cena + ", Kod produktu: " + kodProduktu + ", Ilość: " + liczbaSztuk;
    }

}
