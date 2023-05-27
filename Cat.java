public class Cat extends Feline{
    public Cat(boolean czySpi, boolean czyRyczy) {
        super(czySpi, czyRyczy);
    }
    @Override
    public void makeNoise(){
            System.out.println("Miau");
        }
    }

