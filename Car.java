public class Car {
    String color;
    String marka;
    double pojemnosc;

    public Car(String color, String marka,  double pojemnosc) {
        this.color = color;
        this.marka = marka;
        this.pojemnosc = pojemnosc;
    }
// Zadanie 3

        public String getColor() {
            return this.color;
        }
        public String getMarka() {
            return this.marka;
        }
        public double getPojemnosc() {
            return this.pojemnosc;
        }
        public void setPojemnosc(double pojemnosc) {
            this.pojemnosc = pojemnosc;
        }

        public String czyWysokoobrotowy(double wartosc){
            if (wartosc>=2.0)
                return "Wysokoobrotowy";
            else
                return "Niskoobrotowy";

        }

    public static void wyswietlOpis(Car auto){

        System.out.println("Marka tego samocodu to : " + auto.getMarka() );
        System.out.println("Kolor tego samocodu to : " + auto.getColor() );
        System.out.println("Ma silnik " + auto.czyWysokoobrotowy(auto.getPojemnosc()) +", gdyz jego pjemnosc wynosi : "+ auto.getPojemnosc() + "L" );
    }
}
