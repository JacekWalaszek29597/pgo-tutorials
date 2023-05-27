public class Animal {

    boolean czySpi;
    boolean czyRyczy;

    public Animal(boolean czySpi, boolean czyRyczy) {
        this.czySpi = czySpi;
        this.czyRyczy = czyRyczy;
    }

    public boolean sleep(){
        return czySpi = false;
    }

    public  void roam(){
        System.out.println("");
    }

    public void makeNoise(){
        System.out.println("Wrrrrr");
    }
}
