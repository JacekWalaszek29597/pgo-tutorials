public class Canine extends Animal{
    public Canine(boolean czySpi, boolean czyRyczy) {
        super(czySpi, czyRyczy);
    }

    @Override
    public  void roam(){
        System.out.println("Psi");
    }
}
