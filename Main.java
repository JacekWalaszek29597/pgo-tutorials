public class Main {
    public static void main(String[] args) {

     //Zadanie 1
       Telephone nowyTelefon = new Telephone("Sony","Xperia 1 II",10.4,29597);
       Telephone.wyslijSMS("Moja wiadomosc", nowyTelefon.getNumer());
    //Zadanie 2
        Car samochod1 = new Car("Szary","Toyota",2.5);
        // Zadanie 3
        Car.wyswietlOpis(samochod1);



/*        // Tworzenie obiektu książki o zadanych atrybutach
        Book adventureBook = new Book("Adventure book", "Jan Nowak",
                1990, "ISDN-192", 20.0, 10);
        // Wyświetlenie informacji o autorze książki
        String author = adventureBook.getAuthor();
        System.out.println("Author of adventure book is: " + author);
        // Aktualizacja ceny książki i wyświetlenie obu cen przed i po zmianie
        double oldPrice = adventureBook.getPrice();
        System.out.println("Price of adventure book before update: " + oldPrice);
        adventureBook.setPrice(50.0);
        double newPrice = adventureBook.getPrice();
        System.out.println("Price of adventure book after update: " + newPrice);
        // Zakup 5 sztuk książki i wyświetlenie ceny zakupu
        int buyQuantity = 5;
        adventureBook.buy(buyQuantity);
        double buyPrice = buyQuantity * adventureBook.getPrice();
        System.out.println("Purchase of " + buyQuantity + " books spent " +
                buyPrice);*/
    }
}