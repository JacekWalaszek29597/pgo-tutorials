public class Lion extends Feline {
    public Lion(boolean czySpi, boolean czyRyczy) {
        super(czySpi, czyRyczy);
    }
    @Override
    public void makeNoise(){
        System.out.println("WRRRRRRRR");
    }
}
