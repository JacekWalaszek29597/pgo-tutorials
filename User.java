public class User {
    private String imie;
    private String nazwisko;
    private String email;
    private String haslo;
    private boolean czyGosc;

    public User(String imie,String nazwisko,String email,String haslo) {
        setImie(imie);
        setNazwisko(nazwisko);
        setEmail(email);
        setHaslo(haslo);
        this.czyGosc= false;
    }
    public User(String email){
        setEmail(email);
        this.czyGosc= true;
    }
    public void zmianaNaUzytkownika(String imie,String nazwisko,String haslo){
        setImie(imie);
        setNazwisko(nazwisko);
        setHaslo(haslo);
        this.czyGosc= false;
    }
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHaslo() {
        return haslo;
    }

    public void setHaslo(String haslo) {
        this.haslo = haslo;
    }

    public boolean getCzyGosc() {
        return czyGosc;
    }

    public void setCzyGosc(boolean czyGosc) {
        this.czyGosc = czyGosc;
    }
}


