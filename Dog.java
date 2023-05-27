public class Dog extends Canine{
    public Dog(boolean czySpi, boolean czyRyczy) {
        super(czySpi, czyRyczy);
    }

    @Override
    public void makeNoise(){
        System.out.println("Hauuuu");
    }
}
