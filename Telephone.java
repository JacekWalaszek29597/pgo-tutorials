public class Telephone {
    String marka;
    String model;
    double size;
    long numer;

    public Telephone(String marka, String model,  double size, int numer) {
        this.marka = marka;
        this.model = model;
        this.size = size;
        this.numer = numer;
    }

    public long getNumer() {
        return this.numer;
    }

    public static void wyslijSMS(String msg,long who){
        System.out.println(msg +" do "+ who);
    }

}
