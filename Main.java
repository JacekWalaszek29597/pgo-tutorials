import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//-------------------------------- Zadanie 1 -----------------------------------------------------------
        User gosc1 = new User("s29597@pjwstk.edu.pl");
        User gosc2 = new User("kots@wp.pl");
        User user1 = new User("Jacek", "Walaszek","walaszek.jacek@gmail.com","12345");
        System.out.println(gosc1.getEmail() + " " +gosc1.getCzyGosc());
        System.out.println(gosc2.getEmail() + " " +gosc2.getCzyGosc());
        System.out.println(user1.getEmail() + " " +user1.getCzyGosc());
        gosc1.zmianaNaUzytkownika("Jacek", "Walaszek","12345");
        System.out.println(gosc1.getEmail() + " " +gosc1.getCzyGosc());
        System.out.println();
//-------------------------------- Zadanie 2 -----------------------------------------------------------
        Product product1 = new Product("dlugopis", 2.0, 1);
        Product product2 = new Product("segregator", 30.0, 11, 50);

        System.out.println(product1.Wyswitl());
        System.out.println(product2.Wyswitl());

        product1.zmianaCeny(3);
        product2.zmianaIloasc(10);

        System.out.println(product1.Wyswitl());
        System.out.println(product2.Wyswitl());
        System.out.println();
//-------------------------------- Zadanie 3 -----------------------------------------------------------

        Category biurowe = new Category("Biurowe:");
        biurowe.dodajProdukt(product1);
        biurowe.dodajProdukt(product2);

        List<Product> products = new ArrayList<>();
        products.add(new Product("Telewizor",10000.00,999));
        products.add(new Product("Tuner",100.00,99991));

        Category rtv = new Category("RTV",products);
        rtv.dodajProdukt(new Product("DVD",1000.00,999912));

        System.out.println(biurowe.getNazwaKategorii());
        for (Product product : biurowe.getProducts()) {
            System.out.println(product.Wyswitl());
        }

        System.out.println(rtv.getNazwaKategorii());
        for (Product product : rtv.getProducts()) {
            System.out.println(product.Wyswitl());
        }
    }
}
