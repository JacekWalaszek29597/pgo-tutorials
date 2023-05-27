public class Feline extends Animal{
    public Feline(boolean czySpi, boolean czyRyczy) {
        super(czySpi, czyRyczy);
    }

    @Override
    public  void roam(){
        System.out.println("Koci");
    }
}
