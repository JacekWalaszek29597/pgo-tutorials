public class Wolf extends Canine{
    public Wolf(boolean czySpi, boolean czyRyczy) {
        super(czySpi, czyRyczy);
    }

    @Override
    public void makeNoise(){
        System.out.println("Auuuuuu");
    }
}
